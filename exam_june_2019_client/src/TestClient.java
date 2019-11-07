
/**
 * # NOTA: El código entregado es el mínimo necesario para entender el ejercicio
 * y NUNCA debería ser tomado como un ejemplo del tratamiento adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha
 * omitido a propósito para simplificar el planteamiento del ejercicio.
 */

import java.net.*;
import java.io.*;

public class TestClient {
    private String serverIP;
    private int port;

    public TestClient(String serverIP, int port) {
        this.serverIP = serverIP;
        this.port = port;
    }

    /** ------------------------------------------------------------------
     * $ Pedir una página al servidor
     */
    public void getPage(String url, String user) throws Exception {

        Socket serverConnection = new Socket(serverIP, port);

        // Enviar petición: nombre de la página, usuario que la pide e IP
        PrintWriter toServer = new PrintWriter(serverConnection.getOutputStream(), true);
        toServer.println("GET");
        toServer.println(url);
        toServer.println(user);
        toServer.println(Inet4Address.getLocalHost()); // Dirección IP del cliente

        // Esperar respuesta con la página solicitada
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(serverConnection.getInputStream()));
        String line;
        System.out.println("\n[Log Cliente] Recibida página: " + url);
        while ((line = fromServer.readLine()) != null)
            System.out.println("\t| " + line);

        serverConnection.close();
    }

    /** ------------------------------------------------------------------
     * $ Apagar el servidor
     */
    public void shutdownServer() throws Exception {
        Socket serverConnection = new Socket(serverIP, port);
        new PrintWriter(serverConnection.getOutputStream(), true).println("SHUTDOWN");
        serverConnection.close();
    }

}
