import java.util.Scanner;
public class NaturalNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = in.nextInt();
        int sum = 0;
        for (int i=0;i<=n;i++){
            sum = sum + i;            
        }
        System.out.println("The sum of n natural numbers is:" + (sum));
    }
}
