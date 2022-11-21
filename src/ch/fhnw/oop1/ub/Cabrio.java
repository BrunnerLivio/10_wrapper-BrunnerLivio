package ch.fhnw.oop1.ub;

import java.awt.Color;

public class Cabrio extends CityCoupe {

  private static final int MUSIC_PLAYER_PRICE = 460;
  private static final int CABRIO_PRICE = 3100;
  private boolean musicPlayer;

  public Cabrio(Color color, Motorization motorization, Line line, boolean musicPlayer) {
    super(color, motorization, line);
    this.musicPlayer = musicPlayer;
  }

  Cabrio(Color color, Motorization motorization, Line line, boolean musicPlayer, int serialNumber) {
    super(color, motorization, line, serialNumber);
    this.musicPlayer = musicPlayer;
  }

  public boolean hasMusicPlayer() {
    return musicPlayer;
  }

  @Override
  public int getPrice() {
    int basePrice = super.getPrice() + CABRIO_PRICE;
    return musicPlayer ? basePrice + MUSIC_PLAYER_PRICE : basePrice;
  }

  @Override
  public String toString() {
    return "cabrio " + (musicPlayer ? "with music player " : "") + super.toString();
  }

  @Override
  public boolean equals(Object that) {
    return (that instanceof Cabrio) && hasMusicPlayer() == ((Cabrio) that).hasMusicPlayer() && super.equals(that);
  }
}
