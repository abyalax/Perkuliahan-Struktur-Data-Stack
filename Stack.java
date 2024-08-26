public class Stack {
    private String data[];
    private int size;
    private int top;

    public Stack(int capacity) {
        size = capacity;
        top = -1;
        data = new String[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(String input) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            data[++top] = input;
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return null;
        } else {
            return data[top--];
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

    public static void main(String[] args) {
        Stack dataStack = new Stack(5);

        System.out.println("Apakah stack kosong? " + dataStack.isEmpty());
        dataStack.infoStack();

        dataStack.push("Algoritma Pemrograman");
        dataStack.push("Struktur Data");
        dataStack.push("Basis Data");
        dataStack.push("Multimedia");
        dataStack.push("Sistem Informasi Manajemen");

        dataStack.infoStack();

        System.out.println("Apakah stack penuh? " + dataStack.isFull());

        System.out.println("Pop elemen: " + dataStack.pop());
        dataStack.infoStack();
    }
}
