import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class BaseballDriver
	{
		
		public static void main(String[] args) throws FileNotFoundException
			{
			
				TxtReader.readSimTxt();

				
				
				
				GreetSimPlayer.simIntro();
				PlayerInfo.setCoalOwner();
				GreetSimPlayer.displayRule();
				GreetSimPlayer.playOrNaw();
				
				
				
			}
		
	}
