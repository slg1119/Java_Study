package Ch6.Abstract_Ex;

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int substract(int a, int b);
    public abstract double average(int[] a);
}


public class GoodCalc extends Calculator{
    public int add(int a, int b) { return a + b; }

    public int substract(int a, int b) { return a - b; }

    public double average(int[] a) {
        double sum = 0;
        for (int i = 0; i< a.length; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }
}
