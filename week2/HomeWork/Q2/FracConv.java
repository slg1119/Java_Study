class FracConv {
    int integer;
    int denominator; // 분모
    int numerator; // 분자



    public void setValue(int integer, int numerator, int denominator) {
        if (integer == 0) {
            if (denominator > numerator) {
                System.out.println("가분수 혹은 대분수가 아닙니다");
            } else if (denominator == numerator) {
                System.out.println("1인 분수입니다.");
            } else {
                this.integer = integer;
                this.denominator = denominator;
                this.numerator = numerator;
            }
        } else {
            this.integer = integer;
            this.denominator = denominator;
            this.numerator = numerator;
        }
    }

        public void imp2mixed () {
            integer = (numerator / denominator);
            numerator = numerator % denominator;
        }

        public void mixed2imp () {
            numerator = (integer * denominator) + numerator;
            integer = 0;

        }

        public void printResult () {
            if (integer == 0) {
                System.out.println(numerator + "/" + denominator);
            } else {
                System.out.println(integer + " " + numerator + "/" + denominator);
            }

        }

    }