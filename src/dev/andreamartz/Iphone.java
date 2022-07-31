package dev.andreamartz;

public class Iphone {
    // the following three variables are called `properties`  on the class

    // `private` is used in encapsulation, to hide data from the outside world
    private String model;
    private double price;
    private boolean isWaterResistant;

    // default Iphone constructor:
    public Iphone() {}

    // another Iphone constructor:
    public Iphone(String model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }


    // the Iphone `behaviors`:

    // Getters and Setters ( ^ Enter )
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }
}
