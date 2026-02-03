import java.util.*;

public class Queue01 {
    public static int rear = -1, front = -1;
    public static int max = 5;
    public static int Queue[]=new int[max];

    public static void EnQ(int x){
        if(rear==max-1){
            System.err.print("Queue is Full");
        }else if(front==-1 && rear==-1){
            front=rear=0;
            Queue[rear]=x;
            System.err.print(x+" is EnQueued !");
        }else{
            Queue[++rear]=x;
            System.err.print(x+" is EnQueued !");
        }
    }

    public static void DeQ(){
        if(front==-1){
            System.out.print("Queue is Empty !");
        }else if(front==rear){
            System.out.print(front+" is DeQueued !");
            front=rear=-1;
        }else{
            System.out.print(Queue[front]+" is DeQueued !");
            front++;
        }
    }

    public static void Front(){
        System.out.println(Queue[front]+" is the Front value");
    }

    public static void Display(){
        System.out.print("Queue : ");
        for(int i=front;i<=rear;i++){
            System.out.print(Queue[i]+ " ");
        }
    }

    public static void main(String Avi[]){
        Scanner sc =new Scanner(System.in);

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
