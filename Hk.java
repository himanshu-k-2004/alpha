import java.util.*;
public class Hk {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2;i<=n-1;i++){
            if(i%2==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Your number = "+isprime(n));
    }
    
}
