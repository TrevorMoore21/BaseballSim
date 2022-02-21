import java.util.ArrayList;
import java.util.Random;

public class FSimulationR
	{
		static double battingAv;
		static double battingAvA;
		static double rando;
		
		
		
		
		
		public static void regRubberGame()
			{
			
				
				
				
				
				battingAv = (double) mlb.get(hitterIndex).getHits() / (double) mlb.get(hitterIndex).getAtBats(); 
				battingAvA = ((double) cheese.get(pitcherIndex).getHitsAllowed()) / ((double) cheese.get(pitcherIndex).getBattersFaced() - (double) cheese.get(pitcherIndex).getWalks() - (double) cheese.get(pitcherIndex).getHitByPitch());
			
				Random generator = new Random();
				rando = ((generator.nextDouble()* .010)+0.015);
			
			
				
				double newHits = ((((battingAv + battingAvA)/2) - rando));
				newHits = newHits * 1000;
		
				double newWalks = (((double) cheese.get(pitcherIndex).getWalks() / (double) cheese.get(pitcherIndex).getBattersFaced()) * 1000);
				
				double newHitByPitch = (((double) cheese.get(pitcherIndex).getHitByPitch() / (double) cheese.get(pitcherIndex).getBattersFaced()) * 1000);
				

				
				
				double newBattingAv = ((double) mlb.get(hitterIndex).getHits() + newHits) / ((double) mlb.get(hitterIndex).getAtBats() + 1000);
				
				double newBattingAvA = ((double) cheese.get(pitcherIndex).getHitsAllowed() + newHits) / ((double) (cheese.get(pitcherIndex).getBattersFaced() + 1000) - (double) (cheese.get(pitcherIndex).getWalks() + newWalks) - (double) (cheese.get(pitcherIndex).getHitByPitch() + newHitByPitch));
				
				
				
			
			}
		
		
		
	}
