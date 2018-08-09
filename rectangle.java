//To find geometric ratios of a rectangle when its breadth is given
import java.util.*;
import java.util.Scanner;
class rectangle
{  
    public static void main(String args[])
    {
     double l,b,peri,area;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter breadth of rectangle");
     b=s.nextInt();
     l=1.5*b;
     System.out.println("Length of rectangle is"+l"meters");
     area=l*b;
     System.out.println("Area of rectangle is"+area"sq.ms");
     peri=2*(l+b);
     System.out.println("Perimeter of rectangle is"+peri"meters");

    }
}
