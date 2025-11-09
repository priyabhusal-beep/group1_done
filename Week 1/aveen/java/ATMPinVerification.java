import java.util.Scanner;

public class ATMPinVerification {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;  
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        boolean accessGranted = false;

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = input.nextInt();
            attempts++;

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted");
                accessGranted = true;
                break;
            } else {
                if (attempts < 3) {
                    System.out.println("Incorrect PIN, try again");
                }
            }
        }

        if (!accessGranted) {
            System.out.println("Account locked");
        }

        input.close();
    }
}
