package package18;

import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args){
        printMessage("abc");
    }
    public static void printMessage(String key) {
        String message = getDetails(key);
        try {
            System.out.println(message);
        } catch (Exception e){
            System.out.println("null key");
        }
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key" );
        }
        return key;
    }
}

