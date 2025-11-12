package package2n1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Author Boris = new Author();
        Boris.setEmail("Hello Boris");
        System.out.println(Boris.getEmail());
        Shop shop = new Shop();
        shop.add("h37ehb");
        System.out.println(shop.search("h37ehb"));
        shop.remove("h37ehb");
        System.out.println(shop.search("h37ehb"));
    }

    public Main(String what) {
        what = "what";
    }
}