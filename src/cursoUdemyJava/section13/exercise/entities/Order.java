package cursoUdemyJava.section13.exercise.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import cursoUdemyJava.section13.exercise.entities.utils.OrderStatus;

public class Order {
  private LocalDate moment;
  private OrderStatus status;
  private Client client;
  private List<OrderItem> items = new ArrayList<>();


  public Order() {}


  public Order(LocalDate moment, OrderStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
  }

  public LocalDate getMoment() {
    return moment;
  }

  public void setMoment(LocalDate moment) {
    this.moment = moment;
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

  public List<OrderItem> getItems() {
    return items;
  }

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public void removeItem(OrderItem item) {
    this.items.remove(item);
  }

  public double total() {
    double sum = 0;
    for (OrderItem item : this.items) {
      sum += item.subTotal();
    }
    return sum;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: " + this.getMoment() + "\n");
    sb.append("Order status: " + this.getStatus() + "\n");
    sb.append("Client: " + this.getClient().getName() + " " + this.getClient().getBirthDate()
        + " - " + this.getClient().getEmail() + "\n");
    sb.append("Order items:" + "\n");
    for (OrderItem item : this.items) {

      System.out.println(item.getProduct().getName());
      sb.append(item.getProduct().getName() + ", " + item.getProduct().getPrice() + ", Quantity: "
          + item.getQuantity() + ", Subtotal: $" + item.getProduct().getPrice() + "\n");
    }

    sb.append("Total price: $" + this.total());


    return sb.toString();
  }
}
