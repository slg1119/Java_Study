package Ch5.Reference;

public class Main {
    public static void main (String[] args) {
        Television tv1 = new Television(7,10, true);
        tv1.print();

        Television tv2 = new Television();
        tv2.print();

        //필드 참조 형태
        Television tv3 = new Television();
        tv3.channel = 13;
        tv3.volume = 20;
        tv3.onOff = true;

        tv3.print();

    }
}
