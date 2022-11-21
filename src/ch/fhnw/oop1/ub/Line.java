package ch.fhnw.oop1.ub;

enum Line {
  PURE(14_390),
  PULSE(15_590),
  PASSION(16_790);

  private int price;

  Line(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
