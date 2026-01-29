import java.util.Scanner;
class InsertPos{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int sz,n,pos;
    System.out.println("Enter the size :");
    sz=sc.nextInt();

    int arr[]=new int[sz+1];//Array declaration with the size(sz) as input
    //sz+1 is use bcz of index out of bound in Java🙂 
    
    System.out.println("Enter the array : ");
    for(int i=0;i<sz;i++){
        arr[i]=sc.nextInt();
    }

    System.out.println("Enter the position :");
    pos=sc.nextInt();

    System.out.println("Enter the element you want to add :");
    n=sc.nextInt();

    
    for(int i=sz;i>pos-1;i--){
        arr[i]=arr[i-1];
    }
    
    arr[pos-1]=n;
    sz++;
    
    

    System.out.println("New array :");
    for(int i=0;i<sz;i++){
        System.out.println(arr[i]+" ");
    }
    }
}
