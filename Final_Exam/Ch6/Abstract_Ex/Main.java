package Ch6.Abstract_Ex;

public class Main {
    public static void main (String [] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.substract(2,3));
        System.out.println(c.average(new int [] {2, 3, 4} ));
    }
}
