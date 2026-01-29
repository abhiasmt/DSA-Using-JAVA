import java.util.*;
public class IntersectionOfArray {

    static void Intersection(int ar1[],int ar2[],int sz1,int sz2){
        int temp[]=new int[sz1+sz2];
        int k=0;

        for(int i=0;i<sz1;i++){
            for(int j=0;j<sz2;j++){
                if(ar1[i]==ar2[j]){
                    boolean exist=false;
                    for(int x=0;x<k;x++){//For the 1st  ar1[i] this loop will not run
                        if(temp[x]==ar1[i]){
                            exist =true;
                            break;
                        }
                    }
                    if(!exist){
                        temp[k++]=ar1[i];
                    }
                
                }
            }
        }
        System.out.println("Intersection of both array :");
        for(int i=0;i<k;i++){
            System.out.print(temp[i]+"  ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first element :");
        int sz1=sc.nextInt();
        System.out.print("Enter the size of 2nd element :");
        int sz2=sc.nextInt();

        int ar1[]=new int[sz1];
        int ar2[]=new int[sz2];

        System.out.print("Enter the 1st array :");
        for(int i=0;i<sz1;i++){
            ar1[i]=sc.nextInt();
        }
 
        System.out.print("Enter the 2nd array :");
        for(int i=0;i<sz2;i++){
            ar2[i]=sc.nextInt();
        }

        Intersection(ar1, ar2, sz1, sz2);
    }
}
