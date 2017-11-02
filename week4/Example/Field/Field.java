package Field;

class Field {
    private void example(String example) {
        System.out.println(example);
    }


    void private_ex(String example) { // <- package는 Default 값 이라서 생략가능
        example(example);
    }
}

class example_class {
    public static void main (String[] args) {
        Field ex = new Field();
        // ex.example("dsadsa");
        ex.private_ex("private"); // <- package는 접근 가능

        Field2 ex2 = new Field2();
        ex2.public_ex("public"); // <- public은 다른 class에서도 접근 가능
    }
}


