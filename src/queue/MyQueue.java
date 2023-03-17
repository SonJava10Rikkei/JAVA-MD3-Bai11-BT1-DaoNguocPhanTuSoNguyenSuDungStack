package queue;

public class MyQueue {
    private Node front, rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        // Theem Node moi va them gia tri vao Node
        Node newNode = new Node(data);
        // Neu hang doi la null
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }
        this.rear.link = newNode;
        this.rear = newNode;
    }

    public int deQueue() {
        if (this.front == null) {
            throw new IllegalArgumentException("Hang doi null");
        }
        int data = this.front.getData();
        if (this.front == null) {
            this.front = null;
            this.rear = null;
        }
        this.front = this.front.link;
        return data;
    }

    public void display() {

    }
}
