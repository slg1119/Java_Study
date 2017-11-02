package CallByReference_Ex;

class Swap {
    public int x, y;

    public static void swap(Swap ex) {
        int temp;

        temp = ex.x;
        ex.x = ex.y;
        ex.y = temp;

        System.out.println("swap : x = " + ex.x + ", y = " + ex.y);
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Swap a = new Swap();
        a.x = 1;
        a.y = 2;

        System.out.println("before : x = " + a.x + ", y = " + a.y);
        Swap.swap(a);
        System.out.println("after : x " + a.x + ", y = " + a.y);
    }

}
