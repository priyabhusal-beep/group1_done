import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        short var1 = 1234;
        String var2 = "new";
        Scanner vc = new Scanner(System.in);
        System.out.println("enter username");
        String var4 = vc.nextLine();
        System.out.println("enter pw");
        int var5 = vc.nextInt();

        int i=1;
        while(i<6){
             if (var4.equals(var2) && var5 == var1) {
                System.out.println("Matched");
                break;
             }
             else{
                System.out.println("Wrong");
                continue;   
            

            
        }
     
         }
         i++;
}

   }  