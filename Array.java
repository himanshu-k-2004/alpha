import java.util.*;
public class Array{
    public static void Subarray(int number[]){
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=1;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        Subarray(number);
    }
}