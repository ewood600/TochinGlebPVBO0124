package package8;

import java.util.Arrays;

public class Palindrome {
    public static String Check(String p){
        if (p.length() > 1){
            char[] t = p.toCharArray();
            if (t[0] == t[t.length-1]){
                StringBuilder b = new StringBuilder();
                for (int i = 1; i < t.length-1; i++){
                    b.append(t[i]);
                }
                return Check(String.valueOf(b));
            }
            else{
                return "NO";
            }
        }
        else {
            return "YES";
        }
    }
    public static void main(String[] args){
        System.out.println(Check("cvnbnvc"));
    }
}
