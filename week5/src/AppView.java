import java.util.Scanner;

public class AppView {
    Scanner sc;

    public AppView() {
        this.sc = new Scanner(System.in);

    }

    public int inputOrder() {
        System.out.print("마방진 차수를 입력하시오(음수를 입력하면 종료합니다) : ");
        int input = sc.nextInt();

        return input;
    }

    public void outputTitleWithOrder(int anOrder) {
        System.out.println("Magic Square Board: Order "+ anOrder);
        System.out.print("        ");
        for(int i = 0; i<anOrder; i++) {
            System.out.format("[ %2d ]", i);
        }

    }

    public void outputMessage(String aMessage) {
        System.out.println(aMessage);
    }
}
