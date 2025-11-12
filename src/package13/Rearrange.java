package package13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Rearrange {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        try(FileReader reader = new FileReader("C:\\Users\\tochi\\IdeaProjects\\untitled2\\src\\package13\\notes.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                str1.append((char) c);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        String s = str1.toString();
        System.out.println(s);
        System.out.println(GetLine(s.split(" ")));
    }

    private static String GetLine(String[] s) {
        StringBuilder sb1 = new StringBuilder(s[0]);
        String lw = s[0];
        List<String> list = new ArrayList<>(Arrays.asList(s));
        list.remove(lw);
        while (!list.isEmpty()) {
            for (String s1 : list) {
                if (Character.toLowerCase(lw.charAt(lw.length() - 1)) == Character.toLowerCase(s1.charAt(0)) ) {
                    sb1.append(" ");
                    sb1.append(s1);
                    lw = s1;
                    list.remove(s1);
                    break;
                }
            }
        }
        return sb1.toString();
    }
}
