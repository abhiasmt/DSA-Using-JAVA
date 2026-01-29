import java.util.*;
public class LongestSequence {

    static void BubbleSort(int ar[],int sz){
        for(int i=0;i<sz-1;i++){
            for(int j=0;j<sz-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp =ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

    static void FindSequence(int ar[], int sz){
        int temp[]=new int[sz];

        BubbleSort(ar, sz);
        int count=0;
        for(int i=0;i<sz;i++){ 
            if(ar[i]+1==ar[i+1]){
                count++;
                temp[i]=ar[i];
                temp[i+1]=ar[i+1];
            }
        }
        System.out.println("Longest Sequence sub array :");
        for(int i=0;i<=count;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size :");
        int sz=sc.nextInt();

        int ar[]=new int[sz+1];

        System.out.println("Enter the array : ");
        for(int i=0;i<sz;i++){
            ar[i]=sc.nextInt();
        }

        FindSequence(ar, sz);
    }
}
