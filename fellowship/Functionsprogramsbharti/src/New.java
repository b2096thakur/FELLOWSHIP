
public class New {

	public static void main(String[] args) {
		
		      String org= "hello username how are you";
		      String [] temp=org.split(" ");
		      int len=temp.length;
		      String ne = "";
		      for(int i=0;i<len;i++)
		      {
		          if(temp[i].matches("username"))
		              temp[i]="bharti ";
		          ne=ne+temp[i]+ " ";

		      }
		        System.out.println(ne);
		    }


	}


