import java.util.*;

public class sum {
    public static void main(String[] args) {
        // int a,b,sum;
        int a;
        int b;
        int sum;
        
        System.out.println("Program To Calculate The Sum Of two Numbers\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1) : ");
        a = sc.nextInt();

        System.out.print("Enter Number 2) : ");
        b = sc.nextInt();

        sum = a+b;

        System.out.print("The Sum Of Two Nmber Is : "+sum);
    }    
}
