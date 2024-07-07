import java.util.Scanner;

public class Main {
    static void noType(int no) {
        if(no<0)
        {
           System.out.println("Negative no");
        }
        else if(no>0)
        {
            System.out.println("positive no");
        }
        else
        {
            System.out.println("ZERO");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        noType(no);
    }
}
