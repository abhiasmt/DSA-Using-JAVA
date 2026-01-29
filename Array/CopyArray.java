import java.util.*;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sz;
        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];
        int cop[]=new int[sz];

        System.out.println("Enter the array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();

            cop[i]=ar[i];
        }

        System.out.println("Copy array :");
        for(int i=0;i<sz;i++){
            System.out.print(cop[i]+" ");
        }
    }
}
