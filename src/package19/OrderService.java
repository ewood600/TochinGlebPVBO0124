package package19;

public class OrderService {

    public void placeOrder(Client client) {
        try {
            System.out.println("Начинаем оформление заказа для: " + client);

            INNCheck.validateINN(client);
            System.out.println("Заказ успешно оформлен!");

        } catch (InvalidException e) {
            System.err.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }


}