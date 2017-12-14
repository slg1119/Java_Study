package Ch6.Extend;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();

        p.set(1,2);
        p.showPoint();

        ColorPoint ColorPoint = new ColorPoint();
        ColorPoint.set(3,4);
        ColorPoint.setColor("red");
        ColorPoint.showColorPoint();
    }
}
