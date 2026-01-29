//Give an array , find a continuous subarray whose sum == n.
import java.util.*;
public class SubarrayWithGivenSum {

    public static void FindSubArray(int a[],int no,int sz){
        int x=0;
        int y=0;
        boolean Notfound=false;

        for(int i=0;i<sz;i++){
            int sum =0;
            for(int j=i;j<sz;j++){
                sum+=a[j];
                if(sum==no){
                    x=i;
                    y=j;
                    break;
                }
                else if(sum>no){
                    break;
                }
                else if(sum!=no){
                    Notfound=true;
                }

            }
        }
        if(Notfound==true){
            System.out.print("Array Not Found ! ");
        }else{
            for(int i=x;i<=y;i++){
                System.out.print("The Sub Array : "+a[i]+" ");
            }
        }
        
        
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int sz=sc.nextInt();

        int ar[]=new int[sz];

        System.out.print("Enter the Array : ");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        System.out.print("Enter the value : ");
        int no=sc.nextInt();

        FindSubArray(ar, no, sz);
    }
}
