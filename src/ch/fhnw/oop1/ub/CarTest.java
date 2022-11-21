package ch.fhnw.oop1.ub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.awt.Color;

public class CarTest {

  @Test
  public void shouldHaveTheCorrectPriceCityCoupe() {
    assertEquals(new CityCoupe(Color.BLACK, Motorization.PETROL, Line.PURE).getPrice(), 14390);
    assertEquals(new CityCoupe(Color.BLACK, Motorization.DIESEL, Line.PURE).getPrice(), 14390 + 1200);
    assertEquals(new CityCoupe(Color.BLACK, Motorization.PETROL, Line.PURE).getPrice(), 14390);
    assertEquals(new CityCoupe(Color.BLACK, Motorization.DIESEL, Line.PULSE).getPrice(), 15590 + 1200);
    assertEquals(new CityCoupe(Color.BLACK, Motorization.PETROL, Line.PULSE).getPrice(), 15590);
    assertEquals(new CityCoupe(Color.BLACK, Motorization.DIESEL, Line.PASSION).getPrice(), 16790 + 1200);
  }

  @Test
  public void shouldHaveTheCorrectPriceCabrio() {
    assertEquals(new Cabrio(Color.BLACK, Motorization.PETROL, Line.PURE, false).getPrice(), 14390 + 3100);
    assertEquals(new Cabrio(Color.BLACK, Motorization.DIESEL, Line.PURE, false).getPrice(), 14390 + 3100 + 1200);
    assertEquals(new Cabrio(Color.BLACK, Motorization.DIESEL, Line.PULSE, false).getPrice(), 15590 + 3100 + 1200);
  }

  @Test
  public void shouldPrintCorrectToString() {
    assertEquals(new Cabrio(Color.BLACK, Motorization.PETROL, Line.PURE, false).toString(),
        "cabrio smart city-coupé pure petrol #0 CHF17490");
    assertEquals(new Cabrio(Color.BLACK, Motorization.DIESEL, Line.PULSE, true).toString(),
        "cabrio with music player smart city-coupé pulse diesel #1 CHF20350");
    assertEquals(new CityCoupe(Color.BLACK, Motorization.PETROL, Line.PURE).toString(),
        "smart city-coupé pure petrol #2 CHF14390");
  }

  @Test
  public void shouldCorrectlyUseEquals() {
    CityCoupe cityCoupeDiesel = new CityCoupe(Color.RED, Motorization.DIESEL, Line.PULSE);
    assertTrue(cityCoupeDiesel.equals(cityCoupeDiesel));

    // Weil Seriennummer inkrementiert wird
    assertFalse(cityCoupeDiesel.equals(new CityCoupe(Color.RED, Motorization.DIESEL, Line.PULSE)));

    assertFalse(new CityCoupe(Color.RED, Motorization.DIESEL, Line.PULSE, 0)
        .equals(new Cabrio(Color.RED, Motorization.DIESEL, Line.PULSE, false, 0)));

    assertTrue(new CityCoupe(Color.RED, Motorization.DIESEL, Line.PULSE, 0)
        .equals(new CityCoupe(Color.RED, Motorization.DIESEL, Line.PULSE, 0)));

    assertTrue(new Cabrio(Color.RED, Motorization.DIESEL, Line.PULSE, true, 0)
        .equals(new Cabrio(Color.RED, Motorization.DIESEL, Line.PULSE, true, 0)));

    assertFalse(new Cabrio(Color.RED, Motorization.DIESEL, Line.PULSE, true, 0)
        .equals(new Cabrio(Color.RED, Motorization.DIESEL, Line.PULSE, false, 0)));
  }
}
