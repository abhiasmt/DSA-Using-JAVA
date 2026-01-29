import java.util.Scanner;
class InsertEnd{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int sz,n;
    System.out.println("Enter the size :");
    sz=sc.nextInt();

    int arr[]=new int[sz+1];//Array declaration with the size(sz) as input
    
    System.out.println("Enter the array : ");
    for(int i=0;i<sz;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element you want to add :");
    n=sc.nextInt();

    
    // for(int i=sz;i>0;i--){
    //     arr[i]=arr[i-1];
    // }
    
    arr[sz]=n;
    sz++;
    
    

    System.out.println("New array :");
    for(int i=0;i<sz;i++){
        System.out.println(arr[i]+" ");
    }
    }
}
