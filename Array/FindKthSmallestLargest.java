import java.util.*;
public class FindKthSmallestLargest {

    static void BubbleSort(int ar[],int sz){
        for(int i=0;i<sz-1;i++){
            for(int j=0;j<sz-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp =ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

    static void FindSmallesLargest(int ar[],int sz, int k){
        BubbleSort(ar, sz);
        int smallest=ar[0+k-1];
        int largest=ar[sz-k];

        System.out.print(k+" th Smallest element : "+smallest );
        System.out.println();
        System.out.println(k+" th Largest element : "+largest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size :");
        int sz=sc.nextInt();
        int ar[]=new int[sz+1];
        System.out.println("Enter the array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the k th value :");
        int k=sc.nextInt();

        FindSmallesLargest(ar,sz,k);
    }
}
