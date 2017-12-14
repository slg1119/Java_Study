package Ch5.Field;

public class Field {
    private int pri = 1;
    int pac = 2; // package는 생략 가능
    protected int pro = 3;
    public int pub = 4;

    public void print_pri() {
        System.out.println(pri);
    }

    public void print_pac() {
        System.out.println(pac);
    }

    public void print_pro() {
        System.out.println(pro);
    }

    public void print_pub() {
        System.out.println(pub);
    }



}
