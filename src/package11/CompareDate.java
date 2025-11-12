package package11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class CompareDate {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date cDate = new Date();
        System.out.println("текущая дата: " + dateFormat.format(cDate));
        System.out.print("введите дату в формате dd.MM.yyyy: ");
        String uInput = scanner.nextLine();
        Date uDate = dateFormat.parse(uInput);
        System.out.println("Введенная дата: " + dateFormat.format(uDate));
        if (uDate.equals(cDate)) {
            System.out.println("даты совпадают");
        } else if (uDate.before(cDate)) {
            System.out.println("введенная дата раньше текущей");
        } else {
            System.out.println("введенная дата позже текущей");
        }
    }
}