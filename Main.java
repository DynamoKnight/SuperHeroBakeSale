/*
Nakul Kumar
Period 2 APCS-A
01-03-2023
Superhero Bake Sale

In the Main class, it is where everything is called and launched, initializing the Bake Sale. The User is able to control Spiderman who is competing against Batman and Superman in the Bake Sale. 

   The Full BakeSale game, although only having two new classes, has many updates internally within the pre-existing classes. The game can be played with User Input, which allows them to choose several decisions for the BakeSale. 
   As they make cakes, their skill and stock increases. Donating gains prestige, while Selling is more risky. By Selling cakes, the money and prestige can go up, but if the skill is low then prestige goes down. It is a fairily simple game. Additionally, the user can make money by betting money for double or nothing. Money doesn't do anything for now...

TEST CASES: They sort of work, but I have added Customer Feedback during the transaction and I've added Hero Balance and Catchphrase to the Hero's bio.
*/
import java.util.*;

class Main {
  public static void main(String[] args) {
    Sale s = new Sale("SHBS");
    Hero spiderMan = s.myHero("Peter");
    Scanner user = new Scanner(System.in);

    //TEST CASES
    //3rd test fails because cake isn't plain cake
    spiderMan.bakeCake();
    s.sellCake("Peter","Steve", 3, false);
    spiderMan.printBio(false);
    spiderMan.bakeCake();
    s.sellCake("Peter","Steve", 1, false);
    spiderMan.printBio(false);
    
    //Be able to play Bakesale
    AHeroSale c = new AHeroSale(user,spiderMan,s);
    
    boolean game = true;
    while(game){
      game = c.playGame();
    }
    
    
  }
}