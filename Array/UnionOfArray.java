import java.util.*;
public class UnionOfArray {

    static void Union(int sz1,int sz2,int ar1[],int ar2[]){
        int temp[]=new int[sz1+sz2];
        int k=0;
        for(int i=0;i<sz1;i++){
            temp[k++]=ar1[i];
        }
        for(int i=0;i<sz2;i++){
           boolean found =false;

           for(int j=0;j<k;j++){
                if(temp[j]==ar2[i]){
                    found=true;
                    break;
                }
           } //@java.avi
           if(!found){
                temp[k++]=ar2[i];
            }
        }

        System.out.println("Union array : ");
        for(int i=0;i<k ;i++){
            System.out.print(temp[i]+" ");
        }
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of 1st array :");
        int sz1=sc.nextInt();
        System.out.print("Enter the size of 2nd array :");
        int sz2=sc.nextInt();

        int ar1[]=new int[sz1+1];
        int ar2[]=new int[sz2+1];

        System.out.println("Enter 1st array"); 
        for(int i=0;i<sz1;i++){
            ar1[i]=sc.nextInt();
        }

        System.out.println("Enter 2nd array"); 
        for(int i=0;i<sz2;i++){
            ar2[i]=sc.nextInt();
        }
        Union(sz1, sz2, ar1, ar2);
    }
}
