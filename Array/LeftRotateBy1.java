import java.util.*;
public class LeftRotateBy1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sz;
        System.out.print("Enter array size :"); 
        sz=sc.nextInt();

        int ar[]=new int[sz];

        System.out.println("Enter the array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        int cashe=ar[0];
        for(int i=1;i<sz;i++){
            ar[i-1]=ar[i];
        }ar[sz-1]=cashe;

        System.out.println("New array :");
        for(int i=0;i<sz;i++){
            System.out.print(" "+ar[i]+" ");
        }
    }
}
