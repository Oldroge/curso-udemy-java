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
    this.items.add(item);
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
}
