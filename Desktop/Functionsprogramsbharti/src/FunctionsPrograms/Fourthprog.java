package FunctionsPrograms;
import java.util.*;
public class Fourthprog {

	public static void main(String[] args) {
	int x;
	Scanner scan=new Scanner(System.in);
	x=scan.nextInt();
	Double sum=0.0;
	for(int i=1;i<=x;i++)
	{
		sum=sum+(1.0/i);
	}
System.out.println(sum);
	}

}
