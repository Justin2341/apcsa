import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Foodlist f = new Foodlist("apples", "bananas");
    
    String welcome = new String("Welcome to the supermarket! \nWhat would you like to buy?");
    System.out.println(welcome);
    Food apple = new Food("apple", "sweet", "red", 95);
    System.out.println(apple);
    f.Foodlist();
    f.Foodlist(5, Math.abs(3.50));
    
    int apples = 5;
    double money = 20.0;
    boolean bought = false;
      
    Scanner decision = new Scanner(System.in);
    String decision1 = decision.nextLine();
    while (!(decision1.equals("yes") || decision1.equals("Yes")))
    {
      while (bought == false)
      {
        System.out.println("Shop here or else...");
        decision1 = decision.nextLine();
        if (decision1.equals("yes") || decision1.equals("Yes"))
        {
          bought = true;
        }
      }
    }
    if (decision1.equals("yes"))
    {
      bought = true;
    }
    else if (decision1.equals("Yes"))
    {
      bought = true;
    }
    else
    {
      bought = false;
    }
    if (bought == true)
    {
      if (true && false || !false)
      {
        for (int i = 0; i < 1; i++)
        {
          System.out.println("You have said " + decision1 + ". Let's buy one apple.");
        }
        bought = true;
        money = money - f.getfood1price();
        System.out.println("You now have $" + money);
        apples -= 1;
        System.out.println("There are now " + apples + " apples");
    
        int bananas = 10;
      
        Food banana = new Food("banana", "sweet", "yellow", 105);
        System.out.println(banana);
        f.Foodlist(10, 2.0, "I love bananas!");
        boolean comparison = (banana.equals(apple));
        if (comparison)
        {
          System.out.println("Dont worry, both bananas and apples are sweet!");
        }
        String decision2 = decision.nextLine();
        System.out.println("You have said " + decision2 + ". Let's buy a banana.");
        money = money - f.getfood2price();
        System.out.println("You now have $" + money);
        bananas -= 1;
        System.out.println("There are now " + bananas + " bananas");
      }
    }
    else
    {
      System.out.println("Come back if you change your mind!");
    }
  }
}
