import java.util.*;
public class Himanshu{
    public static int calculatesum(int a, int b){
        int sum = a+b;
        System.out.println("sum = "+sum);
        return sum;
    }
    public static int multiply(int a ,int b){
        int product = a*b;
        System.out.println("Mulitply = "+product);
        return product;
    }
    public static int factorial(int n){
        int f = 1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial = "+f);
        return f;
    }
    public static int bincoff(int n , int r){
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nr_fact = factorial(n-r);
        int bc = n_fact/r_fact*nr_fact;
        System.out.println("Bincoff = "+ bc);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        System.out.print("Enter value of r = ");
        int r = sc.nextInt();
        
        bincoff(n, r);
    }
    
}