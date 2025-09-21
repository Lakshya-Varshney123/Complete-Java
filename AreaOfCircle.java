import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:");
        float rad = in.nextFloat();
        System.out.print(rad);
        float area = 22/7*(rad*rad);
        System.out.println(area);
       
    }
}
