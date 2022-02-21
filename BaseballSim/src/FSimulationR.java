import java.util.ArrayList;
import java.util.Random;

public class FSimulationR
	{
		static double battingAv;
		static double battingAvA;
		static double rando;
		
		static ArrayList<BAllStarPlayer> playerStarterZ = new ArrayList<BAllStarPlayer>();
		static ArrayList<BAllStarPlayer> playerStarter = new ArrayList<BAllStarPlayer>();
		
		
		
		
		
		

		
		public static void pickPlayerRandoStarter()
			{
				
				for (BAllStarPlayer s: BPlayerInfo.team)
					{
						if( s.getType2().equals("Starter"))
							{
								playerStarterZ.add(s);
							}
					}
				
				
				int startRandoN = (int) (Math.random() * 5);
				boolean gas = false;
				int xxx = 0;
				
				do
					{
						if (xxx == startRandoN && gas == false)
							{
								
								playerStarter.add(playerStarterZ.get(startRandoN));
								
								gas = true;
							}
						if (xxx >= 5)
							{
								xxx = -1;
							}
						
						xxx++;
						
					} while (gas == false);
				
				xxx = 0;
				gas = false;
				
				
				System.out.println(playerStarter.get(0).getFirstName() + " " + playerStarter.get(0).getLastName());
				
			}
		
		
		
		
		
		
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
