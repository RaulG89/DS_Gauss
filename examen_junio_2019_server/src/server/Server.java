package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void startServer() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Esperando peticiones en el puerto " + port + "...");

        String command;
        do {
            // Esperar una petición de un cliente
            Socket clientConnection = serverSocket.accept(); 

            BufferedReader fromClient = new BufferedReader(
                new InputStreamReader(clientConnection.getInputStream()));
            command = fromClient.readLine();

            if (command.equals("GET")) {
                Request request = parseRequest(fromClient);
                Response response = new Response(clientConnection);
                sendPage(request, response);
            }

            clientConnection.close();

        } while (!command.equals("SHUTDOWN"));

        System.err.println("Servidor apagado");
    }

    /**
     * Crea un objeto con los parámetros de la petición.
     * Para simplificar, no se hace validación de la entrada.
     * NO ES OBJETIVO de este ejercicio mejorar ni generalizar esta parte del protocolo.
     */
    private Request parseRequest(BufferedReader fromClient) throws IOException {
        String pageURL = fromClient.readLine();
        String user = fromClient.readLine();
        String clientIP = fromClient.readLine();

        return new Request(pageURL, user, clientIP);
    }

    /**
     * Devuelve la página que ha pedido el cliente.
     */
    private void sendPage(Request request, Response response) throws IOException {

        System.out.println("[Log Server] Petición recibida: " + request.toString());

        if (request.getPageURL().equals("index.html")) {
            response.send("Bienvenido a 'Computers'R Us'");

        } else if (request.getPageURL().equals("pedidos")) {
            response.send("Estos son los pedidos realizados por -> " + request.getUser());
            response.send("     - 5/19 Dell Inspiron");
            response.send("     - 3/19 Monitor Acer");

        } else {
            response.send("Error 404. Esta página no existe");
        }

    }

}
