package package21;



public class Main {
    public static void main(String[] args) {
        Integer[] b = new Integer[] {1, 2, 3};
        Array<Integer> a = new Array<>(b);
        System.out.println(a.returnElem(1));
        String[] b1 = new String[] {"a", "b", "c"};
        Array<String> a1 = new Array<>(b1);
        System.out.println(a1.returnElem(1));
    }
}
