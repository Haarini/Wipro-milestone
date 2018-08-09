import java.util.Scanner;
import java.util.*;
//To find dimensions of a cone

public class cone 
{
	void cone_dim(double r,double h) 
  {
    double sa,v;
    sa=(3.14 * r * (r + Math.sqrt(r*r + h*h)));
    v=1.0/3.0*3.14*r*r*h;
		System.out.println("Surface area="+sa);
		System.out.println("Volume="+v);
		
	}
	public static void main(String args[])
  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius and height of cone");
		double r=s.nextDouble();
		double h=s.nextDouble();
		new cone().cone_dim(r,h);

		s.close();
	}

}
