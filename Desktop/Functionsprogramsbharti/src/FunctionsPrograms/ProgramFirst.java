package FunctionsPrograms;
import java.util.Scanner;
public class ProgramFirst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="hello username how are you";
		System.out.println(s1);
		String s2=sc.nextLine();
	    int len=s2.length();
	    if(len>3)
	    {
		System.out.println(s1.replace("username",s2));
	    }
	    else {
	    	System.out.println("invalid");
	    			
	    }
	}

}
