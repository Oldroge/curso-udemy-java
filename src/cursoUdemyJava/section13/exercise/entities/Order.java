package cursoUdemyJava.section13.exercise.entities;

import java.time.LocalDate;
import cursoUdemyJava.section13.exercise.entities.utils.OrderStatus;

public class Order {
  private LocalDate moment;
  private OrderStatus status;
  private Client client;
  private OrderItem items;


  public Order() {}


  public Order(LocalDate moment, OrderStatus status, Client client, OrderItem items) {
    this.moment = moment;
    this.status = status;
    this.client = client;
    this.items = items;
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

  public OrderItem getItems() {
    return items;
  }

  public void setItems(OrderItem items) {
    this.items = items;
  }



}
