//Find sum of array without using loop (Recursion)
import java.util.*;
public class FindSumOfArray {
    static int Findsum(int j, int ar[],int sz){
       if(j==sz){
        return 0;
       }
       else{
        return ar[j]+Findsum(j+1, ar, sz);
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sz;
        System.out.print("Enter size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];
        System.out.println("Enter the values :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }
        int sum = Findsum(0, ar, sz);
        System.out.print("Sum of the array :"+sum);

    }
}
