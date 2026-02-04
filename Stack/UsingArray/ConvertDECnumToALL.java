import java.util.*;

public class ConvertDECnumToALL {
    public static int max=100;
    public static int top=-1;
    public static int St[]=new int[max];

    public static int Push(int x){
        return St[++top]=x;
    }

    public static int Pop(){
        return St[top--];
    }

    public static void DecToBin(int x){
        int n=x;
        while (x>0) {
            int val=(x%2);
            Push(val);
            x=x/2;
        }

        System.out.print("The Decimal value of " + n +" is : ");
        while (top>=0) {
            System.out.print(Pop()+" ");
        }
    }

    public static void DecToOctal(int x){
        int n=x;
        while (x>0) {
            int val=(x%8);
            Push(val);
            x=x/8;
        }

        System.out.print("The Decimal value of " + n +" is : ");
        while (top>=0) {
            System.out.print(Pop()+" ");
        }

    }

    public static void DecToHex(int x){
        int n=x;
        while (x>0) {
            int val=(x%16);
            Push(val);
            x=x/16;
        }

        System.out.print("The Decimal value of " + n +" is : ");
        while (top>=0) {
            int num=Pop();
            if(num>=10){
                char ch = (char) ('A' + (num - 10));
                System.out.print(ch+" "); 
            }
            else{
                System.out.print(num+" ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        

        int choice;
        
        do{
            System.out.println("\n1. Decimal to Binary \n2. Decimal to Octal \n3. Decimal to Hexadecimal \n4. Exit \nEnter Your Choice : ");
            choice = sc.nextInt();

       
                switch (choice) {
                case 1:
                    System.out.println("Enter the number : ");
                    int val=sc.nextInt();
                    DecToBin(val);
                    break;
                case 2:
                    System.out.println("Enter the number : ");
                    val=sc.nextInt();
                    DecToOctal(val);
                    break;
                case 3:
                    System.out.println("Enter the number : ");
                    val=sc.nextInt();
                    DecToHex(val);
                    break;
                case 4:
                    break;
        
                default:
                    break;
            }
        }while (choice!=4);

        
    }
}
