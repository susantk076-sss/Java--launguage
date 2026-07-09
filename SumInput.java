import java.util.Scanner;
public class SumInput{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        int sum= a+b;
        System.out.println("Sum="+sum);
        }
}
