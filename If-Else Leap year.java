import java.util.Scanner;

public class Main {
    static boolean leapYear(int year) {
        if(year%4==0)
        {
            if(year%100==0)
            {
                return year%400==0;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leapYear(year));
    }
}
