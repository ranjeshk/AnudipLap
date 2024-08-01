import java.util.Scanner;

// q1
public class EvenSumDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int evenSum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
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
