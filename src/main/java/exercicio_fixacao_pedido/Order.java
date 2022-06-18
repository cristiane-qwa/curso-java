package exercicio_fixacao_pedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    private SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    public Order(Date date, OrderStatus status, Client client, List<OrderItem> orderItems) {
        this.date = date;
        this.status = status;
        this.client = client;
        this.orderItems = orderItems;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }
    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }
    public Double total() {
        Double total = 0.0;
        for (OrderItem item : orderItems) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY:" );
        stringBuilder.append("\nOrder moment: " + sdf1.format(date));
        stringBuilder.append("\nOrder status: " + status);
        stringBuilder.append("\nClient: " + client.getName() + " " + sdf2.format(client.getBirthDate()) + " " + client.getEmail());
        stringBuilder.append("\norder items: \n");
        for(OrderItem item : orderItems) {
            stringBuilder.append(item.getProduct().getName() +" R$ "+ String.format("%.2f",item.getPrice()) + ", Quantity: " + item.getQuantity() + ", Subtotal: R$ " + String.format("%.2f", item.subTotal()) + '\n');
        }
        stringBuilder.append("Total price: R$ " + String.format("%.2f",total()));
        return stringBuilder.toString();



    }
}
