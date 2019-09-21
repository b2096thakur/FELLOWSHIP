package FunctionsPrograms;
import java.util.*;
public class Quad {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double root1;
	double root2;
	System.out.println("enter the value of a in quadratic equation");
  double a=sc.nextDouble();
  System.out.println("enter the value of b in quadratic equation");
  double b=sc.nextDouble();
  System.out.println("enter the value of c in quadratic equation");
   double c=sc.nextDouble();
   double d=Math.sqrt((Math.pow(b,2))-4*a*c);
   if(d>0) {
	   
    root1=(- b + d / (2 * a));
   root2=(- b - d / (2 * a));
   
	System.out.println(root1);
	System.out.println(root2);
   }
   else if(d==0){
	   
		   System.out.println(-b/2*a);
		   }
   else {
	   System.out.println("Root1 is" +  -b/(2*a) + "+i" +-d/(2*a) );
	   System.out.println("Root1 is" +  -b/(2*a) + "-i" +-d/(2*a) );
            
		   }
		   
		   
	   
}
	}


