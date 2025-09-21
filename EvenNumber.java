import java.util.Scanner;
public class EvenNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = in.nextInt();
        System.out.println("Even numbers from 1 to" + " " + n +" " + "are:");
        for (int i=2;i<=n;i+=2){                        
            System.out.print(i + " ");                        
        }
    }
}
