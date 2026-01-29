import java.util.*;
public class LeadersOfArray {

    static void FindLeaders(int ar[],int sz){
        int leader[]=new int[sz];
        int max=0;
        int k=0;

        for(int i=sz-1;i>=0;i--){
            if(max==0){
                max=ar[i];
                leader[k++]=max;
            }else if(max<ar[i]){
                max=ar[i];
                leader[k++]=max;
            }
        }
        System.out.println("Leaders array : ");
        for(int i=k-1;i>=0;i--){
            System.out.print(leader[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size :");
        int sz=sc.nextInt();

        int ar[]=new int[sz];
        System.out.println("Enter the array : ");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        FindLeaders(ar, sz);
    }
}
