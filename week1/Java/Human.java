class Human {
    String name;
    int age;
    String living_place;
    double height;

    Human() {
        name = "idiot";
        age = 21;
        living_place = "평택";
        height = 177.7;
    }


    public void setHuman(String name, int age, String living_place, double height) {
        this.name = name;
        this.age = age;
        this.living_place = living_place;
        this.height = height;
    }

    public void print_Human() { System.out.println(name + " " + age + " " + living_place + " " + height); }


}
