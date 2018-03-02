/*
*a stack capable of storing strings
*/
public class stringStack {
    private int maxSize;
    private String[] stack;
    private int top;

    public stringStack(int x) {
        maxSize = x;
        stack = new String[maxSize];
        top = -1;
    }

    public void push(String x) {
        top++;
        stack[top] = x;
    }
    public String pop() {
        return stack[top--];
    }
    public String peek() {
        return stack[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize-1);
    }
    public void makeEmpty() {
        top = -1;
    }





}