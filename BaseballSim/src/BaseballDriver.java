import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class BaseballDriver
	{

		static AllStarPlayer[] player = new AllStarPlayer[100];
		
		public static void main(String[] args) throws FileNotFoundException
			{
				
				GreetSimPlayer.simIntro();
				GreetSimPlayer.displayRule();
				GreetSimPlayer.playOrNaw();
				
				
				
			}
		
	}
