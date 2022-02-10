import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class BaseballDriver
	{

		 //static AllStarPlayer[] player = new AllStarPlayer[100];
		
		public static void main(String[] args) throws FileNotFoundException
			{
			
				TxtReader.readSimTxt();
				
//			      for (int i = 0; i < 100; i ++)
//			    	  {
//			    		  System.out.println(TxtReader.player[i].getFirstName());
//			    	  }
			      
			
				
				GreetSimPlayer.simIntro();
				GreetSimPlayer.displayRule();
				GreetSimPlayer.playOrNaw();
				
				
				
			}
		
	}
