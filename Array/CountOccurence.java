import java.util.*;
public class CountOccurence {

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

    //Finding value of X in the array and Left sub array form mid
    static int CountLeft(int ar[],int sz,int x){
        BubbleSort(ar, sz);
        int low=0;
        int high=sz-1;
        int result =-1;

        while(low<=high){
            int mid=high-low/2;
            if(ar[mid]==x){
                result=mid;
                high=mid-1;
            }else if(ar[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }

     //Finding value of X in the array and Right sub array form mid
    static int CountRight(int ar[],int sz,int x){
        BubbleSort(ar, sz);
        int low=0;
        int high=sz-1;
        int result =-1;

        while(low<=high){
            int mid=high-low/2;
            if(ar[mid]==x){
                result=mid;
                low=mid+1;
            }else if(ar[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    
    static int Count(int ar[],int sz,int x){
        int first =CountLeft(ar, sz, x);
        if(first==-1){
            return 0;
        }
        //@java.avi
        int last =CountRight(ar, sz, x);
        return last-first+1;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int sz,x;
        System.out.print("Enter the size :");
        sz=sc.nextInt();
        int ar[]=new int[sz+1];
        System.out.println("Enter the array : ");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("Enter the searchable element :");
        x=sc.nextInt();

        int count =Count(ar, sz, x);
        System.out.println(x+ " appears "+count+" times ");
    }
}
