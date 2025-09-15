import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of terms for Fibonacci Series:");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        
        System.out.println("Fibonacci Series Is:");
        for (int i=0;i<n;i++){
            System.out.println(a + " ");
                
            int next = a + b;
            a = b;
            b = next;
        }

    }

}
