package ch.fhnw.oop1.ub;

import java.awt.Color;

public class CityCoupe extends Car {

  public CityCoupe(Color color, Motorization motorization, Line line) {
    super(color, motorization, line);
  }

  CityCoupe(Color color, Motorization motorization, Line line, int serialNumber) {
    super(color, motorization, line, serialNumber);
  }

  @Override
  public String toString() {
    return "smart city-coupé " + super.toString();
  }

  @Override
  public boolean equals(Object that) {
    boolean a = super.equals(that);
    return (that instanceof CityCoupe) && super.equals(that);
  }
}
