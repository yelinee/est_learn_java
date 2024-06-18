package test0614;

public class Stock {
  int apple;

  public void buy(int amount) throws InsufficientStockException {
    if (apple < amount) {
      throw new InsufficientStockException("구매 수량이 재고 수량보다 많습니다.");
    }
    apple -= amount;
  }
}
