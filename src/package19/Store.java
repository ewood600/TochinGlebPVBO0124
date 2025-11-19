package package19;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        String INN = scanner.nextLine();
        System.out.println("Клиент");
        Client validClient = new Client(first, second, third, INN);
        orderService.placeOrder(validClient);
    }
}