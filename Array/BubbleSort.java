import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sz,temp;
        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];
        System.out.println("Enter array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        for(int i=0;i<sz-1;i++){
            for(int j=0;j<sz-i-1;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }

        System.out.println("Sorted array :");
        for(int i=0;i<sz;i++){
            System.out.print(ar[i]+" ");
        }


    }
}
