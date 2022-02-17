import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtReader
	{

		static AllStarPlayer[] player = new AllStarPlayer[100];
		
		public static void readSimTxt() throws FileNotFoundException
		{
		Scanner file = new Scanner(new File("BaseballSim.txt" ));
		int numberOfLines = file.nextInt();
	     
	      for( int i = 0; i < numberOfLines; i++ )
	          {
	        	  
	        	  String type = file.next(); 
	        	  
//reads Pitchers and puts them into an array 			        	  
	        	  if(type.equals("Pitcher"))
	        		  {
	        			 

	        					 String t2 = file.next();
	        					 String fn = file.next();
	        					 String ln = file.next();
	        					 String rare = file.next();
	        					 String o = file.next();
	        					 int yp = file.nextInt();
	        					 int c = file.nextInt();
	        					 int g = file.nextInt();
	        					 int bf = file.nextInt();
	        					 int h = file.nextInt();
	        					 int w = file.nextInt();
	        					 int s = file.nextInt();
	        					 int hbp = file.nextInt();
	        					 double ip = file.nextDouble();
	        			  		 int pn = file.nextInt();
	        					
	        					  
	        					 player[i] = new BSPitchers("Pitcher", t2, fn, ln, rare, o, yp, c, g, bf, h, w, s, hbp, ip, pn);
	        		  }		
	        	  
//reads Hitters and puts them into an array
	        	  if(type.equals("Hitter"))
	        		  {
	        			 
	        			  		 
	        					 String t2 = file.next();
	        					 String fn = file.next();
	        					 String ln = file.next();
	        					 String rare = file.next();
	        					 String o = file.next();
	        					 int yp = file.nextInt();
	        					 int c = file.nextInt();
	        					 int p = file.nextInt();
	        					 int a = file.nextInt();
	        					 int r = file.nextInt();
	        					 int h = file.nextInt();
	        					 int bb = file.nextInt();
	        					 int hr = file.nextInt();
	        			  		 int pn = file.nextInt();
	        					
	        					  
	        					 player[i] = new BSHitters("Hitter", t2, fn, ln, rare, o, yp, c, p, a, r, h, bb, hr, pn);
	        		  }
	          }
		
	}
}