/*
Nakul Kumar
Period 2 APCS-A
01-03-2023
Superhero Bake Sale

In the Cake class, it is primarily to get the specific type of cake to sell
*/

public class Cake {

  // -------------
  // PROPERTIES
  // -------------
  private int id;
  private int price;
  private String type;

  // -------------
  // CONSTRUCTOR
  // -------------
  public Cake() {

  }

  public Cake(int id, int price, String type) {
    this.id = id;
    this.price = price;
    this.type = type;
  }
  // -------------
  // METHODS
  // -------------

  // GETTERS AND SETTERS
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}