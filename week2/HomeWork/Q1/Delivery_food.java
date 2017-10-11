class Delivery_food {
    String name;
    String adress;
    String type_of_food;
    int price;

    Delivery_food() {
        name = "김철수";
        adress = "평택";
        type_of_food = "치킨";
        price = 10000;
    }

    public void detect_food(String food) {
        if(food == "치킨") {
            this.price = 10000;
        } else if (food == "짜장면") {
            this.price = 8000;
        } else if (food == "피자") {
            this.price = 15000;
        } else {
            this.price = 8000;
        }
    }

    public void newOrder(String name, String adress, String type_of_food) {
        this.name = name;
        this.adress = adress;
        this.type_of_food = type_of_food;
        detect_food(type_of_food);
    }

    public void printOrder() {
        System.out.println("주문하신 분의 이름은 " + name + "이고, 주소는 " + adress + "이고, 메뉴는 " + type_of_food + "이고, 결제하실 금액은 " + price + "원 입니다.");
    }

}
