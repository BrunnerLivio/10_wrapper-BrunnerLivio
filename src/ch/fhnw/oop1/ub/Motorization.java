package ch.fhnw.oop1.ub;

public enum Motorization {
  DIESEL(1200),
  PETROL(0);

  private int surcharge;

  Motorization(int surcharge) {
    this.surcharge = surcharge;
  }

  public int getSurcharge() {
    return surcharge;
  }
}
