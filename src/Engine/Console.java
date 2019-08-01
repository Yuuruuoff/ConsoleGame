package Engine;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Console {
    private static FileWriter writer;

    static {
        try {
            writer = new FileWriter(new File(PropertiesReader.getPropertyAsString("file.logging")));
        } catch (IOException e) {
            System.err.println("Unable to initialize writer");
        }
    }
    private static ServerSocketClass serverSocketClass = new ServerSocketClass();
    public static Scanner sc = new Scanner(System.in);

    public static String readLoweredString(){
        return sc.next().toLowerCase();
    }

    public static String readUpperString(){
        return sc.next().toUpperCase();
    }

    public static void formattedOutput(String s) {

        String output = new Date() + " : " + s;
        serverSocketClass.out.println(output);
        System.out.println(output);
        try {
            writer.append(output).append("\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Unable to write");
        }
    }

    public static void breakLine(){
        System.out.println();
    }
}
