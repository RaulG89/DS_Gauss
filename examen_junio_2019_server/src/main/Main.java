/**
 * # NOTA: El código entregado es el mínimo necesario para entender el ejercicio
 * y NUNCA debería ser tomado como un ejemplo del tratamiento adecuado de excepciones,
 * asertos y tests. Todo lo anterior, que debería hacerse en un programa real, se ha
 * omitido a propósito para simplificar el planteamiento del ejercicio.
 */

package main;

import server.*;

public class Main {
    static final int SERVER_PORT = 3000;

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private void run() throws Exception {
        runOriginal();
        //    	runRedesigned();
        //    	run1();
        //    	run2();
        //    	run3();
        //    	run4();
    }

    private void runOriginal() throws Exception {
        System.out.println("Ejecutando el servidor original...");
        Server server = new Server(SERVER_PORT);
        server.startServer();
    }

//    private void runRedesigned() throws Exception {
//        System.out.println("Ejecutando el servidor tras el rediseño...");
//        // TODO ...
//    }
//
//    private void run1() throws Exception {
//        System.out.println("Ejecutando el servidor con la ampliación 1...");
//        // TODO ...
//    }
//
//    private void run2() throws Exception {
//        System.out.println("Ejecutando el servidor con la ampliación 2...");
//        // TODO ...
//    }
//
//    private void run3() throws Exception {
//        System.out.println("Ejecutando el servidor con la ampliación 3...");
//        // TODO ...
//    }
//
//    private void run4() throws Exception {
//        System.out.println("Ejecutando el servidor con la ampliación 4...");
//        // TODO ...
//    }
}
