import java.util.*;
public class Main 

{
    static void game(char A,char B)
    {
        if((A =='r' && B=='s') ||( A=='s' && B=='p'))
        {
           System.out.println("A wins");
        }
        else if((A =='r' && B=='r') ||( A=='s' && B=='s') ||(A =='r' && B=='p' )||(A =='p' && B=='r' ))
        {
           System.out.println(" tie");
        }
        if((B =='r' && A=='s') ||( B=='s' && A=='p'))
        {
           System.out.println("B wins");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("if rock then enter 'r' if scissor 's' or paper 'p' ");
        System.out.println("Enter person A :  ");
        char A= sc.next().charAt(0);
        System.out.println("Enter person B");
        char B= sc.next().charAt(0);
        game(A,B);

        
     }
}
