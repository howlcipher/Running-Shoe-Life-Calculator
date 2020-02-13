public class Shoes {
  private String brand;
  private String model;
  private int lifeOfShoe;
  public String[] shoeBrands = {"Adidas", "Asics", "Brooks", "Mizuno", "New Balance", "Nike", "Reebok", "Saucony"};

  public Shoes(int x, String y, int z) {
    this.setBrand(x);
    this.setModel(y);
    this.setLifeOfShoe(z);
  }


  // Brand getter
  public String getBrand() {
    return brand;
  }

  // Brand setter
  public void setBrand(int newBrand) {
    String brand = shoeBrands[newBrand - 1];
    this.brand = brand;
  }

  // Model getter
  public String getModel() {
    return model;
  }

  // Model setter
  public void setModel(String newModel) {
    this.model = newModel;
  }

  // Shoe life getter
  public int getlifeOfShoe() {
    return lifeOfShoe;
  }

  // Shoe life setter
  public void setLifeOfShoe(int newLifeOfShoe) {
    this.lifeOfShoe = newLifeOfShoe;
  }

}