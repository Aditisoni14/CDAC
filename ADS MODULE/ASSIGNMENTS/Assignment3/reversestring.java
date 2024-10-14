import java.util.Stack;
public class reversestring {
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop each character off the stack and append it to the result string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        } 

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // "olleh"
        System.out.println(reverse("world")); // "dlrow"
    }
}