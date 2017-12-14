package Ch7.Stack;

interface Stack {
    boolean isEmpty();
    void push (Object x);
    void stackFull();
    Object pop();
}

//object Array -> String, Int, Float etc...의 자료형 선언 없이 모든 것을 받는 배열

class ArrayStack implements Stack {
    private int top, stackSize, increment;
    private Object[] itemArray;

    public ArrayStack() {
        top = -1;
        stackSize = 10;
        increment = 10;
        itemArray = new Object[stackSize];
    }

    //isEmpty 메소드는 top이 -1인지 아닌지 체크 -> ArrayStack의 초기값은 -1이기 때문
    public boolean isEmpty() {
        return (top == -1);
    }

    public void stackFull() {
        System.out.println("Method Call");
        stackSize = stackSize + increment;
        Object[] tempArray = new Object[stackSize];
        for (int i = 0; i <= top; i++) {
            tempArray[i] = itemArray[i];
        }
        itemArray = tempArray;
    }

    public void push (Object x) {
        if (top == stackSize -1) {
            stackFull();
        }
        itemArray[++top] = x;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            return itemArray[top--];
        }
    }
}

public class StackArray {
    public static void main(String[] args) {
        ArrayStack S1 = new ArrayStack();

        for (int i = 0; i < 10; i ++) {
            S1.push(("김상남" + i));
        }
        for (int i = 0; i < 10; i ++) {
            S1.push(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(S1.pop());
        }
    }

}