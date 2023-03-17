package reverse;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Toi la Son";
        Stack<String> stack = new Stack<>();
        String[] words = str.split(" ");
        String output = "";

        for (String word : words) {
            stack.push(word);
        }

        while (!stack.empty()) {
            output += stack.pop() + " ";
        }

        System.out.println("Trước khi đảo ngược: " + str);
        System.out.println("Sau khi đảo ngược chuỗi: " + output);
    }
}
