import java.util.*;

class DeletePos{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int sz,pos;

        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int arr[]=new int[sz+1];
        System.out.println("Enter the array :");
        for(int i=0;i<sz;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the position :");
        pos=sc.nextInt();

        for(int i=pos;i<sz;i++){
            arr[i-1]=arr[i];
        }

        sz--;

        System.out.println("New  array :");
        for(int i=0;i<sz;i++){
            System.out.println(arr[i]+" ");
        }
    }
}