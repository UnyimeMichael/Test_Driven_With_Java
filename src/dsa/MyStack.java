package dsa;

public class MyStack {
    private boolean isEmpty = true;
    private String element;

    public MyStack(int sizeOfStack) {

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(String element) {
         isEmpty = false;

        this.element = element;

    }

    public void pop() {

    }
}
