package Engine;

import java.io.*;
import java.net.*;


public class ServerSocketClass {
    public Socket socket;
    public Socket socket1;
    public BufferedReader in;
    public PrintWriter out;
    public void ServerSocketStruct() throws IOException {
        ServerSocket server = new ServerSocket(8000, 2);

        socket = server.accept();

        System.out.println("подключился");
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        socket1 = server.accept();
        System.out.println("подключился");
        BufferedReader secondIn = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
        PrintWriter secondOut = new PrintWriter(socket1.getOutputStream(), true);
        new GameStruct();
//        out.println("раз");
//        secondOut.println("два");
//        secondOut.println(in.readLine());

        socket.close();
        server.close();


    }
}
