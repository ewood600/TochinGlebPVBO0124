package package11;

import java.util.*;
import java.text.SimpleDateFormat;

public class DateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для создания даты:");
        System.out.print("Год: "); int year = scanner.nextInt();
        System.out.print("Месяц: "); int month = scanner.nextInt();
        System.out.print("Число: "); int day = scanner.nextInt();
        System.out.print("Часы: "); int hours = scanner.nextInt();
        System.out.print("Минуты: "); int minutes = scanner.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day, hours, minutes);
        Date date = cal.getTime();
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println(fmt.format(date));
    }
}
