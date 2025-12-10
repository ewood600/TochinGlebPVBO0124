package package21;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ToList {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\tochi\\IdeaProjects\\untitled2\\src\\package21");
        String[] catalogue = {"A", "B", "C", "D", "F"};
        ArrayList<File> lst = new ArrayList<>();
        for (String s1: catalogue){
            File file = new File(dir, s1);
            lst.add(file);
        }
        for (File s: lst){
            System.out.println(s);
        }
    }
}
