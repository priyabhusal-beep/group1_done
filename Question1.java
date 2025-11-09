public class Question1 {
    public static void main(String[] args) {
    
        for (int i = 1; i <= 50; i++) {
            
            // if divisible by BOTH 3 and 5 → stop the loop
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found number divisible by both 3 and 5: " + i);
                break;
            }
            
            // if divisible by 3 OR 5 (but not both) → print
            else if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
            





             










