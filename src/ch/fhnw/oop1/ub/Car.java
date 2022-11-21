package ch.fhnw.oop1.ub;

import java.awt.Color;

public abstract class Car {

  private Color color;
  private Motorization motorization;
  private Line line;
  private final int serialNumber;

  static int globalSerialNumber = 0;

  public Car(Color color, Motorization motorization, Line line) {
    this(color, motorization, line, globalSerialNumber);
    globalSerialNumber++;
  }

  Car(Color color, Motorization motorization, Line line, int serialNumber) {
    this.color = color;
    this.motorization = motorization;
    this.serialNumber = serialNumber;
    this.line = line;
  }

  public Color getColor() {
    return color;
  }

  public Motorization getMotorization() {
    return motorization;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public int getPrice() {
    return this.motorization.getSurcharge() + this.line.getPrice();
  }

  public Line getLine() {
    return line;
  }

  public String toString() {
    return getLine().toString().toLowerCase() + " " + this.getMotorization().toString().toLowerCase() + " #"
        + getSerialNumber() + " CHF" + getPrice();
  }

  public boolean equals(Object that) {
    if (!(that instanceof Car)) {
      return false;
    }

    Car thatCar = (Car) that;

    return getColor().equals(thatCar.getColor()) && getLine().equals(thatCar.getLine())
        && getPrice() == thatCar.getPrice() && getSerialNumber() == thatCar.getSerialNumber()
        && getMotorization().equals(thatCar.getMotorization());
  }
}
