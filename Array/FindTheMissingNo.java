//Find the missing number between 1-n
import java.util.*;
public class FindTheMissingNo {
    static void FindMIss(int sz,int ar[]){
        int x =sz+1;
        int n=(x*(x+1))/2;
        int sum=0;
        for(int i=0;i<sz;i++){
            sum+=ar[i];
        }
        int val=n-sum;
        System.out.println("Missing No. :"+val);
    }
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int sz;
    System.out.print("Enter the size :");
    sz=sc.nextInt();
     int ar[]=new int[sz];
    System.out.println("Enter the array :");
    for(int i=0;i<sz;i++){
        ar[i]=sc.nextInt();
    }
        FindMIss(sz,ar);
    }
}
