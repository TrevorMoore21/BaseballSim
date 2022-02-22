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
				
				
				FSimulationR.regRubberInningT1();
				
				
				
				
				
				CGreetSimPlayer.displayRule();
				CGreetSimPlayer.playOrNaw();
			}
		
	}
