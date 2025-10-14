package package3;


import java.time.Duration;

public class Obol {
    public static void main(String[] args) {
        String s = "10.23";
        Double d = Double.valueOf(s);
        double d2 = Double.parseDouble(s);
        Integer i = d.intValue();
        String s2 = d.toString();
        Float f = d.floatValue();
        System.out.println(d);
        String s3 = Double.toString(d);
    }
}
