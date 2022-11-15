package ch.fhnw.oop1.ab.equals;

import java.awt.Color;

public class ColoredPoint extends Point {
  private Color color;

  public ColoredPoint(int x, int y, Color color) {
    super(x, y);
    this.color = color;
  }

  @Override
  public boolean equals(Object obj) {
    boolean isEqualPoint = super.equals(obj);
    if (obj instanceof Point) {
      return isEqualPoint;
    }

    return obj instanceof ColoredPoint && isEqualPoint && ((ColoredPoint) obj).color == color;

  }
}
