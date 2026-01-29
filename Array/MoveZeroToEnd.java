import java.util.*;
public class MoveZeroToEnd {

    static void MoveZero(int ar[],int sz){
        int found=0,index=-1;
        for(int i=0;i<sz;i++){
            if(ar[i]==0){
                found++;
                index=i;
                int val=ar[i];
                for(int j=index;j<sz;j++){
                    ar[j]=ar[j+1];
                    ar[sz]=val;
                }
            }
        }
        if(found!=0){
            System.out.println("New array :");
            for(int i=0;i<sz;i++){
                System.out.print(" "+ar[i]+" ");
            }
        }else{
            System.out.println("There is no Zero");
        }
    }

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int sz;

        System.out.print("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz+1];

        System.out.println("Enter the array :");

        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        MoveZero(ar, sz);

    }

    
}
