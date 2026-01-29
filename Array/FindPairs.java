import java.util.*;
public class FindPairs {

    static void FindPairsfun(int ar[],int sz,int x){
        int found=0;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz ;j++){
                if(ar[i]+ar[j]==x){
                    found++;
                    System.out.println(ar[i]+" and "+ar[j]);
                }
            }
        }if(found==0){
            System.out.print("Not Found");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sz;
        System.out.print("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];

        System.out.print("Enter the array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        System.out.print("Enter the Sum : ");
        int x=sc.nextInt();

        FindPairsfun(ar, sz, x);

    }
}
