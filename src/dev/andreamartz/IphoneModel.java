package dev.andreamartz;

// This is an Enum
public enum IphoneModel {
    // Each of the "constants" we specify below is an instance of the class IphoneModel; that is to say, each one is an object
        // Each is also an instance of Enum
    // You don't use the keyword `new` with Enums
    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7_PLUS2("Iphone 7+2"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String modelStr;

    IphoneModel(String model) {
        this.modelStr = model;
    }

    public String getModelStr() {
        return modelStr;
    }
}
