package Engine;

import java.io.*;
import java.net.*;


public class ServerSocketClass {

    public void ServerSocketStruct() throws IOException {
        ServerSocket server = new ServerSocket(8000, 2);
        Socket socket;
        socket = server.accept();
        System.out.println("подключился");
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String a = in.readLine();
        System.out.println("получил");
        out.write("блэа");
        out.flush();
        System.out.println("отправил");
        socket.close();
        server.close();


    }
}
