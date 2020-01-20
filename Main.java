
class Main {
  public static void main(String[] args) {
    System.out.println("Let's track your shoes to make sure you are running strong!");
    Shoes runningShoes = new Shoes("Mizuno", "Waver Runner", 300);
    System.out.println("Brand: " + runningShoes.getBrand());
    System.out.println("Model: " + runningShoes.getModel());
    System.out.println("Estimated Miles of Life: " + runningShoes.getlifeOfShoe());

  }
}