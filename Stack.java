package sajal;
import java.util.Scanner;

public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] stackArray;
    private int top;

    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    // Push operation: adds an element to the stack
    public void push(int value_Push) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value_Push;
            System.out.println("Pushed: " + value_Push);
        } else {
            System.out.println("Stack is full. Cannot push " + value_Push);
        }
    }

    // Pop operation: removes and returns the top element from the stack
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // You can choose another value to indicate an empty stack
        }
    }

    // Peek operation: returns the top element without removing it
    public int peek() {
        if (top >= 0) {
            System.out.println("Top element: " + stackArray[top]);
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. No top element.");
            return -1; // You can choose another value to indicate an empty stack
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Check if full");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int valueToPush = sc.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.println("Is the stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Is the stack full? " + stack.isFull());
                    break;
                case 0:
                    System.out.println("Exiting program. Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        sc.close();
    }
}
