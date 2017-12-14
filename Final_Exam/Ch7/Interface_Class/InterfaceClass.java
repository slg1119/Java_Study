package Ch7.Interface_Class;

interface BaseColors {
    int red = 1;
    int green = 2;
    int blue = 4;
    void setColor(int color);
    int getColor();
}

abstract class SetColor implements BaseColors {
    protected int color;

    public void setColor(int color) {
        this.color = color;
        System.out.println("in the setColor method...");
    }
}

class Color extends SetColor {
    public int getColor() {
        System.out.println("in the getColor method...");
        return color;
    }
}


public class InterfaceClass {
    public static void main (String[] args) {
        Color c = new Color();
        int i;
        c.setColor(10);
        i = c.getColor();
        System.out.println(i);
    }
}
