package package6;

public class Toy implements Pricable{
    public int price = 7;
    @Override
    public int getPrice() {
        return price;
    }
}
