package static_ex;

class static_ex {
    static int static_num = 10;
    public int public_num =20;

    static_ex(int num1, int num2) {
        static_num = num1;
        public_num = num2;
    }

    public void sIncrement() {
        static_num++;
    }
    void print() {
        System.out.println(static_num + " " + public_num);
    }

}

class main {
    static final int num1 = 10;
    public static void main(String[] args) {
        static_ex ex = new static_ex(10,20);
        ex.sIncrement();
        ex.print();


    }
}

