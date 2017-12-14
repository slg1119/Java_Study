package Ch6.Extend_Constructor;

public class SuperClass {
    SuperClass() {
        System.out.println("SuperClass Constructor");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        System.out.println("SubClass Constructor …");
    }
}

