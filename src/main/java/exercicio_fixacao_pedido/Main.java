package exercicio_fixacao_pedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<OrderItem> orderItemList = new ArrayList<>();

        Client client = new Client("Anna", "anna@email", sdf.parse("22/06/1991"));
        Product product = new Product("caneta", 0.80);
        OrderItem orderItem = new OrderItem(10, 0.80, product);
        orderItemList.add(orderItem);
        Order order = new Order(new Date(), OrderStatus.PROCESSING, client, orderItemList);

        System.out.println(order);
    }
}
