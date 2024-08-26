package StackPackage;

public class Stack {
    private Mahasiswa[] data;
    private int size;
    private int top;

    public Stack(int capacity) {
        size = capacity;
        top = -1;
        data = new Mahasiswa[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Mahasiswa input) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            data[++top] = input;
        }
    }

    public Mahasiswa pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return null;
        } else {
            Mahasiswa topElement = data[top];
            data[top] = null;
            top--;
            return topElement;
        }
    }

    public void infoStack() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(data[i]);
            }
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack Kosong";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= top; i++) {
                sb.append(data[i].toString()).append("\n");
            }
            return sb.toString();
        }
    }
}