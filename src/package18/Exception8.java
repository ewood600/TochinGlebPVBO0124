package package18;

import java.util.Objects;
import java.util.Scanner;

public class Exception8 {
    public static void main(String[] args) throws Exception {
        getKey();
    }
    public static void getKey(){
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();

        try {
            printDetails( key );
        }
        catch ( Exception e ) {
            System.out.println("Key set to empty string" );
            System.out.println("Please try again");
            getKey();
        }

    }
    public static void printDetails(String key){
        String message = getDetails(key);
        System.out.println( message );
    }
    private static String getDetails(String key) {
        return "data for " + key; }
}

