/*
Nakul Kumar
Period 2 APCS-A
01-23-2023
Superhero Bake Sale

In the Order Class, It does the process of selling a cake. It gets a random rating based on the skill of the Hero. A Customer also gets more orders by making an order.
*/
import java.util.*;
public class Order{
  //-------------
  //PROPERTIES
  //-------------
  private int rating;
  private Hero h;
  private Customer c;
  private Cake k;
  Random review = new Random();
  
  //-------------
  //CONSTRUCTOR
  //-------------
  public Order(Hero h, Customer c, Cake k){
    this.h = h;
    this.c = c;
    this.k = k;
  }
  
  //-------------
  //METHODS
  //-------------
  public void feedback(){
     //Gets Customer Feedback
      c.setOrders(c.getOrders() + 1);
      int rating = h.getSkill() * review.nextInt(1,5) + 30; //Random rating based on skill
    
      if(rating > 50){ //Good cake
        System.out.println(c.getName() + " liked the cake :)");
        h.setPrestige(h.getPrestige() + 2);
      }
      else{ //Mid cake
        System.out.println(c.getName() + " did not like the cake :(");
        h.setPrestige(h.getPrestige() - 1);
      }
  }
  
  //GETTERS AND SETTERS
  public int getRating(){
    return rating;
  }
  
  public void setRating(int rating){
    this.rating = rating;
  }
}