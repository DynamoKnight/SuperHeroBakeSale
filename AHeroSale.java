/*
Nakul Kumar
Period 2 APCS-A
01-03-2023
Superhero Bake Sale

In the AHeroSale class, It gets Scanner user input and uses Selection to make a choice of the Hero who is in the Sale. 
*/
import java.util.Scanner;
import java.util.Random;
public class AHeroSale{

  //PROPERTIES
  //Colors strings!
  // "\u001B" is an Escape character, "1;" means Bold, and "31m" is color
  final String RESET = "\u001B[0;0m"; 
  final String RED = "\u001B[1;31m";
  final String BLUE = "\u001B[0;34m";
  private Scanner user;
  private Random rand = new Random();
  private Money m = new Money();
  private Hero superHero;
  private Sale bakeSale;

  String[] people = {"John","Kunal","BillyBobJoe","Alex","Wonder Woman","Steve","Gus"};
  
  //CONSTRUCTOR
  public AHeroSale(Scanner user, Hero superHero, Sale bakeSale){
    this.user = user;
    this.superHero = superHero;
    this.bakeSale = bakeSale;
    System.out.println("\nBatman and Superman have constantly been fighting in this years 🎂SuperHero Bake Sale!🎂 Can Spiderman save the day?");
  }

  public boolean playGame(){
      System.out.print(BLUE + "\n-What do you want to do- \n1) Bake a Cake \n2) Donate a Cake \n3) Sell a Cake \n4) Print Current Bio \n5) Get more Money \n6) Pack up and leave \n\n" + RED + "Spiderman: " + RESET);
      int choice = user.nextInt();
      
      if(choice == 1){
        superHero.bakeCake(); // Increases stock
        System.out.println("\nCake stock has increased by 1");
      }
      else if(choice == 2){
        // Generous Donation
        superHero.donate(bakeSale); // Only increases skill and prestige, customer doesn't need to be specified.
      }
      else if(choice == 3){
        //Spiderman needs to be in a Sale to sell a cake. He can donate cakes on his own freetime, but can't sell through himself.
        int cakeId = rand.nextInt(0,bakeSale.numOfCakes());
        int randC = rand.nextInt(0,people.length);
        bakeSale.sellCake("Peter", people[randC], cakeId, true); //Should be random customer
      }
      else if(choice == 4){
        superHero.printBio(true);
      }
      else if(choice == 5){
        //$$$
        System.out.print("\nHow much will you risk?: ");
        int cash = user.nextInt();
        //If you have enough
        if(cash <= superHero.getCash()){
          superHero.setCash(superHero.getCash() - cash);
          cash = m.risk(cash);
          superHero.setCash(superHero.getCash() + cash);
        }
        //Overbid
        else{
          System.out.println("Get Money!");
        }
        
      }
      else{
        return false;
      }
      return true;
    }
}