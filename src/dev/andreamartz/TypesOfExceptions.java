package dev.andreamartz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//   // Checked exceptions - needs to be handled at compile time (and need to use try/catch block or the throws keyword)
//   // Unchecked exceptions - exceptions that won't give a compilation error

public class TypesOfExceptions {
    // handle using the throws keyword:

//    public static void main(String[] args) throws FileNotFoundException {
//        // here is an example of something that needs to be checked at compile time, bc the file may or may not be there
//        FileInputStream inputStream = new FileInputStream("src/example.txt");
//    }

    // or use try/catch:
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("src/exampl.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Unchecked exceptions:
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            System.out.println("cannot divide number by 0");
        } finally {
            System.out.println("cleaning up ...");
        }

        performDivision(1, 0);
    }

    static double performDivision(double a, double b) {
        if (b == 0) {
            throw new MyException("cannot divide by 0");
        }
        return a / b;
    }

    static class MyException extends RuntimeException {
        // constructor:
        public MyException(String message) {
            super(message);
        }
    }
}
