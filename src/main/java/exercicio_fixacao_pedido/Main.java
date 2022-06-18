package exercicio_fixacao_pedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<OrderItem> orderItemList = new ArrayList<>();

        Client client = new Client("Anna", "anna@email", sdf.parse("22/06/1991"));
        Product product1 = new Product("TV", 1000.00);
        Product product2 = new Product("Mouse", 40.00);
        OrderItem orderItem = new OrderItem(1, product1.getPrice(), product1);
        OrderItem orderItem2 = new OrderItem(2, product2.getPrice(), product2);
        orderItemList.add(orderItem);
        orderItemList.add(orderItem2);
        Order order = new Order(new Date(), OrderStatus.PROCESSING, client, orderItemList);

        System.out.println(order);
    }
}
