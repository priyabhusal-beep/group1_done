import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.println("Enter numbers (type 0 to stop):");

        while (true) {
            number = sc.nextInt();

            if (number == 0) {
                break; // stop when user enters 0
            }

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        int totalSum = evenSum + oddSum;

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Total sum: " + totalSum);

        sc.close();
    }
}
