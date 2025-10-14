package package8;

import java.util.Scanner;

public class Count {
    public static int coun(String s, int c, int point){
        char[] r = s.toCharArray();
        if (point > 0){
            if ((r[point-1] == '0') && (r[point] == '0')){
                return c;
            }
        }
        int y = 0;
        if (r[point] == '1'){
            y = 1;
        }
        return coun(s, c + y, point+1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(coun(scanner.nextLine(), 0, 0));
    }
}
