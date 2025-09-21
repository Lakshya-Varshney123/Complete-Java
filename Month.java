import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num value:");
        int num = in.nextInt();       
        if (num==1){
            System.out.println("JANUARY");
        }
        else if(num==2){
            System.out.println("FEBRUARY");
        }
        else if(num==3){
            System.out.println("MARCH");
        }
        else if(num==4){
            System.out.println("APRIL");
        }
        else if(num==5){
            System.out.println("MAY");
        }
        else if(num==6){
            System.out.println("JUNE");
        }
        else if(num==7){
            System.out.println("JULY");
        }
        else if(num==8){
            System.out.println("AUGUST");
        }
        else if(num==9){
            System.out.println("SEPTEMBER");
        }
        else if(num==10){
            System.out.println("OCTOBER");
        }
        else if(num==11){
            System.out.println("NOVEMBER");
        }
        else if(num==12){
            System.out.println("DECEMBER");
        }
        else{
            System.out.println("YOUR CHOICE IS VERY BAD...");
        }
    }
}
