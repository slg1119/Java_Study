package Ch6.Extend;

public class Point {
    private int x,y;

    void set(int x, int y) { this.x = x; this.y = y; }

    void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String Color;

    void setColor(String Color) {
        this.Color = Color;
    }

    void showColorPoint() {
        System.out.println(Color);
        showPoint();
    }
}
