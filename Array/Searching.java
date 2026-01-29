import java.util.*;

class Searching{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int sz,n ,found=0;

        System.out.println("Enter the size :");
        sz=sc.nextInt();

        System.out.println("Enter the array :");
        int arr[]=new int[sz];

        for(int i=0;i<sz;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the searchable element :");
        n=sc.nextInt();

        for(int i=0;i<sz;i++){
            if(arr[i]==n){
                found=i;
                break;
            }
        }
        if(found!=0){
            System.out.println("Element at :"+(found+1)+" th position");
        }
        else{
            System.out.println("Element not found");
        }
    }
}