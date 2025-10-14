package package3;
import java.util.ArrayList;
import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            int rn = 10 + r.nextInt(89);
            a.add(rn);
        }
        int h = 0;
        StringBuilder s = new StringBuilder(a.get(0).toString());
        for (int j = 0; j <= 2; j++) {
            s.append(", ").append(a.get(j + 1).toString());
            if (a.get(j) >= a.get(j + 1)) {
                h = 1;
            }
        }
        System.out.println(s);
        if (h == 0){
            System.out.print("Последовательность строго возрастает");
        }
        else {
            System.out.print("Последовательность не возрастает строго");
        }
        System.out.println();
    }
}
