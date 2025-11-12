package package7;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args){
        MathFunc m = new MathFunc();
        int r = 3;
        System.out.println(m.PI()*2*r);
        System.out.println(m.mod_i(3, 4));
        System.out.println(m.times(3, 4, 2));
    }
}
