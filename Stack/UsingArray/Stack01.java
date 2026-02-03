import java.util.*;

public class Stack01 {
    public static int top =-1;
    public static int max =5;
    public static int Stack[]=new int[max];

    public static void Push(int x){
        if(top==max-1){
            System.out.print("Stack Overflow!");
        }else{
            Stack[++top]=x;
            System.out.print(x+" is Pushed onto stack");
        }

    }

    public static void Pop(){
        if(top==-1){
            System.out.print("Stack Underflow!");
        }else{
            System.out.print(Stack[top]+" is Pop from stack!");
            top--;
        }
    }

    public static void Peek(){
        System.out.print("Peek value : "+Stack[top]);
    }

    public static void Display(){
        System.out.print("Stack value are : ");
        for(int i=top;i>=0;i--){
            System.out.print(Stack[i]+" ");
        }
    }
    
    public static void main (String Avi[]){
        Scanner sc=new Scanner(System.in);
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
