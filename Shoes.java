public class Shoes {
    private String brand;
    private String model;
    private int lifeOfShoe;

public Shoes(String x, String y, int z) {
  this.setBrand(x);
  this.setModel(y);
  this.setLifeOfShoe(z);
}


//Brand getter
public String getBrand() {
  return brand;
}
//Brand setter
public void setBrand(String newBrand) {
  this.brand = newBrand;
}

//Model getter
public String getModel() {
  return model;
}
//Model setter
public void setModel(String newModel) {
  this.model = newModel;
}

//Shoe life getter
public int getlifeOfShoe() {
  return lifeOfShoe;
}
//Shoe life setter
public void setLifeOfShoe(int newLifeOfShoe) {
  this.lifeOfShoe = newLifeOfShoe;
}

}