/*
Nakul Kumar
Period 2 APCS-A
01-25-2023
Superhero Bake Sale

In the Money class, the User has an oppurtunity to double or nothing their cash!
*/

import java.util.Random;

public class Money {

  // -------------
  // PROPERTIES
  // -------------
  Random wager = new Random();
  // -------------
  // CONSTRUCTOR
  // -------------
  public Money(){
    
  }
  // -------------
  // METHODS
  // -------------
  
  //Put Money on the line!
  public int risk(int cash){
    int chance = wager.nextInt(1,4);
    if(chance == 1){
      System.out.println("\nYou have earned $ " + (cash * 2));
      return cash * 2;
    }
    else if(chance >= 2){
      System.out.println("\nYou have lost it all!");
      return 0;
    }
    return cash;
  }
  
  //GETTERS AND SETTERS

}