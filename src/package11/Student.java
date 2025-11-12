package package11;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
    public String name;
    public String second_name;
    public int course;
    public String specialization;
    public String group;
    public double GPA;
    public Date birthday;

    public Student() {
    }

    public Student(String name, String second_name, int course, String specialization, String group, double GPA, Date birthday) {
        this.name = name;
        this.second_name = second_name;
        this.course = course;
        this.specialization = specialization;
        this.group = group;
        this.GPA = GPA;
        this.birthday = birthday;
    }

    public String toString(String format) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d ");
        if (format.equals("short")){
            return name + " " + second_name + "\n" +
                    "Курс: " + course + "\n" +
                    specialization + "\n" +
                    group + "\n" +
                    "Средний балл" + GPA + "\n" +
                    "Дата рождения" + dateFormatter.format(birthday);
        }
        else if (format.equals("long")){
            dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
            return name + " " + second_name + "\n" +
                    "Курс: " + course + "\n" +
                    specialization + "\n" +
                    group + "\n" +
                    "Средний балл" + GPA + "\n" +
                    "Дата рождения" + dateFormatter.format(birthday);
        }
        else{
            dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
            return name + " " + second_name + "\n" +
                    "Курс: " + course + "\n" +
                    specialization + "\n" +
                    group + "\n" +
                    "Средний балл" + GPA + "\n" +
                    "Дата рождения" + dateFormatter.format(birthday);

        }
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
