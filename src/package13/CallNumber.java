package package13;

public class CallNumber {

    private static String NumberReform(String number){
        return  number.substring(0, number.length()-7) + "-"
                + number.substring(number.length()-7, number.length()-4) + "-"
                + number.substring(number.length()-4);
    }

    public static void main(String[] args){
        System.out.println(NumberReform("+109164812833"));
    }
}
