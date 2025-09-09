public class Main2 {
  public static void main(String[] args) {
    int price=2500;
    double discountRate=0.2;
    int discount=(int)(price*discountRate);
    int sellingPrice=price-discount;
    System.out.println("割引額"+discount+"円");
    System.out.println("販売価格"+sellingPrice+"円");
  }
}
