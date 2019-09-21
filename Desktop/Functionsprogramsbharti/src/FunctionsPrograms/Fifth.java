package FunctionsPrograms;
import java .util.*;
public class Fifth {
	public static void main(String[]args) {
int row, col, i, j;
int arr[][] = new int[10][10];
Scanner scan = new Scanner(System.in);
  System.out.println("enter row");
row = scan.nextInt();
System.out.print("Enter column for the array : ");
col = scan.nextInt();
System.out.println("Enter " +(row*col)+ " Array Elements : ");
 for(i=0; i<row; i++)
 {
 for(j=0; j<col; j++)
 {
 arr[i][j] = scan.nextInt();
			           }
			       }
 System.out.print("The Array is :\n");
 for(i=0; i<row; i++)
 {  for(j=0; j<col; j++)
	 {
 System.out.print(arr[i][j]+ "  ");
			    }
	 System.out.println();
			       }
			   }
				

			


	}


