import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ABaseballDriver
	{
		
		public static void main(String[] args) throws FileNotFoundException
			{
			
				ATxtReader.readSimTxt();
				BPlayerInfo.introFillTeam();
				BTeams.fillAllTeams();

				
				
				
				CGreetSimPlayer.simIntro();
				
				FSimulationR.pickPlayerRandoStarter();
				
				//BPlayerInfo.displayPlayerStats();
				
				CGreetSimPlayer.displayRule();
				CGreetSimPlayer.playOrNaw();
				
				
				
			}
		
	}
