class MyQueue {

    Stack<Integer> q1 = new Stack<>();
    Stack<Integer> q2 = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        q1.push(x);
    }

    public int pop() {
        if (empty()) return -1;

        if (q2.isEmpty()) {
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
        }
        return q2.pop();
    }

    public int peek() {
        if (empty()) return -1;

        if (q2.isEmpty()) {
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
        }
        return q2.peek();
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}