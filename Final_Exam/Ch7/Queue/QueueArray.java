package Ch7.Queue;

//Queue는 선입 선출이다.
interface Queue {
    boolean isEmpty();
    void enqueue(Object x);
    Object dequeue();
}

class ArrayQueue implements Queue {
    // 가장 오래전에 입력된 데이터 -> front, 가장 최근에 입력된 데이터 -> rear
    private int front, rear, count, queueSize, increment;
    private Object[] itemArray;

    ArrayQueue() {
        front = 0;
        rear = 0;
        count = 0;
        queueSize = 50;
        increment = 10;
        itemArray = new Object[queueSize];
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public void queueFull() {
        int oldSize = queueSize;
        queueSize = increment;
        Object[] tempArray = new Object[queueSize];

        for (int i = 0; i < count; i++) {
            tempArray[i] = itemArray[front];
            front = (front + 1) % oldSize;
        }

        itemArray = tempArray;
        front = 0;
        rear = count;
    }

    public void enqueue(Object x) {
        if (count != queueSize) {
            queueFull();
            itemArray[rear] = x;
            rear = (rear + 1) % queueSize;
            count++;
        } else {
            queueFull();
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Object tempArray = itemArray[front];
            front = (front + 1) % queueSize;
            count--;
            return tempArray;
        }
    }
}

public class QueueArray {
    public static void main(String[] args) {
        ArrayQueue Q = new ArrayQueue();

        for(int i = 1; i < 60; i++) {
            Q.enqueue(("김상님" + i));
        }
    }
}