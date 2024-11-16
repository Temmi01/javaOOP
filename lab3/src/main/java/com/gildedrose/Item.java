package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

  void increaseQualityByOne() {
      if (this.quality < 50) {
        this.quality = this.quality + 1;
      }
    }

  void decreaseQualityByOne() {
      if (this.quality > 0) {
        this.quality = this.quality - 1;
      }
    }

  void updateQuality() {
      decreaseQualityByOne();
      this.sellIn = this.sellIn - 1;
      if (this.sellIn < 0) {
        decreaseQualityByOne();
      }
    }

  @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
