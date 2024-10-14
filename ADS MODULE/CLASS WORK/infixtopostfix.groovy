import java.util.*;

class infixtopostfix { 

static class StackNode {
    char data;
    StackNode next;

    StackNode(char d) {
        data = d;
        next = null;
    }
}

static class Stack {
    StackNode top;

    void push(char data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    char pop() {
        if (top == null) {
            return '\0';
        } else {
            char data = top.data;
            top = top.next;
            return data;
        }
    }

    boolean isEmpty() {
        return top == null;
    }
}

static int precedence(char ch) {
    if (ch == '+' || ch == '-') {
        return 1;
    } else if (ch == '*' || ch == '/') {
        return 2;
    } else {
        return 0;
    }
}

static String infixToPostfix(String infix) {
    Stack stack = new Stack();
    StringBuilder postfix = new StringBuilder();

    for (int i = 0; i < infix.length(); i++) {
        char ch = infix.charAt(i);

        if (Character.isLetterOrDigit(ch)) {
            postfix.append(ch);
        } else if (ch == '(') {
            stack.push(ch);
        } else if (ch == ')') {
            while (stack.top != null && stack.top.data != '(') {
                postfix.append(stack.pop());
            }
            stack.pop(); // Remove the '('
        } else {
            while (stack.top != null && precedence(ch) <= precedence(stack.top.data)) {
                postfix.append(stack.pop());
            }
            stack.push(ch);
        }
    }

    while (!stack.isEmpty()) {
        postfix.append(stack.pop());
    }

    return postfix.toString();
}

static int evaluatePostfix(String postfix) {
    Stack stack = new Stack();

    for (int i = 0; i < postfix.length(); i++) {
        char ch = postfix.charAt(i);

        if (Character.isDigit(ch)) {
            stack.push(ch);
        } else {
            int operand2 = stack.pop() - '0';
            int operand1 = stack.pop() - '0';

            switch (ch) {
                case '+':
                    stack.push((char) (operand1 + operand2 + '0'));
                    break;
                case '-':
                    stack.push((char) (operand1 - operand2 + '0'));
                    break;
                case '*':
                    stack.push((char) (operand1 * operand2 + '0'));
                    break;
                case '/':
                    stack.push((char) (operand1 / operand2 + '0'));
                    break;
            }
        }
    }

    return stack.pop() - '0';
}

public static void main(String args[]) {
    String infix = "2+3*4";
    String postfix = infixToPostfix(infix);
    System.out.println("Infix: " + infix);
    System.out.println("Postfix: " + postfix);
    int result = evaluatePostfix(postfix);
    System.out.println("Result: " + result);
}
}