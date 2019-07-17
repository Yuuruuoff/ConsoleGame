package Engine;
import java.util.Date;
import java.util.Scanner;

public class Console {


    public static Scanner sc = new Scanner(System.in);

    public static String readLoweredString(){
        return sc.next().toLowerCase();
    }

    public static void formattedOutput(String s) {
        System.out.println(new Date() + " : " + s);

//        System.out.println();
    }

    public static void breakLine(){
        System.out.println();
    }
}
