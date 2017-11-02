package Overloading;



class Overloading_Ex {
//    void same_method () {
//        System.out.println("same_method_1");
//    }
//
//    void same_method () {
//        System.out.println("same_method_2");
//    }
//    ↑ 오류 발생
//
//    오버로딩 사용에는 조건이 붙는다.
//    1. 매개 변수 타입이 달라야 한다.
    void same_method (int a) { System.out.println(a); }
    void same_method (String a) { System.out.println(a); }


    //    2. 매개변수 개수가 달라야 한다.
    void same_method2 (String a) { System.out.println(a); }
    void same_method2 (String a, String b) { System.out.println(a + " " + b); }
}
