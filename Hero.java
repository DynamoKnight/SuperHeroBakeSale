/*
Nakul Kumar
Period 2 APCS-A
01-03-2023
Superhero Bake Sale

In the Hero class, it consists of several properties to help perfect the Cake. The Hero can also do some methods to get more cash or prestige. 
*/

import java.util.Random;

public class Hero {

  // -------------
  // PROPERTIES
  // -------------
  private String name;
  private String catchphrase;
  private int skill;
  private int cash;
  private int stock;
  private int prestige;

  // -------------
  // CONSTRUCTOR
  // -------------
  public Hero(String name) {
    this.name = name;
    this.catchphrase = "I am here to save the day!";
    this.skill = 0;
    this.cash = 0;
    this.stock = 0;
    this.prestige = 0;
  }

  public Hero(String name, String catchphrase, int skill, int cash) {
    this.name = name;
    this.catchphrase = catchphrase;
    this.skill = skill;
    this.cash = cash;
    this.stock = 0;
    this.prestige = 0;

  }

  // -------------
  // METHODS
  // -------------

  // Restart to the beginning
  public void resetStats(){
    this.catchphrase = "I am here to save the day!";
    this.skill = 0;
    this.cash = 0;
    this.stock = 0;
    this.prestige = 0;
  }
  // Increases stock by 1 cake
  public void bakeCake() {
    stock += 1;
    skill += 1;
  }

  // Donations earn prestige
  public void donate(Sale s) {
    if (stock >= 1) {
      stock--;
      prestige += 1;
      System.out.println("\n" + name + " has donated to the cause!");
    }
    else{
      System.out.println("\nYou had no cake to donate.");
    }
  }

  // A changed and better person
  public void printBio(boolean b) {
    System.out.println("\n--SELLER BIO--------------");
    if(b == true){
      System.out.println(catchphrase);
    }
    System.out.println("Name: " + name);
    System.out.println("Baking skill: " + skill);
    System.out.println("Prestige: " + prestige);
    if(b == true){
      System.out.println("Balance: $" + cash);
      System.out.println("Current Stock: " + stock);
    }
  }

  // GETTERS AND SETTERS
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCatchphrase() {
    return catchphrase;
  }

  public void setCatchphrase(String catchphrase) {
    this.catchphrase = catchphrase;
  }

  public int getSkill() {
    return skill;
  }

  public void setSkill(int skill) {
    this.skill = skill;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public int getPrestige() {
    return prestige;
  }

  public void setPrestige(int prestige) {
    this.prestige = prestige;
  }
}