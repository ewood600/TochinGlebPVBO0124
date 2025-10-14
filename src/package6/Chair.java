package package6;

public class Chair implements Pricable{
    public int price = 15;
    @Override
    public int getPrice() {
        return price;
    }
}
