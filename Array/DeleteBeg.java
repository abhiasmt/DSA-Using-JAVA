import java.util.*;
class DeleteBeg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int sz;
        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int arr[]=new int[sz+1];

        System.out.println("Enter the no :");
        for(int i=0;i<sz;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<sz;i++){
            arr[i]=arr[i+1];
        }
        sz--;

        System.out.println("New array :");
        for(int i=0;i<sz;i++){
            System.out.println(arr[i]+" ");
        }
    }
}