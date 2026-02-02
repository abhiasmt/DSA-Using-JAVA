import java.util.*;
public class CountEvenNum {

    public static void CountNo(int Arr[]){
        int count =0;

        for (int i = 0; i < Arr.length; i++) {
            int no=Arr[i];
            if(no%2==0){
                count++;
            }
        }

        System.out.println("Total Even Num :- "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the size : ");
        int sz = sc.nextInt();

        int Arr[]= new int[sz];

        System.out.println("Enter the Array : ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i]=sc.nextInt();
        }

        CountNo(Arr);

    }   
}
