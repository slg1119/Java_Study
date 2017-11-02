package Overloading;

public class Main {
    public static void main(String[] args) {

        Overloading_Ex overloading_sample = new Overloading_Ex();

        overloading_sample.same_method(1);
        overloading_sample.same_method("Exmaple");
        // out 결과
        // 1
        // Example

        overloading_sample.same_method2("a");
        overloading_sample.same_method2("a", "b");
        // out 결과
        // 2
        // a b
    }
}
