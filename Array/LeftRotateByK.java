import java.util.*;
public class LeftRotateByK {
    static void LeftRotate(int ar[],int start,int end){
        while(start<end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
    static void Rotate(int ar[],int k,int sz){
        LeftRotate(ar, 0, k-1);
        LeftRotate(ar, k, sz-1);
        LeftRotate(ar, 0, sz-1);
    }   
    
    public static void main(String[] args) {
        int sz;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the size :");
        sz=sc.nextInt();
        int ar[]=new int[sz];

        System.out.println("Enter array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        int k;
        System.out.print("Enter the value of K :");
        k=sc.nextInt();
        if(k<sz){
            Rotate(ar,k,sz);
        }else{
            System.out.println("K is Larger than the array size");
            return;
        }
        for(int x : ar){
            System.out.print(x+" ");
        }


    }
}
