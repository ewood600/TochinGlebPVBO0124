package package13;

public class ILikeJava {
    void Check(String s){
        System.out.println(s.charAt(s.length()-1));
        if (s.endsWith("!!!")){
            System.out.println("yes");
        }
        if (s.startsWith("I like")){
            System.out.println("yes");
        }
        if (s.contains("Java")){
            System.out.println("yes");
        }
        System.out.println();
    }
}
