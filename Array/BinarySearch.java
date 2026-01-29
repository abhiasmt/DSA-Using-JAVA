import java.util.*;
public class BinarySearch {

    static void BubbleSort(int ar[],int sz){
        for(int i=0;i<sz-1;i++){
            for(int j=0;j<sz-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

    static int BinarySearchfun(int ar[],int sz,int x){
        BubbleSort(ar,sz);
        int start=0;
        int end=sz-1;
        //@java.avi
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid]==x){
                return mid;
            }else if(ar[mid]>x){
                start=mid-1;
            }else{
                end=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int sz,x;
        System.out.print("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        System.out.println("Enter the no. you want to search :");
        x=sc.nextInt();

        int n=BinarySearchfun(ar, sz, x);
        System.out.println("Searchable element is in : "+n);
    }
}
