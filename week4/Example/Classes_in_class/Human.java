package Classes_in_class;

class Human {
    class head {
        void Thinking (String think) {
                System.out.println(think + "를 생각 중이다.");
            }

        void Control_Body (String organ) {
                System.out.println(organ + "을 제어 중이다.");
            }
    }

    class Body {
        void Walking (String destination) { System.out.println(destination + "으로 향하는 중이다."); }

        void Digest (String food) { System.out.println(food + "을 소화하는 중이다."); }
     }
        //etc..
}
