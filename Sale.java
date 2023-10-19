/*
Nakul Kumar
Period 2 APCS-A
01-03-2023
Superhero Bake Sale

In the Sale class, the cake selling process is organized and the specific types and parameters are declared here. All Heroes, Customers, and Cakes can be accessed here. 
*/

import java.util.*;
public class Sale{
  //-------------
  //PROPERTIES
  //-------------
  // Sale tracking properties
  private String name;
  private int cashRaised;
  
  // Cakes for sale
  private Cake k1 = new Cake(1,5,"chocolate cake");
  private Cake k2 = new Cake(2,24,"fruit cake");
  private Cake k3 = new Cake(3,10,"plain cake");
  public Cake[] cakes = {k1, k2, k3};

  // Heros to bake them
  private Hero h1 = new Hero("Batman","I am veng-tables", 0, 100);
  private Hero h2 = new Hero("Superman");
  public Hero h3 = new Hero("Me"); //The player
  public Hero[] heroes = {h1, h2, h3};

  // Customers to buy them
  private Customer c1 = new Customer("Gordon", 10000);
  private Customer c2 = new Customer("Alex");
  private Customer c3 = new Customer("Steve");
  private Customer c4 = new Customer("John");
  private Customer c5 = new Customer("Gus");
  public Customer[] customers = {c1, c2, c3, c4, c5};

  Random review = new Random();

  //-------------
  //CONSTRUCTOR
  //-------------
  public Sale(){
    intro();
  }
  public Sale(String name){
    this.name = name;
    intro();
  }
  
  //-------------
  //METHODS
  //-------------

  // Allows The User to access their hero in Main
  public Hero myHero(String name){
    h3.resetStats();
    h3.setName(name); 
    return h3;
    //Method cannot add more Players for the User to control. 
  }

  // Gets the Seller, Buyer, and Cake to initiate purchase
  public void sellCake(String heroName, String customerName, int cakeId, boolean rate){
    Customer c = getCustomerByName(customerName);
    Cake k = getCakeById(cakeId);
    Hero h = getHeroByName(heroName);
    showTransaction(h, c, k, rate);
  }

  //Self-explanatory
  public Hero getHeroByName(String name){
    // Loop checks every customer to find name
    for(int i = 0; i < heroes.length; i++){
      if(name == heroes[i].getName()){
        return heroes[i];
      }
    }
    return h1;
  }
  
  public Customer getCustomerByName(String name){
    // Loop checks every customer to find name
    for(int i = 0; i < customers.length; i++){
      if(name == customers[i].getName()){
        return customers[i];
      }
    }
    System.out.println("\n" + name + " cut the line!");
    return c1; //Name doesn't exist so give it to the rich guy
  }

  public Cake getCakeById(int id){
    // Loop checks every cake to find id
    for(int i = 0; i < cakes.length; i++){
      if(id == cakes[i].getId()){
        return cakes[i];
      }
    }
    return k1;
  }

  // Displays transaction info
  private void showTransaction(Hero h, Customer c, Cake k, boolean rate){
    System.out.println("\n" + c.getName() + " is buying the cake: #" + k.getId());
    System.out.println("The cake price is: $" + k.getPrice());
    Order o = new Order(h,c,k);
    //Customer doesn't have enough money to pay
    if(c.getCash() < k.getPrice()){ 
      System.out.println(c.getName() + " did not have enough money to buy cake #" + k.getId());
    }
    //Sells the cake
    else if (h.getStock() >= 1){ // There needs to be a cake to sell a cake
      //Hero successfully sells cake
      h.setStock(h.getStock() - 1);
      h.setCash(h.getCash() + k.getPrice()); //Hero making money
      c.setCash(c.getCash() - k.getPrice()); //Customer losing money
      
      System.out.println("The sale has now raised: $" + h.getCash());
      System.out.println(c.getName() + " now has $" + c.getCash());
      System.out.println(c.getName() + " now has a " + k.getType());
      if (rate == true){
        o.feedback(); //Determines Hero's prestige
      }
      else{
        h.setPrestige(h.getPrestige() + 1);
      }
    }
    //Hero tried to sell a cake, without baking a cake!!!
    else{
      System.out.println(h.getName() + " got caught trying to sell no cakes!");
      h.setPrestige(h.getPrestige() - 5); //Bad for prestige!
    }
  }

  //Something
  private void view(Object o){
    System.out.println(o);
  }
  //Intro statements of the sale
  private void intro(){
    System.out.println("\n----------------------------");
    System.out.println("welcome to the sale: " + this.name);
    System.out.println("----------------------------");  
  }

  //GETTERS AND SETTERS
  public String getName() {
	 return name;
  }
  public void setName(String name) {
  	this.name = name;
  }
  public int getCash() {
  	return cashRaised;
  }
  public void setCash(int cashRaised) {
  	this.cashRaised = cashRaised;
  }
  //Used to choose an available option
  public int numOfCakes(){
    return cakes.length + 1;
  }
  public int numOfCustomers(){
    return customers.length + 1;
  }

}