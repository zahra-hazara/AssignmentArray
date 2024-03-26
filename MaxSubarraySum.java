package AssignmentArray;
import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for array size
        System.out.println(" Enter the size of the array :");
        int size = scanner.nextInt();
        int[] array = new int[size];

        //fill the array
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            array[i] = scanner.nextInt();

        }
        //find the maximum subarray sum
        int maxSum = Integer.MIN_VALUE, tempSum, start = 0, end = 0;

        for (int i = 0; i < size; i++) {
            tempSum = 0;
            for (int j = 0; j < size; j++) {
                tempSum += array[j];
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                    start = i;
                    end = j;
                }

            }

        }
        // print all
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));

        scanner.close();

    }

}
