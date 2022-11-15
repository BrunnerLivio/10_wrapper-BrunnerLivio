package ch.fhnw.oop1.ab.equals;

import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Test;

public class EqualsTest {

  // Point
  @Test
  public void pointShouldBeReflexiv() {
    Point p = new Point(2, 1);
    assertTrue(p.equals(p));
  }

  @Test
  public void pointShouldBeSymmetric() {
    Point p = new Point(2, 1);
    Point p1 = new Point(2, 1);

    assertTrue(p.equals(p1) == p1.equals(p));
  }

  @Test
  public void pointShouldBeTransitiv() {
    Point x = new Point(2, 1);
    Point y = new Point(2, 1);
    Point z = new Point(2, 1);

    assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
  }

  // Colored Point
  @Test
  public void coloredPointShouldBeReflexiv() {
    Point cp = new ColoredPoint(2, 1, Color.RED);
    assertTrue(cp.equals(cp));
  }

  @Test
  public void coloredPointShouldBeSymmetric() {
    Point cp1 = new ColoredPoint(2, 1, Color.RED);
    Point cp2 = new ColoredPoint(2, 1, Color.RED);
    assertTrue(cp1.equals(cp2) == cp2.equals(cp1));
  }


  @Test
  public void coloredPointShouldBeTransitiv() {
    ColoredPoint x = new ColoredPoint(2, 1, Color.RED);
    ColoredPoint y = new ColoredPoint(2, 1, Color.RED);
    ColoredPoint z = new ColoredPoint(2, 1, Color.RED);

    assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
  }

  // Mixed Point
  @Test
  public void mixedPointShouldBeSymmetric() {
    Point p = new Point(2, 1);
    Point cp = new ColoredPoint(2, 1, Color.RED);

    assertTrue(p.equals(cp) == cp.equals(p));
  }

  @Test
  public void mixedPointShouldBeTransitiv() {
    ColoredPoint x = new ColoredPoint(2, 1, Color.RED);
    Point y = new Point(2, 1);
    ColoredPoint z = new ColoredPoint(2, 1, Color.RED);

    assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
  }
}
