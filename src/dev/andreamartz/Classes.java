package dev.andreamartz;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone7Plus = new Iphone();
        Iphone iphoneXMax = new Iphone();

        // iphone7Plus
        System.out.println(iphone7Plus.getModel());  // null
        System.out.println(iphone7Plus.getPrice());  // 0.0
        System.out.println(iphone7Plus.isWaterResistant());   // false

        iphone7Plus.setModel("7+");
        iphone7Plus.setPrice(200.00);
        iphone7Plus.setWaterResistant(false);

        System.out.println(" ");
        System.out.println("7Plus:");  // 7Plus:
        System.out.println(iphone7Plus.getModel());  // 7+
        System.out.println(iphone7Plus.getPrice());  // 200.00
        System.out.println(iphone7Plus.isWaterResistant());   // false

        // iphoneXMax
        iphoneXMax.setModel("X Max");
        iphoneXMax.setPrice(1300.00);
        iphoneXMax.setWaterResistant(true);

        System.out.println(" ");
        System.out.println("XMax:");  // X Max:
        System.out.println(iphoneXMax.getModel());  // X Max
        System.out.println(iphoneXMax.getPrice());  // 1300.00
        System.out.println(iphoneXMax.isWaterResistant());   // true

        // another 7Plus using the Iphone constructor we wrote:
        Iphone iphone7Plus2 = new Iphone("7Plus2", 200.00, false);
        System.out.println(" ");
        System.out.println("7Plus2:");  // 7Plus2:
        System.out.println(iphone7Plus2.getModel());  // 7Plus2
        System.out.println(iphone7Plus2.getPrice());  // 200.00
        System.out.println(iphone7Plus2.isWaterResistant());   // false
        iphone7Plus2.setPrice(100.00);
        System.out.println("7Plus2 new price: " + iphone7Plus2.getPrice());

        // how to print out an object (before the toString method was overridden in the Iphone class:
        System.out.println(" ");
        System.out.println("how to print an object: ");
        System.out.println(iphone7Plus2);  // dev.andreamartz.Iphone@28a418fc
        // huh?!
        // ...but if we add (override) the toString method in the Iphone class definition, then we can print the object:
        System.out.println(iphone7Plus2);  // Iphone{model='7Plus2', price=100.0, isWaterResistant=false}

    }
}
