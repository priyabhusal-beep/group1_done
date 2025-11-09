 //5 Write a Java program that prints the sum of even numbers and the product of odd numbers between 1 and 10 using a for loop and if condition.
public class Question5 {
    public static void main (String[] args) {

        int odd =0;
        int even=1;
        for(int i=1;i<10;i++){
            if (i%2==0){
                
                even+=i;
                
            }
            else{
                odd*=i;
            }
        }
        System.out.println("EvenNum_sum= "+even);
        System.out.println("OddNum_Product= "+odd);
    }
}
