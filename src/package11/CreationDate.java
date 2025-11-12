package package11;
import java.util.Date;

public class CreationDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("фамилия разработчика: Точин");
        System.out.println("дата и время получения задания: " + currentDate);
        Date submissionDate = new Date();
        System.out.println("дата и время сдачи задания: " + submissionDate);
    }
}