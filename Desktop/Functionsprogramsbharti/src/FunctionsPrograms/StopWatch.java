package FunctionsPrograms;

import java.util.Scanner;

public class StopWatch {
	private long starttime=0;
	private long stoptime=0;
	boolean running =false;
	void start() {
		
		this.starttime=System.currentTimeMillis();
		this.running=true;
	}
	void stop() {

		this.stoptime=System.currentTimeMillis();
		this.running=false;
		}
	public long elapsed() {
		long elapsed;
		if(running) {
	     
			elapsed=(System.currentTimeMillis()-starttime)/1000;
		}
	     else
	     {
	    	 elapsed=(stoptime-starttime)/1000; 
	     }
		return elapsed; 
	}
public static void main(String[]args) {
	StopWatch st=new StopWatch();
	st.start();
	System.out.println("do you want stop");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	if(s.contentEquals("y")) {
		
	
	st.stop();
	}
	System.out.println("elapsed time is " +st.elapsed());
	
}
}
