package firest;

import java.net.UnknownHostException;
import java.util.Random;

public class first {

	
	public static void main (String args []) throws UnknownHostException{
		int max=20;
		int min=15;
			Random t = new Random();
			int s=(max-min);
			System.out.println(t.nextInt(s)+15);
			int d= min+(int)(Math.random()*((max-min)+1));
			
			System.out.println(d);
		}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	

