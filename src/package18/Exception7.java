package package18;

import java.util.Objects;
import java.util.Scanner;

public class Exception7 {
    public static void main(String[] args) throws Exception {
        getKey();
    }
    public static void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private static String getDetails(String key) throws Exception {
        if(Objects.equals(key, "")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}

