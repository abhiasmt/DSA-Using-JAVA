import java.util.*;
public class RemoveAllOccuredElement {

    public static void RemoveOccuredElement(int Arr[],int n){
        int temp[]=new int[Arr.length];
        int k=0;
        for (int i = 0; i < Arr.length; i++) {
            if(n!=Arr[i]){
                temp[k]=Arr[i];
                k++;
            }
        }
        int tempSz=k;

        System.out.println("The New Sub Array : ");
        for (int i=0; i <tempSz; i++) {
            System.out.print(temp[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the size : ");
        int sz=sc.nextInt();

        int Arr[]=new int[sz];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i]=sc.nextInt();
        }

        System.err.println("Enter the Removal element : ");
        int num = sc.nextInt();

        RemoveOccuredElement(Arr, num);
    }
}
