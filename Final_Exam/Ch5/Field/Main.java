package Ch5.Field;

public class Main {
    public static void main (String[] args) {
        Field field_ex = new Field();

        // field_ex.pri = 3; <- 에러 발생 ; 접근 수정자가 private이기 때문

        // package Example
        field_ex.pac = field_ex.pac * 2;
        field_ex.print_pac();

        // protected example
        field_ex.pro = field_ex.pro * 2;
        field_ex.print_pro();

        // public example
        field_ex.pub = field_ex.pub * 2;
        field_ex.print_pub();



    }
}
