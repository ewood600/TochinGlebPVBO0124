package package13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shirt> shirts = new ArrayList<>();
        String[] shirt = new String[] {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL", "S007,White TShirt, White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        for (String a : shirt){
            String[] s = a.split(",");
            shirts.add(new Shirt(s[0], s[1], s[2], s[3]));
        }
        System.out.println(shirts);
    }
}
