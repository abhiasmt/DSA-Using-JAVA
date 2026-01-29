//Find the contiguous subarray whose product == no (Sliding Window Protocol => Time Complexity : O(n))

import java.util.*;
public class SubarrayWithGiveProduct {

    public static void FindSubArray(int a[],int sz,int no){
        int start=0;
        int end=1;

        int product =1;
        

        for(int i=0;i<sz;i++){
            product*=a[start];
            if(product>no){
                start++;
            }else if(product<no){
                end++;
            }
        }

        for(int i=start;i<=end;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String avi[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int sz=sc.nextInt();

        int a[]=new int[sz]; 
        System.out.print("Enter the Array : ");
        for(int i=0;i<sz;i++){
                a[i]=sc.nextInt();
        }

        System.out.print("Enter the product value : ");
        int no=sc.nextInt();
        FindSubArray(a, sz, no);
    }
    
}
