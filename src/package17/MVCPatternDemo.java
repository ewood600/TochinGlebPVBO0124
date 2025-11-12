package package17;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
    }
    public static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Gleb");
        student.setRollNo("er");
        return student;
    }
}
