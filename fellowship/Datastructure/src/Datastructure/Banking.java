package Datastructure;
import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		Queue q=new Queue(7);
		int ch = 0;
		do {
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Exit");
		  	System.out.println("Enter your choice: ");
		   	int choice=sc.nextInt();
		   	switch (choice) 
		   	{
  case 1: 
	  
     System.out.println("enter the amount you want to deposite");
        int item= sc.nextInt();
         q.enqueue(item);
		   	q.peek();
		   	break;
		   	
		   	case 2:
		   		
System.out.println("enter the amount you want to withdraw");
		         sc.nextInt();
		         q.dequeue();
		          System.out.println(" Your Available Balance is: "+q.peek()); 
			   	
			   		break;
				   
		   	case 3:
System.out.println("number of people in queue  "  +q.size());
			  
			  
		   	case 4:
		   		System.exit(0);
		   		
		   	default:
		   		System.out.println("wrong input");
			  
		   	}
		   	}
		while(ch<7);
		}	
}
