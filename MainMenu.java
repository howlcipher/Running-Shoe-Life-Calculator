public class MainMenu {

  public String[] shoeBrands = { "Adidas", "Asics", "Brooks", "Mizuno", "New Balance", "Nike", "Reebok", "Saucony" };

  public MainMenu() {

  }

  public void listBrands() {
    for (int i = 0; i < shoeBrands.length; i++) {
      System.out.println((i + 1) + ". "+ shoeBrands[i]);
    }
  }




}