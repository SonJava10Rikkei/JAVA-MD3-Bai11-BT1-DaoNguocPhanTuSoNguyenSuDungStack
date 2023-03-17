package rikkei;

public class StackReverseChar {
    int size;
    int top;
    char[] a;

//    //function to check if stack is empty
//    boolean isEmpty() {
//        return (top < 0);
//    }
//
//    StackReverseChar(int n) {
//        top = -1;
//        size = n;
//        a = new char[size];
//    }
//
//    //function to push element in Stack
//    boolean push(char x) {
//        if (top >= size) {
//            System.out.println("Stack Overflow");
//            return false;
//        } else {
//            a[++top] = x;
//            return true;
//        }
//    }
//
//    //function to pop element from stack
//    char pop() {
//        if (top < 0) {
//            System.out.println("Stack Underflow");
//            return 0;
//        } else {
//            char x = a[top--];
//            return x;
//        }
//    }


    static void swap(char a[], int index1, int index2) {
        char temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // A stack based function to reverse a string
    static void reverse(char str[]) {
        // get size of string
        int n = str.length, i;

        for (i = 0; i < n / 2; i++) {
            swap(str, i, n - i - 1);
        }
    }

//     Driver program to test above functions
    public static void main(String[] args) {
        char str[] = "Toi la Son93".toCharArray();

        reverse(str);
        System.out.printf("Reversed string is " + String.valueOf(str));
    }
}
