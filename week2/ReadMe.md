방과후 협업 스터디 2주차
========================

## 1. JAVA
-------

1.	클래스와 메소드에 관해서 배웠다.
  2.인스턴스와 객체의 차이에 대해서 배웠다. ([참고 링크](http://dbnsecu.tistory.com/8) , [참고 코드](https://github.com/slg1119/Study/tree/master/week2/Java)\)

### 과제

`모든 과제는 한개의 Java 파일에 넣는 것이 아닌, 다른 Java 파일을 만들어서 과제를 수행한다.`

### 1번 문제 [해답](https://github.com/slg1119/Study/tree/master/week2/HomeWork/Q1)

어느 회사에서 배달 주문 서비스를 만들려고 한다. 배달 서비스에 들어갈 정보는 주문하는 사람의 이름, 사는 곳, 음식의 종류이다. 여기서 이 회사는 서비스를 더욱 편리하게 만들기 위해서, 음식의 종류를 서비스가 판단하여 자동으로 가격을 매겨주는 기능도 넣을 에정이라고 한다. 클래스를 이용하여 이 배달 주문 서비스를 만들어라.

##### 조건

1.	클래스의 이름은 *Delivery_food* 이다.
  2.Delivery_food의 기본 값은 `이름 : 김철수, 주소 : 평택, 주문할 음식 : 치킨, 음식의 가격 : 10000원`
  3.주문을 받는 메소드의 이름은 *newOrder*이고, 넘겨주는 인자 값은 순서대로 *이름, 주소, 주문할 음식* 이다.
  4.음식의 가격은 치킨은 10000원, 짜장면은 8000원, 피자는 15000원 이고, 나머지의 음식의 값은 8000원 으로 한다.
  5.또한 이 주문을 출력시키는 메소드의 이름은 *printOrder* 이다.

##### 결과

```java
Main Class Code :
Delivery_food order = new Delivery_food();
order.newOrder("손록형", "서울", "치킨킨");
order.printOrder();

Out :
주문하신 분의 이름은 손록형이고, 주소는 서울이고, 메뉴는 치킨이고, 결제하실 금액은 10000원 입니다.
```

---

### 2번 문제 [해답](https://github.com/slg1119/Study/tree/master/week2/HomeWork/Q2)

가분수를 대분수로, 대분수를 가분수로 변환하는 프로그램을 만들려고 한다. 클래스를 이용하여 이 프로그램을 만들어라.

##### 조건 
1. 클래스의 이름은 *FracConv* 이다. 
2. 가분수일 경우 정수를 0으로 설정한다. 
3. 정수, 분자, 분모를 받는 메소드의 이름은 *setValue* 이고, 넘겨주는 인자 값은 순서대로 *정수, 분자, 분모* 이다. 
4. *setValue* 메소드에서 분수가 1인지, 분수가 가분수나, 대분수가 아닌지를 판단한다. 
5. 가분수에서 대분수로 바꿔주는 메소드의 이름은 *imp2mixed* 이고, 대분수에서 가분수로 바꿔주는 메소드의 이름은 *mixed2imp* 이다. 
6. 바꿔준 분수를 출력하는 메소드의 이름은 *printResult* 이다.

##### 결과

```java
Main Class Code :
FracConv conv1 = new FracConv();
conv1.setValue(3, 4, 7);
conv1.mixed2imp();
conv1.printResult();

FracConv conv2 = new FracConv();
conv2.setValue(0, 7, 4);
conv2.imp2mixed();
conv2.printResult();

Out :
25/7
1 3/4
```

---

## 2. Linux
--------

1.	서버에 부원들 계정을 각자 만들었다.
  2.Putty로 서버에 접속하였다. [Putty 사용법](http://suhjin.tistory.com/37)

---

## 3. 정보처리 기능사
------------------

1.	책을 구매 하였다.
