/*
Nakul Kumar
Period 2 APCS-A
01-03-2023
Superhero Bake Sale

In the Customer class, a Customer person is created to buy a cake and review it.
*/

public class Customer {
  //-------------
  //PROPERTIES
  //-------------
  private String name;
  private int cash;
  private int orders;

  //-------------
  //CONSTRUCTOR
  //-------------
  
  public Customer(String name) {
    this.name = name;
    this.cash = 100;
    this.orders = 0;
  }
  public Customer(String name, int cash) {
    this.name = name;
    this.cash = cash;
    this.orders = 0;
  }
  
  //-------------
  //METHODS
  //-------------
  
  //GETTERS AND SETTERS
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }
  
  public int getOrders() {
    return orders;
  }

  public void setOrders(int orders) {
    this.orders = orders;
  }
}