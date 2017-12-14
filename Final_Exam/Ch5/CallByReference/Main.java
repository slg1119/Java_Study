package Ch5.CallByReference;

public class Main {
    public static void main(String[] args) {
        Swap a = new Swap();
        a.x = 1;
        a.y = 2;
        Swap.swap(a);

        System.out.println(a.x + " " + a.y);
    }
}
