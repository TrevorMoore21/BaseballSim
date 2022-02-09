import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class BaseballDriver
	{

		 static AllStarPlayer[] player = new AllStarPlayer[100];
		
		public static void main(String[] args) throws FileNotFoundException
			{
				
//read Txt file
				Scanner file = new Scanner(new File("BaseballSimPractice.txt" ));
				int numberOfLines = file.nextInt();
			     
			      for( int i = 0; i < numberOfLines; i++ )
			          {
			        	  
			        	  String type = file.next();  
//reads Pitchers			        	  
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
			        					 
			        					
			        					  
			        					 player[i] = new BSPitchers("Pitcher", t2, fn, ln, rare, o, yp, c, g, bf, h, w, s, hbp, ip);
			        		  }		
			          }
			      
			      System.out.println(player[0].getFirstName());
			      
				GreetSimPlayer.simIntro();
				GreetSimPlayer.displayRule();
				GreetSimPlayer.playOrNaw();
				
				
				
			}
		
	}
