


class Main {
  public static void main(String[] args) {
    System.out.println("Let's track your shoes to make sure you are running strong!");
    boolean newShoes = true;


    //SWITCH CASE MENU 
    //  1 New shoes create new shoes
    //---display shoe brands
    //  2 Load Shoes load shoes from file 
    //  3 Save shoes save current shoes new or loaded 
    //  4 update shoes update information on shoes 
    //  5 delete shoes remove a shoe from the saves

    MainMenu mainMenu = new MainMenu();
    mainMenu.listBrands();

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
  }
}