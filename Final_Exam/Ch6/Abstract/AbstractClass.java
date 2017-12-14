package Ch6.Abstract;

abstract class AbstractClass {
    public abstract void methodA();
    void methodB() {
        System.out.println("Implemetntation of methodB()");
    }
}

class ImpClass extends AbstractClass {
    // 추상화 선언된 methodA는 무조건 상속받은 클래스에서 구현을 해줘야된다.
    public void methodA() {
        System.out.println("Implemetntation of methodA()");
    }
}