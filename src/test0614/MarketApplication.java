package test0614;

public class MarketApplication {
  public static void main(String[] args) {
    Stock stock = new Stock();
    try {
      stock.buy(3);
    } catch (InsufficientStockException e) {
      System.out.println(e.getMessage());
    }
  }
}
