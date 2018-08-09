//to calculate the sum of even numbers up to N (excluding N) and print it.
import java.util.*;
import java.util.Scanner;
public class sum_even
{
void sum(int n) 
{
	int sum=0;
	for(int i=2;i<n;i=i+2)
  {
		sum=sum+i;
		
	}
	System.out.println(sum);
	
}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter N(limit) value");
	int n =s.nextInt();
	new sum_even().sum(n);
	s.close();
}
}
