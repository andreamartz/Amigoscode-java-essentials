package dev.andreamartz;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {
//        var name = "Anna";
//        name = "Alex";
//        name = "Jamila";
        // final means you can't change the value of the variable
        final var name = "Anna";
//        name = "Alex";  // won't work!
//        name = "Jamila";  // won't work!
        final var number = 0;
//        number ++;  // won't work!

        // final keyword words for classes / objects too, but it's a bit different
        Point point = new Point(0, 0);
        point = new Point(100, 100);

        // all is well so far...
        final Point point2 = new Point(0, 0);
        point2.x = 100;   // changing the properties on point2 is fine
        point2.y = 100;
        //...but what we CAN'T do is to reassign point2 to a different reference, like this:
//        point2 = new Point(100, 100);

    }
}
