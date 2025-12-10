package package22;

import java.util.Objects;
import java.util.Stack;

import static java.lang.Float.parseFloat;



public class RPNCalc {
    public static void main(String[] args) {
        Calculate("2 3 + *");
        Calculate("2 3 * 4 5 * +");
        Calculate("2 3 4 5 6 * + - /");
    }
    private static void Calculate(String s){
        boolean flag = true;
        String[] sk = s.split(" ");
        Stack<Float> g= new Stack<>();
        for (String v : sk){
            float a = 1;
            float b = 1;
            if (Objects.equals(v, "+")){
                try {
                    a = g.pop();
                    b = g.pop();
                }catch (Exception e){
                    System.out.println("Too many actions");
                    flag = false;
                }
                g.push(a+b);
            }
            else if (Objects.equals(v, "-")){
                try {
                    a = g.pop();
                    b = g.pop();
                }catch (Exception e){
                    System.out.println("Too many actions");
                    flag = false;
                }
                g.push(b-a);
            }
            else if (Objects.equals(v, "*")){
                try {
                    a = g.pop();
                    b = g.pop();
                }catch (Exception e){
                    System.out.println("Too many actions");
                    flag = false;
                }
                g.push(a*b);
            }
            else if (Objects.equals(v, "/")){
                try {
                    a = g.pop();
                    b = g.pop();
                }catch (Exception e){
                    System.out.println("Too many actions");
                    flag = false;
                }
                try {
                    g.push(b/a);
                }catch (Exception e){
                    System.out.println("Attempted division by zero");
                    flag = false;
                }
            }
            else {
                try{
                    g.push(parseFloat(v));
                }catch (Exception e){
                    System.out.println("Invalid input");
                    flag = false;
                }
            }
        }
        if (flag){
            System.out.println(g.pop());
        }
    }
}
