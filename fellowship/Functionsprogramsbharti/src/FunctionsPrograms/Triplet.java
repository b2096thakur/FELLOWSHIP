package FunctionsPrograms;
import java.util.*;
public class Triplet {
	public static void main(String[]args)
	{ Scanner sc= new Scanner(System.in);
	int count=0;
	
		System.out.println("enter the no of array elements");
		int n=sc.nextInt();
		int arr[]=new int[14];
		System .out.println("enter elements");
		for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
            for(int a = 0; a < n; a++) {
            int first=arr[a];
            for(int b = a+1; b< n; b++) {
                int second=arr[b];
                for(int c = b+1; c< n; c++) {
                    int third=arr[c];
                    	
            
            int sum=first+second+third;
           
    
            
            if(sum==0) {
       	
            	
            	System.out.println("triplets is"+" "+first +" "+second + " "+third);
              count++;
            }
                }
            }
            }
            	System.out.println("no of triplet is"  + count++);
            	
            
              }
}