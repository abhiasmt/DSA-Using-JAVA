//Find frequency of each element in an array
import java.util.*;
public class FindFrequencyOfElememt {

    static void BubbleSort(int ar[],int sz){
        int temp=0;
        for(int i=0;i<sz-1;i++){
            for(int j=0;j<sz-i-1;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    //@java.avi

    //Function to find frequency of each element
    static void FindFrequency(int ar[],int sz){
        BubbleSort(ar, sz);

        int i,count=1;

        for( i=1;i<sz;i++){
            if(ar[i]==ar[i-1]){
                count++;
            }
            else{
                System.out.println(ar[i-1]+ " appears "+count+" times");
                count=1;
                
            }
        }
        
        System.out.println(ar[sz-1]+ " appears "+count+" times");

    }
    //@java.avi

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sz; 

        System.out.println("Enter size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];

        System.out.println("Enter Array :");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }
        FindFrequency(ar, sz);

        //@java.avi
    }
    
}
