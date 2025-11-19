package package18;

import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args){
        exceptionDemo();
    }
    public static void exceptionDemo() {
        int i = 1;
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            i = Integer.parseInt(intString);
            try{
                System.out.println( 2/i );
            } catch ( ArithmeticException e ) {
                System.out.println("Attempted division by zero");
            }
        } catch (Exception e){
            System.out.println("NaN entered");
        }
        finally {
            System.out.println("Code run");
        }


    }
}
