import java.util.*;
public class SecondSmallestLargestArray {
    static void FindLargestSmallest(int ar[],int sz){
        int lar=ar[0];
        int small=ar[0];
        int secondLar=0,secondSmall=0;
        for(int i=0;i<sz;i++){
            if(ar[i]>lar){
                secondLar=lar;
                lar=ar[i];
            }else if(ar[i]>secondLar && secondLar!=lar){
                secondLar=ar[i];
            }
            if(ar[i]<small){
                secondSmall=small;
                small=ar[i];
            } else if(ar[i]<secondSmall && secondSmall!=small){
                secondSmall=ar[i];
            }
        }
        System.err.print("Largest :"+lar);
        System.err.println();
        System.err.print("2nd Largest :"+secondLar);
        System.err.println();
        System.err.print("Smallest :"+small);
        System.err.println();
        System.err.print("2nd Smallest :"+secondSmall);
        
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int sz;

        //@java.avi
        System.out.print("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz+1];

        System.out.println("Enter the array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        FindLargestSmallest(ar, sz);
    }
}
