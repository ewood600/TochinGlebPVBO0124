package package8;

public class Unfold {
    public static int num(int n, int g){
        if (n%10 == 0){
            return g;
        }
        return num(n/10, g*10 + n%10);
    }
    public static void main(String[] args){
        System.out.println(num(12345, 0));
    }
}
