package FunctionsPrograms;
import java.util.Scanner;
public class gambler {
	public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter stake value");
    int stake=sc.nextInt();
    System.out.println("enter goal value");
    int goal=sc.nextInt();
    System.out.println("enter the no of times");
    int n=sc.nextInt();
    int bets=0;
    int wins=0;

    for(int i=0;i<n;i++)
    {
	int cash=stake;
	
	while(cash>0 && cash<goal) {
		bets++;
	
		if (Math.random() < 0.5) 
			cash++;  
		else                     
			cash--;    
	}
	if (cash == goal) 
    	wins++;                
	}
    System.out.println();
	System.out.println(wins + " wins of " + n);
	System.out.println("Percent of games won = " + 100.0 * wins /n);
	System.out.println("Avg # bets           = " + 1.0 * bets /n);
}
	}


