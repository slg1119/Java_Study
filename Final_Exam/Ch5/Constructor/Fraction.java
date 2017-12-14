package Ch5.Constructor;

public class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        System.out.println("Default Constructor");
    }

    Fraction(int num) {
        this();
        numerator = num;
        denominator = 1;
    }

    Fraction(int num, int denom) {
        this();
        numerator = num;
        denominator = denom;
    }

    public String toString() {
        String form = numerator + "/" + denominator;
        return form;
    }
}

