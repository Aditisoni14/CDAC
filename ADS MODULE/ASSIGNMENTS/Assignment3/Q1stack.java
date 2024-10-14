import java.util.Arrays;

public class Q1stack {
    private int[] array;
    private int top;

    public Q1stack(int size) {
        array = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (top >= array.length) {
            System.out.println("Stack Overflow. Cannot push element " + element);
            return;
        }
        array[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int[] getStack() {
        int[] stackArray = new int[top + 1];
        System.arraycopy(array, 0, stackArray, 0, top + 1);
        return stackArray;
    }
/**
 * @param args
 */
public static void main(String[] args)
{
Q1stack stack = new Q1stack(3); // Initialize a stack with a size of 10
stack.push(5);
stack.push(3);
stack.push(7);
int poppedElement = stack.pop();
System.out.println("Stack = " + Arrays.toString(stack.getStack())); // [5, 3]
System.out.println("Popped element = " + poppedElement); // 7
}
}