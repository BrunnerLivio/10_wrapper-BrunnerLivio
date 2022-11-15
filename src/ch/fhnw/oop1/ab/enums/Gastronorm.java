package ch.fhnw.oop1.ab.enums;

public class Gastronorm {
  private Size size;
  private Material material;

  public Gastronorm(Material material, Size size) {
    this.material = material;
    this.size = size;
  }

  public Material getMaterial() {
    return material;
  }

  public int getWidth() {
    return size.getWidth();
  }

  public int getLength() {
    return size.getLength();
  }

  public int getLiterVolume() {
    return size.getWidth() * size.getLength() / 10_000;
  }

  enum Material {
    STEEL,
    PLASTIC
  }


  enum Size {
    GN1_4(163, 265), GN1_2(265, 326), GN1_1(325, 530);

    private int breite;
    private int laenge;

    Size(int breite, int laenge) {
      this.breite = breite;
      this.laenge = laenge;
    }

    public int getWidth() {
      return breite;
    }

    public int getLength() {
      return laenge;
    }

  }
}
