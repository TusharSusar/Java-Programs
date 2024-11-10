import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        System.out.println("The Program To Display Product OF Two Numbers");
        
        int a,b,product;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number 1) : ");
        a = sc.nextInt();

        System.out.print("Enter The Number 2) : ");
        b = sc.nextInt();

        product = a*b;
        System.out.print("The Product of Two Number Is : "+product);
    }
}
