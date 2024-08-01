import java.util.Scanner;

public class LargestNum {
    public int largestNum(int[] _arr) {
        int maxInt = _arr[0];
        for (int i = 1; i < _arr.length; i++) {
            if (_arr[i] > maxInt) {
                maxInt = _arr[i];
            }
        }
        return maxInt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr2 = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        LargestNum obj1 = new LargestNum();
        int largest = obj1.largestNum(arr2);
        System.out.println("The largest number is: " + largest);

        scan.close();
    }
}
