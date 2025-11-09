import java.util.Scanner;
public class Question4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);         
        for (int i = 1; i <=10; i++) {
           
                System.out.println("Enter integer :  ");
                int num = sc.nextInt();

            if (num % 2 == 0 && num > 20) {
                System.out.println(num + "is even and greater than 20.");
            }

        }
        sc.close();    
    }
}

