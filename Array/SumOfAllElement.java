import java.util.*;
public class SumOfAllElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sz,n=0;
        int sum=0;
        
        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];

        System.out.println("Enter the array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();

            sum +=ar[i];
            n++;
        }
        float avg=sum/n;
        System.out.println("Sum :"+sum);
        System.out.println("Avg :"+avg);

        
    }
    
}
