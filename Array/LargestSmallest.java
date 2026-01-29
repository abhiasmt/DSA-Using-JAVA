import java.util.*;
public class LargestSmallest {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int sz;

        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];
        int max=ar[0];
        int min=ar[0];

        System.out.println("Enter array :");
        for(int i=0;i<sz;i++){  
            ar[i]=sc.nextInt();

            if(ar[i]>max){
                max=ar[i];
            }
            if(ar[i]<min){
                min=ar[i];
            }
        }

    
        System.out.println("Max is :"+max);
        System.out.println("Min is :"+min);
        

    }
}
