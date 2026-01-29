import java.util.*;

public class DuplicateElement {
    public static void main(String args[]){
        int sz,temp=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size :");
        sz=sc.nextInt();

        int ar[]=new int[sz];

        System.out.println("Enter the array :");

         
        for(int i=0;i<sz;i++){
           while(true){
            temp=sc.nextInt();
            boolean dup = false;

            for(int j=0;j<i;j++){
                if(ar[j]==temp){
                    dup=true;
                    break;
                }

            }
            if(dup){
                System.out.println("Duplicate Element Retry");
            }else{
                ar[i]=temp;
                break;
            }

           }
            
        }
        System.out.println("Array :");
        for(int i=0;i<sz;i++){
            System.out.println(ar[i]+" ");
        }
    }


    
}
