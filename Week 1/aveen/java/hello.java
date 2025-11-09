import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int pw=1234;
        String username="new";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String usernameInput =sc.nextLine();
        System.out.println("enter pw");
        int pwInput=sc.nextInt();
        if (usernameInput.equals(username) && pwInput == pw){
            System.out.println("Matched");
        }
        else{
            System.out.println("None Matched");
        }

    }
    
}
