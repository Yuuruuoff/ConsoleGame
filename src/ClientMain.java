import java.io.*;
import java.net.Socket;

public class ClientMain {
    public static Socket socket;

    public static void main(String[] args) throws IOException {
        try {
            socket = new Socket("localhost", 8000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println(in.readLine());
        out.println("попытка раз");


        socket.close();


    }
}
