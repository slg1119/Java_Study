public class Main {

    public static void main(String[] args) {
        FracConv conv1 = new FracConv();
        conv1.setValue(3, 4, 7);
        conv1.mixed2imp();
        conv1.printResult();

        FracConv conv2 = new FracConv();
        conv2.setValue(0, 7, 4);
        conv2.imp2mixed();
        conv2.printResult();

    }
}
