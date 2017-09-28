class Car {
    String car_name;
    String car_kinds;
    int displacement;

    Car() {
        car_name = "Martiz";
        car_kinds = "Compact car";
        displacement = 2000;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public void setCar_kinds(String car_kinds) {
        this.car_kinds = car_kinds;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void print() {
        System.out.println(car_name + " " + car_kinds + " " + displacement);
    }
}
