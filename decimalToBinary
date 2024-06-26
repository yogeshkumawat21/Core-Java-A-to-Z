import java.util.*;
public class M
{
    static void decimalToBinary(int num)
    {
        int[] arry= new int[100];
        int i=0;
        while(num>0)
        {
           arry[i]=num%2;
           num=num/2;
           i++;
        }
        for(int j=i-1;j>=0;j--)
        {
         System.out.print(arry[j]);
        }
        
    }
    public static  void main(String[] args)
    {
        System.out.println("Enter decimal no ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        decimalToBinary(no);
          
    }
}
