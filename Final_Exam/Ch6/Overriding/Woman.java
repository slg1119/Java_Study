package Ch6.Overriding;

public class Woman {
    public String name;
    public int age;

    public void info() {
        System.out.println("여자의 이름은 " + name + ", 나이는 " + age +"살 입니다.");
    }
}

class Job extends Woman {
    String Job;

    public void info() {
        super.info();
        System.out.println("여자의 직업은" + Job + " 입니다.");

    }
}
