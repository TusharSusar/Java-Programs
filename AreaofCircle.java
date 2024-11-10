import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        // Area of a circle = πr^2
        
        float pi = 3.14f;
        float radius,area;

        System.out.println("Program To Display Area of circle");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        radius = sc.nextFloat();

        area = pi * radius * radius;
        System.out.print("The Area Of Circle Is : "+area);
    }
}
