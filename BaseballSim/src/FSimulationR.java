import java.util.ArrayList;
import java.util.Random;

public class FSimulationR
	{
		static double battingAv;
		static double battingAvA;
		static double rando;
		static int inningN = 1;
		static int playerNum = 0;
		static int relieverNum = 0;
		static int relieverO = 0;
		static int moneyBB = 0;
		static int moneyHBP = 0;
		static int moneyH = 0;
		static int moneyHR = 0;
		static int moneyT = 0;
		
		
		
		
		
		
		
		public static void regRubberGame()
			{
			
			}
		
	
		
		
		
		
		public static void regRubberInningT1()
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
				//else
				//	{
				//		int Pinnings = (int) (Math.random() * 9) + 8;
				//	}
				
				
				
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
						
						
					//enter starters	
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
				//enter relievers		
						else if (inningN > pInnings && inningN <= 9)
							{
								
								if(relieverO < 6)
									{
										
										//here
										
										battingAv = (double) ((BBSHitters) BTeams.playerLinup.get(playerNum)).getHits() / ((BBSHitters) BTeams.playerLinup.get(playerNum)).getAtBats(); 
										
									
										battingAvA = ((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getHitsAllowed()) / ((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getBattersFaced() 
													- (double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getWalks() - (double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getHitByPitch());
										
										
										
										Random generator = new Random();
										rando = ((generator.nextDouble()* .010) + 0.015);
							
							
										double newHits = ((((battingAv + battingAvA)/2) - rando));
												newHits = newHits * 1000;
												
										double newHR = (double) (((BBSHitters) BTeams.playerLinup.get(playerNum)).getHomeRuns() / ((BBSHitters) BTeams.playerLinup.get(playerNum)).getAtBats() * 1000);
							
										double newWalks = (((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getWalks() / ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getBattersFaced()) * 1000);
							
										double newHitByPitch = (((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getHitByPitch() / ((BBSPitchers) BTeams.rubberReliever.get(relieverNum)).getBattersFaced()) * 1000);
							
										
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
												relieverO++;
											}
										
										
										
										
										playerNum++;
										
								//lineup number
										if (playerNum >= 7)
											{
												
												playerNum = 0;
												
											}
								//reliever number in array list
										if (relieverNum >= 6)
											{
												
												relieverNum = 0;
												
											}
										
										
								//stop inning if 3 outs
										if(outs >= 3)
											{
												stillPlaying = false;
											}
										
									}
								else
									{
										relieverO = 0;
										relieverNum++;
									}
							}
						else
							{
								stillPlaying = false;
							}
						
						
						
					} while (stillPlaying == true);
				
				stillPlaying = true;
				inningN++;
				
				
				
				moneyBB += bb * 45;
				moneyHBP += hbp * 55;
				moneyH += h * 85;
				moneyHR += hr * 175;
				moneyT += moneyBB + moneyHBP + moneyH + moneyHR;
				BPlayerInfo.playerMoney += moneyT;
				
				
				System.out.println("You made $" + moneyT + " this inning after you had "
						+ bb + " walks, " + hbp + " hit by pitches, " 
						+ h + " hits, and " + hr + " home runs.");
				
			}
		
		
		
		
		public static void regRubberInningB1()
		{
			
			;oaishdf;lkashjdflaksjdhf;alsdkfj
			
		}
		
		
		
	}
