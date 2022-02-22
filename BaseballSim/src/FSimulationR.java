import java.util.ArrayList;
import java.util.Random;

public class FSimulationR
	{
		static double battingAv;
		static double battingAvA;
		static double rando;
		static int inningN = 1;
		static int playerNum = 0;
		
		
		
		
		public static void regRubberGame()
			{
			
			}
		
		
		
		
		
		
		
		
		public static void regRubberHInning1()
			{
			//default pitching length
				int pInnings = (int) (Math.random() * 4) + 1;
				
				
			//Starting Pitching length
				if(BTeams.rubberStarter.get(0).getRarity().equals("Bronze"))
					{
						int Pinnings = (int) (Math.random() * 5) + 3;
					}
				else if(BTeams.rubberStarter.get(0).getRarity().equals("Silver"))
					{
						int Pinnings = (int) (Math.random() * 7) + 4;
					}
				else if(BTeams.rubberStarter.get(0).getRarity().equals("Gold"))
					{
						int Pinnings = (int) (Math.random() * 8) + 6;
					}
				else if(BTeams.rubberStarter.get(0).getRarity().equals("Platinum"))
					{
						int Pinnings = (int) (Math.random() * 9) + 8;
					}
				
				
				
				int outs = 0;
				boolean stillPlaying = true;
				
				int bb = 0;
				int hbp = 0;
				int h = 0;
				int hr = 0;
				
				do 
					{
						
						int r1 = (int) (Math.random() * 1000) + 1;
						int r2 = (int) (Math.random() * 1000) + 1;
						int r3 = (int) (Math.random() * 1000) + 1;
						
						if (inningN <= pInnings)
							{
									battingAv = (double) ((BBSHitters) BTeams.playerLinup.get(playerNum)).getHits() / ((BBSHitters) BTeams.playerLinup.get(playerNum)).getAtBats(); 
									battingAvA = ((double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getHitsAllowed()) / ((double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getBattersFaced() 
												- (double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getWalks() - (double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getHitByPitch());
						
									
						
									Random generator = new Random();
									rando = ((generator.nextDouble()* .010) + 0.015);
						
						
									double newHits = ((((battingAv + battingAvA)/2) - rando));
											newHits = newHits * 1000;
											
									double newHR = (double) (((BBSHitters) BTeams.playerLinup.get(playerNum)).getHomeRuns() / ((BBSHitters) BTeams.playerLinup.get(playerNum)).getAtBats() * 1000);
						
									double newWalks = (((double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getWalks() / ((BBSPitchers) BTeams.rubberStarter.get(0)).getBattersFaced()) * 1000);
						
									double newHitByPitch = (((double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getHitByPitch() / ((BBSPitchers) BTeams.rubberStarter.get(0)).getBattersFaced()) * 1000);
						
									
								//check for walks, hbp, hits and home runs	
									if (r1 <= newWalks)
										{
											bb++;
										}
									else if (r2 <= newHitByPitch)
										{
											hbp++;
										}
									else if (r3 <= newHits)
										{
											if(r3 <= newHR)
												{
													hr++;
												}
											
											h++;
										}
									else
										{
											outs++;
										}
									
									
									
								//makes sure batters change down the lineup
									playerNum++;
									
										if (playerNum >= 7)
											{
												
												playerNum = 0;
												
											}
										
										
								//stop inning if 3 outs
										if(outs >= 3)
											{
												stillPlaying = false;
											}
							}
						else if (inningN > pInnings && inningN <= 9)
							{
								
								figure out how to do relievers...max 2 innings or so
								
							}
						else
							{
								stillPlaying = false;
							}
						
						
						
					} while (stillPlaying == true);
				
				stillPlaying = true;
				inning++;
				
				
			}
		
		
		
	}
