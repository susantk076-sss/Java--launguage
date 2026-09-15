import java.util.Scanner;
public class Gcdfunction {
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int result=gcd(num1,num2);
        System.out.println("GCD=" +result);
    }
    
}
