import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the supermarket!" );
    System.out.println("What would you like to buy?");
    
    int apples = 5;
    double money = 20.0;
    double appleprice = 3.5;
    boolean bought = false;
      
    System.out.println("We have " + apples + " apples. They each cost $3.50. Would you like to buy one?");
    Scanner decision = new Scanner(System.in);
    String decision1 = decision.nextLine();
    System.out.println("You have said " + decision1 + ". Let's buy one apple.");
    bought = true;
    money = money - appleprice;
    System.out.println("You now have $" + money);
    apples -= 1;
    System.out.println("There are now " + apples + " apples");
    
    int bananas = 10;
    int ppp = 2; // price per pound
    double ppp1 = Double.valueOf(ppp);
      
    System.out.println("We also have " + bananas + " pounds of bananas. It is $2 per pound. Would you like to buy a pound?");
    String decision2 = decision.nextLine();
    System.out.println("You have said " + decision2 + ". Let's buy a pound of bananas.");
    money = money - ppp1;
    System.out.println("You now have $" + money);
    bananas -= 1;
    System.out.println("There are now " + bananas + " pounds of bananas");
  }
}
