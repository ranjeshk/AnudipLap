import java.util.Scanner;

// q1
// Write a Java program that takes an
// array of numbers as input from the user, filters out
// the even numbers, displays them, and calculates their sum
public class EvenSumDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int evenSum = 0;

        // Input numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // Filter out even numbers, display them, and calculate their sum
        System.out.println("Even numbers are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                evenSum += arr[i];
            }
        }
        System.out.println("Sum of calculated even numbers: " + evenSum);

    }
}
