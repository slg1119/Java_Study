package Ch5.Basic_Class;

public class Main {

    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();

        pizza.radius = 10;
        pizza.name = "자바피자";

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area + "입니다.");
    }
}
