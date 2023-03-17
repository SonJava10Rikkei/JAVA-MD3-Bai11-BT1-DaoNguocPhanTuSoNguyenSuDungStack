package reverse;

import java.util.Stack;

public class IntegerReverseArrayStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}