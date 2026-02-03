import java.util.*;
public class StackUsingQueue01 {
    public static int rear1=-1, front1=-1,rear2=-1,front2=-1;
    public static int max = 5;
    public static int Q1[]=new int[max],Q2[]=new int[max];

    public static int EnQ1(int x){
        if(rear1==max-1){
           return -1;
        }else if(front1==-1 && rear1==-1){
            front1=rear1=0;
            return Q1[rear1]=x;
        }else{
            return Q1[++rear1]=x;
        }
    }

    public static int DeQ1(){
        if(front1==-1){
            return -1;
        }else if(front1==rear1){
            int x=front1;
            front1=rear1=-1;
            return x;
        }else{
            return Q1[front1++];
        }
    }

//------------------Queue 2-------------------//


    public static int EnQ2(int x){
        if(rear2==max-1){
           return -1;
        }else if(front2==-1 && rear2==-1){
            front2=rear2=0;
            return Q2[rear2]=x;
        }else{
            return Q2[++rear2]=x;
        }
    }

    public static int DeQ2(){
        if(front2==-1){
            return -1;
        }else if(front2==rear2){
            int x=front2;
            front2=rear2=-1;
            return x;
        }else{
            return Q2[front2++];
        }
    }


    //--------------------------------------Stack task---------------------------------//


    public static void Push(int x){
        if(rear1==max-1 || rear2==max-1){
            System.out.print("Stack Overflow!");
        }else{
            for(int i=front1;i<=rear1;i++){
                EnQ2(DeQ1());
            }
            EnQ1(x);
            System.out.print(x+" is Pushed onto stack");
            for(int i=front2;i<=rear2;i++){
                EnQ1(DeQ2());
            }
            
        }

    }

    public static void Pop(){
        if(front1==-1){
            System.out.print("Stack Underflow!");
        }else{
            System.out.print(Q1[front1++]+" is Pop from stack!");
        }
    }

    public static void Peek(){
        System.out.print("Peek value : "+Q1[front1]);
    }

    public static void Display(){
        System.out.print("Stack value are : ");
        for(int i=front1;i<rear1;i++){
            System.out.print(Q1[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int choice;
        
    do{
        System.out.println("\n1. Push() \n2. Pop() \n3. Peek() \n4. Display \n5. Exit \nEnter Your Choice : ");
        choice = sc.nextInt();

       
            switch (choice) {
            case 1:
                System.out.print("Enter the value : ");
                int val=sc.nextInt();
                Push(val);
                break;
            case 2:
                Pop();
                break;
            case 3:
                Peek();
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

