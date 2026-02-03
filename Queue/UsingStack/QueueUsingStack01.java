import java.util.*;

public class QueueUsingStack01 {
    public static int top1=-1,top2=-1;
    public static int max=5;
    public static int St1[]=new int[max], St2[]=new int[max];

    public static int Push1(int x){
        return St1[++top1]=x;
    }

    public static int Pop1(){
        return St1[top1--];
    }

    public static int Push2(int x){
        return St2[++top2]=x;
    }

    public static int Pop2(){
        return St2[top2--];
    }

//----------------------------------------------------------------------//

    public static void EnQ(int x){
        if(top1==max-1){
            System.out.print("Queue Overflow!");
        }else{
            St1[++top1]=x;
            System.out.print(x+" is Enqueued to queue");
        }
    }

    public static void DeQ(){
        for(int i=top1;i>=0;i--){
            int x=Pop1();
            Push2(x);
        }

        System.out.print(St2[top2--]+"is Dequeued");

        for(int i=top2;i>=0;i--){
            int x=Pop2();
            Push1(x);
        }

    }
    public static void Front(){
        for(int i=top1;i>=0;i--){
            Push2(Pop1());
        }
        System.out.print(St2[top2]+"is Front value");

        for(int i=top2;i>=0;i--){
            Push1(Pop2());
        }

    }

    public static void Display(){
        System.err.print("Queue is:  ");
        for(int i=0;i<=top1;i++){
            System.out.print(St1[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int choice;
        
    do{
        System.out.println("\n1. EnQ() \n2. DeQ() \n3. Front() \n4. Display \n5. Exit \nEnter Your Choice : ");
        choice = sc.nextInt();

       
            switch (choice) {
            case 1:
                System.out.print("Enter the value : ");
                int val=sc.nextInt();
                EnQ(val);
                break;
            case 2:
                DeQ();
                break;
            case 3:
                Front();
                break;
            case 4:
                Display();
                break;
            case 5:
                break;
        
            default:
                break;
        }
    }while (choice!=5);

        
    }
}
