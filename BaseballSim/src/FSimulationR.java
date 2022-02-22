import java.util.ArrayList;
import java.util.Random;

public class FSimulationR
	{
		static double battingAv;
		static double battingAvA;
		static double rando;
		static int inningN = 1;
		static int playerNum1 = 0;
		static int playerNum2 = 0;
		static int relieverNum1 = 0;
		static int relieverNum2 = 0;
		static int relieverO = 0;
		static int plusMoneyBB = 0;
		static int plusMoneyHBP = 0;
		static int plusMoneyH = 0;
		static int plusMoneyHR = 0;
		static int moneyT = 0;
		static int minusMoneyBB = 0;
		static int minusMoneyHBP = 0;
		static int minusMoneyH = 0;
		static int minusMoneyHR = 0;
		static int moneyL = 0;
		static int moneyFinal = 0 ;
		static int Pruns = 0;
		static int Oruns = 0;
		static boolean gameW = true;
		
		
		
		
		
		
		public static void regRubberGame()
			{
				
				//regRubberInningT1();
				//regRubberInningB1();
				
				
				do
					{
						regRubberInningT1();
						regRubberInningB1();
						
						if (inningN > 9)
							{
								gameW = false;
								
								if (Pruns == Oruns)
									{
										gameW = true;
									}
								
							}
					} while (gameW == true);
				
				
				
				
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
									battingAv = (double) ((BBSHitters) BTeams.playerLinup.get(playerNum1)).getHits() / ((BBSHitters) BTeams.playerLinup.get(playerNum1)).getAtBats(); 
									battingAvA = ((double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getHitsAllowed()) / ((double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getBattersFaced() 
												- (double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getWalks() - (double) ((BBSPitchers) BTeams.rubberStarter.get(0)).getHitByPitch());
						
									
						
									Random generator = new Random();
									rando = ((generator.nextDouble()* .010) + 0.015);
						
						
									double newHits = ((((battingAv + battingAvA)/2) - rando));
											newHits = newHits * 1000;
											
									double newHR = (double) (((BBSHitters) BTeams.playerLinup.get(playerNum1)).getHomeRuns() / ((BBSHitters) BTeams.playerLinup.get(playerNum1)).getAtBats() * 1000);
						
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
									playerNum1++;
									
										if (playerNum1 >= 7)
											{
												
												playerNum1 = 0;
												
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
										
										battingAv = (double) ((BBSHitters) BTeams.playerLinup.get(playerNum1)).getHits() / ((BBSHitters) BTeams.playerLinup.get(playerNum1)).getAtBats(); 
										
									
										battingAvA = ((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getHitsAllowed()) / ((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getBattersFaced() 
													- (double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getWalks() - (double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getHitByPitch());
										
										
										
										Random generator = new Random();
										rando = ((generator.nextDouble()* .010) + 0.015);
							
							
										double newHits = ((((battingAv + battingAvA)/2) - rando));
												newHits = newHits * 1000;
												
										double newHR = (double) (((BBSHitters) BTeams.playerLinup.get(playerNum1)).getHomeRuns() / ((BBSHitters) BTeams.playerLinup.get(playerNum1)).getAtBats() * 1000);
							
										double newWalks = (((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getWalks() / ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getBattersFaced()) * 1000);
							
										double newHitByPitch = (((double) ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getHitByPitch() / ((BBSPitchers) BTeams.rubberReliever.get(relieverNum1)).getBattersFaced()) * 1000);
							
										
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
										
										
										
										
										playerNum1++;
										
								//lineup number
										if (playerNum1 >= 7)
											{
												
												playerNum1 = 0;
												
											}
								//reliever number in array list
										if (relieverNum1 >= 6)
											{
												
												relieverNum1 = 0;
												
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
										relieverNum1++;
									}
							}
						else
							{
								stillPlaying = false;
							}
						
						
						
					} while (stillPlaying == true);
				
				stillPlaying = true;
				
				
				
				if(h >= 20)
					{
						Pruns += 8;
					}
				else if(h >= 15 && h < 20)
					{
						Pruns += 6;
					}
				else if(h >= 10 && h < 15)
					{ 
						Pruns += 4;
					}
				else if(h >= 7 && h < 10)
					{
						Pruns += 3;
					}
				else if(h >= 5 && h < 7)
					{
						Pruns += 2;
					}
				else if(h >= 3 && h < 5)
					{
						Pruns += 1;
					}
				
				
				plusMoneyBB += bb * 12;
				plusMoneyHBP += hbp * 14;
				plusMoneyH += h * 37;
				plusMoneyHR += hr * 175;
				Pruns += hr;
				
				
				moneyT += plusMoneyBB + plusMoneyHBP + plusMoneyH + plusMoneyHR;
				BPlayerInfo.playerMoney += moneyT;
				
				
				
				
				
				System.out.println("In the top of inning " + inningN + ", you made $" + moneyT + " this inning after you had "
						+ bb + " walks, " + hbp + " hit by pitches, " 
						+ h + " hits, " + hr + " home runs, and scored " + Pruns + " runs.");
				
				
				
			}
		
		
		
		
		
		
		
		
		public static void regRubberInningB1()
		{
			
			//default pitching length
			int pInnings = (int) (Math.random() * 4) + 1;
			
			
		//Starting Pitching length
			if(BTeams.playerStarter.get(0).getRarity().equals("Bronze"))
				{
					int Pinnings = (int) (Math.random() * 5) + 3;
				}
			else if(BTeams.playerStarter.get(0).getRarity().equals("Silver"))
				{
					int Pinnings = (int) (Math.random() * 7) + 4;
				}
			else if(BTeams.playerStarter.get(0).getRarity().equals("Gold"))
				{
					int Pinnings = (int) (Math.random() * 8) + 6;
				}
			else if(BTeams.playerStarter.get(0).getRarity().equals("Platinum"))
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
								battingAv = (double) ((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getHits() / ((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getAtBats(); 
								battingAvA = ((double) ((BBSPitchers) BTeams.playerStarter.get(0)).getHitsAllowed()) / ((double) ((BBSPitchers) BTeams.playerStarter.get(0)).getBattersFaced() 
											- (double) ((BBSPitchers) BTeams.playerStarter.get(0)).getWalks() - (double) ((BBSPitchers) BTeams.playerStarter.get(0)).getHitByPitch());
					
								
					
								Random generator = new Random();
								rando = ((generator.nextDouble()* .010) + 0.015);
					
					
								double newHits = ((((battingAv + battingAvA)/2) - rando));
										newHits = newHits * 1000;
										
								double newHR = (double) (((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getHomeRuns() / ((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getAtBats() * 1000);
					
								double newWalks = (((double) ((BBSPitchers) BTeams.playerStarter.get(0)).getWalks() / ((BBSPitchers) BTeams.playerStarter.get(0)).getBattersFaced()) * 1000);
					
								double newHitByPitch = (((double) ((BBSPitchers) BTeams.playerStarter.get(0)).getHitByPitch() / ((BBSPitchers) BTeams.playerStarter.get(0)).getBattersFaced()) * 1000);
					
								
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
								playerNum2++;
								
									if (playerNum2 >= 7)
										{
											
											playerNum2 = 0;
											
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
									
									battingAv = (double) ((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getHits() / ((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getAtBats(); 
									
								
									battingAvA = ((double) ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getHitsAllowed()) / ((double) ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getBattersFaced() 
												- (double) ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getWalks() - (double) ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getHitByPitch());
									
									
									
									Random generator = new Random();
									rando = ((generator.nextDouble()* .010) + 0.015);
						
						
									double newHits = ((((battingAv + battingAvA)/2) - rando));
											newHits = newHits * 1000;
											
									double newHR = (double) (((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getHomeRuns() / ((BBSHitters) BTeams.rubberLinup.get(playerNum2)).getAtBats() * 1000);
						
									double newWalks = (((double) ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getWalks() / ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getBattersFaced()) * 1000);
						
									double newHitByPitch = (((double) ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getHitByPitch() / ((BBSPitchers) BTeams.playerReliever.get(relieverNum2)).getBattersFaced()) * 1000);
						
									
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
									
									
									
									
									playerNum2++;
									
							//lineup number
									if (playerNum2 >= 7)
										{
											
											playerNum2 = 0;
											
										}
							//reliever number in array list
									if (relieverNum2 >= 6)
										{
											
											relieverNum2 = 0;
											
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
									relieverNum2++;
								}
						}
					else
						{
							stillPlaying = false;
						}
					
					
					
				} while (stillPlaying == true);
			
			stillPlaying = true;
			
			
			
			if(h >= 20)
				{
					Oruns += 8;
				}
			else if(h >= 15 && h < 20)
				{
					Oruns += 6;
				}
			else if(h >= 10 && h < 15)
				{ 
					Oruns += 4;
				}
			else if(h >= 7 && h < 10)
				{
					Oruns += 3;
				}
			else if(h >= 5 && h < 7)
				{
					Oruns += 2;
				}
			else if(h >= 3 && h < 5)
				{
					Oruns += 1;
				}
			
			
			minusMoneyBB += bb * 12;
			minusMoneyHBP += hbp * 14;
			minusMoneyH += h * 37;
			minusMoneyHR += hr * 175;
			Oruns += hr;
			
			
			moneyL += minusMoneyBB + minusMoneyHBP + minusMoneyH + minusMoneyHR;
			BPlayerInfo.playerMoney -= moneyL;
			
			
			
			
			
			System.out.println("In the bottom of inning " + inningN + ", you lost $" + moneyL + " this inning after you gave up "
					+ bb + " walks, " + hbp + " hit by pitches, " 
					+ h + " hits, " + hr + " home runs, and " + Oruns + " runs.");
			
			moneyFinal += moneyT - moneyL;
			
			if (moneyFinal >= 0)
				{
					System.out.println("Overall in inning " + inningN + ", you made $" + moneyFinal);
				}
			else if (moneyFinal < 0)
				{
					System.out.println("Overall in inning " + inningN + ", you lost $" + moneyFinal);
				}
			
			inningN++;
			moneyT = 0;
			moneyL = 0;
			moneyFinal = 0;
				
			
		}
		
		
		
	}
