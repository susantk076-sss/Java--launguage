import java.util.Scanner;
public class Circlefunction {
    static double circumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double r;
        System.out.println("Enter the radius of the circle:");
        r=sc.nextDouble();
        double result=circumference(r);
        System.out.println("Circumference=" +result);
    }
}
