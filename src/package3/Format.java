package package3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
        NumberFormat nus = NumberFormat.getInstance(Locale.US);
        NumberFormat nja = NumberFormat.getInstance(Locale.JAPAN);
        NumberFormat nch = NumberFormat.getInstance(Locale.CHINA);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для обозначения начальной валюты: 1 - ен, 2 -доллары, 3 - юань");
        String f = scanner.nextLine();
        if (Objects.equals(f, "1") || Objects.equals(f, "2") ||  Objects.equals(f, "3")){
            System.out.println("Введите количество валюты");
            String p = scanner.nextLine();
            double d = Double.parseDouble(p);
            System.out.println("Введите число для обозначения конечной валюты: 1 - ен, 2 -доллары, 3 - юань");
            String j = scanner.nextLine();
            if (Objects.equals(f, "2")){
                d = d*20.82;
            }
            else if (Objects.equals(f, "3")){
                d = d*148.27;
            }
            if (Objects.equals(j, "2")){
                d = d/20.82;
                System.out.println(nus.format(d));
            }
            else if(Objects.equals(j, "3")){
                d = d/148.27;
                System.out.println(nch.format(d));
            }
            else{
                System.out.println(nja.format(d));
            }
        }
    }
}
