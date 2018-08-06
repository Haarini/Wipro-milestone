import java.util.*;
import java.lang.*;
import java.util.Scanner;
//fibonacci series program
class Fibonacci
{  
 public static void main(String[] args)
 {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s.nextInt();
        int  f = 0, s = 1;
        System.out.println("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(f + " + ");

            int sum = f + s;
            f = s;
            s = sum;
        }
    }
}
