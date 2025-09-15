import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter num1: ");
        int num1 = input.nextInt();
        System.out.print(" Please enter num2: ");
        int num2 = input.nextInt();
        System.out.print(" Please enter num3: ");
        int num3 = input.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println(" Num1 is greater ");
        }
        else if (num2>num1 && num2>num3){
            System.out.println(" Num2 is greater ");
        }
        else{
            System.out.println(" Num3 is greater ");
        }
    }
}