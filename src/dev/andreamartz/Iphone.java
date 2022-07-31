package dev.andreamartz;

public class Iphone {
    // the following three variables are called `properties`  on the class

    // `private` is used in encapsulation, to hide data from the outside world
//    private String model;
    private IphoneModel model;  // uses the IphoneModel Enum
    private double price;
    private boolean isWaterResistant;

    // default Iphone constructor:
    public Iphone() {}

    // another Iphone constructor:
    public Iphone(IphoneModel model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    // in this constructor, we set default values for price and isWaterResistant:
    public Iphone(IphoneModel model) {
        // NOTE: the following line is a call to another constructor!
        this(model, -1.0, false);
        this.model = model;
    }


    // the Iphone `behaviors`:

    // Getters and Setters ( ^ Enter )
    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
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

    // ^ + Enter to add the toString method:
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
