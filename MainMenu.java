import java.util.Scanner;

public class MainMenu {

  public String[] shoeBrands = { "Adidas", "Asics", "Brooks", "Mizuno", "New Balance", "Nike", "Reebok", "Saucony" };

  public MainMenu() {

  }

  public void displayMenu() {
    System.out.println("Please type in the number of the option you want.");
    System.out.println("1. New Shoes\n2. Load Shoes\n3. Save Shoes\n4. Update Shoes\n5. Delete Shoes\n6. Quit");
  }

  public void menuChoices() {

    Scanner input = new Scanner(System.in);
    System.out.print("Please select an option 1 - 6: ");
    int option = input.nextInt();

    if ((int) option < (int) 1 && (int) option > (int) 7) {
      System.out.println("Please try again, and enter a number between 1 - 6.");
    } else {
      switchChoices();
  }
        input.close();
  }


public void switchChoices() {
        switch (option) {
      // SWITCH CASE MENU
      case 1:
        boolean newShoes = true;
        System.out.println("Let's create some shoes!\nPlease Select a shoe brand to get started!");
        listBrands();
        if (newShoes) {
          String model = "Waver Rider";
          int lifeOfShoe = 300;

          // new shoes creates
          Shoes runningShoes = new Shoes(4, model, lifeOfShoe);

          System.out.println("Brand: " + runningShoes.getBrand());
          System.out.println("Model: " + runningShoes.getModel());
          System.out.println("Estimated Miles of Life: " + runningShoes.getlifeOfShoe());

          // -30 should be the user input
          runningShoes.setLifeOfShoe(runningShoes.getlifeOfShoe() - 30);
          System.out.println("New Estimated Miles of Life: " + runningShoes.getlifeOfShoe());
        } else {
          System.out.println("No shoes to be recorded");
        }
        menuChoices();
      case 2:
        System.out.println("Let's load your shoes!");
        menuChoices();
      case 3:
        System.out.println("Shoes have been saved");
        menuChoices();
      case 4:
        System.out.println("Your current shoes have been updated, please remember to save!");
        menuChoices();
      case 5:
        System.out.println("Your current saved shoes have been deleted from file.");
        menuChoices();
      case 6:
        System.out.println("Goodbye and happy running!");
        break;
      default:
        System.out.println("Try again");
        menuChoices();
      }


    }


  public void listBrands() {
    for (int i = 0; i < shoeBrands.length; i++) {
      System.out.println((i + 1) + ". " + shoeBrands[i]);
    }
  }

}