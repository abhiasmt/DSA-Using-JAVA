import java.util.*;
public class RemoveDuplicateArray {

    static void BubbleSort(int ar[],int sz){
        for(int i=0;i<sz-1;i++){
            for(int j=i;j<sz-i-1;i++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sz;
        System.out.print("Enter the size :");
        sz=sc.nextInt();
        System.out.println("Enter the array :");
        int ar[]=new int[sz+1];
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }
        int val=-1,index=-1,found=0;

        BubbleSort(ar, sz);//Calling bubble sort func.
        //Checking duplicate element
        for(int i=0;i<sz;i++){
            if(ar[i]==ar[i+1]){
                val=ar[i];
                index=i+1;
                found++;
            }
        }
        //Delete duplicate element 
        for(int i=index;i<sz;i++){
            ar[i-1]=ar[i];
        }
        sz--;

        //@java.avi

        if(found!=0){
            System.out.print("Duplicate value :"+val);
            System.out.println();
        
            System.out.println("New array :");
            for(int i=0;i<sz;i++){
                System.out.print(" "+ar[i]+" ");
            }
        }
        System.out.println("No Duplicate value");
    }
}
