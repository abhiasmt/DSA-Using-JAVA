import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sz;

        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];
        System.out.println("Enter array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        int st=0,end=sz-1,temp;

        while (st<end) {
            temp=ar[st];
            ar[st]=ar[end];
            ar[end]=temp;

            st++;
            end--;
        }

        System.out.println("New array :");
        for(int i=0;i<sz;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
