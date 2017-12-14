package Ch7.Interface;

interface BaseColors {
    int red = 1;
    int green = 2;
    int blue = 3;
}

interface ExtendColors extends BaseColors {
    int red = 4;
    int blue = 5;
    int yellow = 6;
    int white = 7;
}



public class Color implements ExtendColors {
    public static void main(String[] args) {
        System.out.println("RED = " + red);
        System.out.println("Green = " + green);
        System.out.println("Bule = " + blue);
        System.out.println("BaseColors.blue = " + BaseColors.blue);
        System.out.println("ExtendColors.blue = " + ExtendColors.blue);
        System.out.println("Yellow = " + yellow);
    }
}
