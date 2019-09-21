package FunctionsPrograms;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year = sc.nextInt();
	
		while (year < 999 || year > 9999) {
			System.out.println("wrong input   ,please enter 4 digit year");
			
			year = sc.nextInt();
		}
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	


	}
}


