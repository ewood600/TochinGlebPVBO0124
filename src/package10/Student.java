package package10;


public class Student {
    public String name;
    public String second_name;
    public int course;
    public String specialization;
    public String group;
    public double GPA;

    public Student() {
    }

    public Student(String name, String second_name, int course, String specialization, String group, double GPA) {
        this.name = name;
        this.second_name = second_name;
        this.course = course;
        this.specialization = specialization;
        this.group = group;
        this.GPA = GPA;
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
