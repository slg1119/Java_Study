package Ch5.CallByReference;

public class Swap {
    public int x,y;
    public static void swap(Swap swap) {
        int temp;
        temp = swap.x;
        swap.x = swap.y;
        swap.y = temp;

        System.out.println("swap : x = " +  swap.x + ", y = " + swap.y);
    }
}
