package package13;

public class Person {
    public String FIO(String name1, String name2, String name3){
        if (name2.isEmpty() && name3.isEmpty()){
            return name1;
        }
        else if (name2.isEmpty()){
            return name1 + name3.charAt(0);
        }
        else if (name3.isEmpty()){
            return name1 + name2.charAt(0);
        }
        return name1 + name2.charAt(0) + name3.charAt(0);
    }
}
