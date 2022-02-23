import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ABaseballDriver
	{
		
		public static void main(String[] args) throws FileNotFoundException
			{
			
				ATxtReader.readSimTxt();
				BPlayerInfo.introFillPlayerTeam();
				BTeams.fillAllTeams();
				BTeams.randomizeAllSRL();


				CGreetSimPlayer.simIntro();
				
				
				FRSimRubber.regRubberGame();
				FRSimRubber.qRubberGame();
				
				
				
				
				CGreetSimPlayer.displayRule();
				CGreetSimPlayer.playOrNaw();
			}
		
	}
