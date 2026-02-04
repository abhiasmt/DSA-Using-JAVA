import java.util.*;
public class ReverseString {
    public static int top=-1; 
    public static int max=50;
    public static char Stack[]=new char[max];

    public static char Push(char x){
        return Stack[++top]=x;
    }

    public static char Pop(){
        return Stack[top--];
    }

    public static void Reverse(String s){
        for (int i = 0; i < s.length(); i++) {
            Push(s.charAt(i));   
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(Pop());   
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        Reverse(str);
    }
}
