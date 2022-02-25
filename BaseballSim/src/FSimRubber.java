import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FSimRubber
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
		
		static int plusMoneyBB;
		static int plusMoneyHBP;
		static int plusMoneyH;
		static int plusMoneyHR;
		static int moneyT;
		
		static int minusMoneyBB;
		static int minusMoneyHBP;
		static int minusMoneyH;
		static int minusMoneyHR;
		static int moneyL;
		
		static int moneyFinal;
		static int moneyTracker;
		
		static int Pruns = 0;
		static int Oruns = 0;
		static int PrunZ1 = 0;
		static int OrunZ1 = 0;
		static boolean gameW = true;
		
		
		//change for variables when on defense
		
		static int BB1;
		static int HBP1;
		static int H1;
		static int HR1;
		
		static int BB2;
		static int HBP2;
		static int H2;
		static int HR2;
		
		static String nippy;
		static Scanner nippyNext = new Scanner(System.in);
		
		
		
		
		
		
		
		
		public static void regRubberGame()
			{
				
				do
					{
						regRubberInningT1();
						regRubberInningB1();
						
						if (inningN > 9)
							{
								gameW = false;
								
								if (PrunZ1 == OrunZ1)
									{
										gameW = true;
									}
								
							}
						
						
						plusMoneyBB = 0;
						plusMoneyHBP = 0;
						plusMoneyH = 0;
						plusMoneyHR = 0;
						
						minusMoneyBB = 0;
						minusMoneyHBP = 0;
						minusMoneyH = 0;
						minusMoneyHR = 0;
						
						moneyT = 0;
						moneyL = 0;
						moneyFinal = 0;
						
						Pruns = 0;
						Oruns = 0;
						
						
						nippy = nippyNext.nextLine();
						System.out.println();
						System.out.println();
						
						
					} while (gameW == true);
				
				
				System.out.println("Final Score: " +  PrunZ1 + " to " +  OrunZ1);
				
				
				int peperoniPipi = (int) (Math.random() * 335) + 265;
				int charlieBrown = (int) (Math.random() * 216) + 104;
				int finalSum = 0;
				
				if(PrunZ1 > OrunZ1)
					{
						BPlayerInfo.playerMoney += peperoniPipi;
						finalSum = (moneyTracker + peperoniPipi);
						System.out.println("YOU WIN " + BPlayerInfo.playerName +", BONUS PRIZE of $" + peperoniPipi);
					}
				else if(OrunZ1 > PrunZ1)
					{
						System.out.println("*&@^@#$(* " + "you lose " + BPlayerInfo.playerName + ", Rubberducks win");
						
						
						BPlayerInfo.playerMoney -= charlieBrown;
						finalSum = ((moneyTracker - charlieBrown)*-1);
						System.out.println("You have to pay $" + charlieBrown + " to the Rubberducks :(");
						finalSum *= -1;
					}
				
				
				if (finalSum >= 0)
					{
						
						System.out.println("Overall, you recieved a profit of $" + finalSum + " from this game");
						System.out.println(BPlayerInfo.playerName + "'s current balance: $" + BPlayerInfo.playerMoney);
					}
				else if (finalSum < 0)
					{
						
						System.out.println("Overall, you recieved a loss of $" + finalSum + " from this game");
						System.out.println(BPlayerInfo.playerName + "'s current balance: $" + BPlayerInfo.playerMoney);
					}
				
				finalSum = 0;
				moneyTracker = 0;
				PrunZ1 = 0;
				OrunZ1 = 0;
				inningN = 1;
				gameW = true;
				
			}
		
		
		public static void qRubberGame()
			{
				
				do
					{
						qRubberInningT1();
						qRubberInningB1();
						
						if (inningN > 9)
							{
								gameW = false;
								
								if (Pruns == Oruns)
									{
										gameW = true;
									}
							}
					} while (gameW == true);
				
				
		//money from hitting	
				
				System.out.println();
				System.out.println("In " + inningN + " innings, you made $" + moneyT + " offensively after you had "
						+ BB1 + " walks, " + HBP1 + " hit by pitches, " 
						+ H1 + " hits, " + HR1 + " home runs, and scored " + Pruns + " runs.");
				
				
				
				
		//money from pitching		
				System.out.println("\t       you also lost $" + moneyL + " defensively after you gave up "
						+ BB2 + " walks, " + HBP2 + " hit by pitches, " 
						+ H2 + " hits, " + HR2 + " home runs, and " + Oruns + " runs.");
				
				
				
				
				
				moneyFinal = (moneyT - moneyL);
				
					
				System.out.println();
				
				if(Pruns > Oruns)
					{
						System.out.println("YOU WIN " + BPlayerInfo.playerName);
						
						
						int peperoniPipi = (int) (Math.random() * 335) + 265;
						BPlayerInfo.playerMoney += peperoniPipi;
						moneyFinal += peperoniPipi;
						System.out.println("You also get a BONUS PRIZE of $" + peperoniPipi + " for winning");
					}
				else if(Oruns > Pruns)
					{
						System.out.println("You lose " + BPlayerInfo.playerName + ", Rubberducks win");
						
						
						int charlieBrown = (int) (Math.random() * 216) + 104;
						moneyFinal -= charlieBrown;
						BPlayerInfo.playerMoney -= charlieBrown;
						System.out.println("*&@^@#$(* " + "You have to pay $" + charlieBrown + " to the Rubberducks :(");
					}
				
				
				if (moneyFinal >= 0)
					{			
						System.out.println("Game summary: " 
								+ "\n\t\t\tprofit-->  +$" + moneyFinal 
								+ "\n\t\t\tscore-->  " + Pruns + " to " + Oruns);
					}
				else if (moneyFinal < 0)
					{
						moneyFinal *= -1;
						System.out.println("Game summary: " 
								+ "\n\t\t\tloss-->  -$" + moneyFinal 
								+ "\n\t\t\tscore-->  " + Pruns + " to " + Oruns);
					}
				
				
				BB1 = 0;
				HBP1 = 0;
				H1 = 0;
				HR1 = 0;
				
				BB2 = 0;
				HBP2 = 0;
				H2 = 0;
				HR2 = 0;
				
				moneyT = 0;
				moneyL = 0;
				moneyFinal = 0;
				
				inningN = 1;
				gameW = true;
				
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
									
									
									
										if (playerNum1 >= 8)
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
						else if (inningN > pInnings)
							{
								
								if(relieverO < 6)
									{
										
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
										if (playerNum1 >= 8)
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
						Pruns = 8;
					}
				else if(h >= 15 && h < 20)
					{
						Pruns = 6;
					}
				else if(h >= 10 && h < 15)
					{ 
						Pruns = 4;
					}
				else if(h >= 7 && h < 10)
					{
						Pruns = 3;
					}
				else if(h >= 5 && h < 7)
					{
						Pruns = 2;
					}
				else if(h >= 3 && h < 5)
					{
						Pruns = 1;
					}
				
				
				plusMoneyBB = bb * 12;
				plusMoneyHBP = hbp * 14;
				plusMoneyH = h * 37;
				plusMoneyHR = hr * 175;
				Pruns += hr;
				
				
				moneyT = (plusMoneyBB + plusMoneyHBP + plusMoneyH + plusMoneyHR);
				BPlayerInfo.playerMoney += moneyT;
				
				System.out.println();
				System.out.println("In the top of inning " + inningN + ", you made $" + moneyT + " this inning after you had "
						+ bb + " walks, " + hbp + " hit by pitches, " 
						+ h + " hits, " + hr + " home runs, and scored " + Pruns + " runs.");
				
				PrunZ1 += Pruns;
				
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
								
									if (playerNum2 >= 8)
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
					else if (inningN > pInnings)
						{
							
							if(relieverO < 6)
								{
									
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
									if (playerNum2 >= 8)
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
					Oruns = 8;
				}
			else if(h >= 15 && h < 20)
				{
					Oruns = 6;
				}
			else if(h >= 10 && h < 15)
				{ 
					Oruns = 4;
				}
			else if(h >= 7 && h < 10)
				{
					Oruns = 3;
				}
			else if(h >= 5 && h < 7)
				{
					Oruns = 2;
				}
			else if(h >= 3 && h < 5)
				{
					Oruns = 1;
				}
			
			
			minusMoneyBB = bb * 12;
			minusMoneyHBP = hbp * 14;
			minusMoneyH = h * 37;
			minusMoneyHR = hr * 175;
			Oruns += hr;
			
			OrunZ1 += Oruns;
			
			moneyL = (minusMoneyBB + minusMoneyHBP + minusMoneyH + minusMoneyHR);
			BPlayerInfo.playerMoney -= moneyL;
			
			
			
			System.out.println("In the bottom of inning " + inningN + ", you lost $" + moneyL + " this inning after you gave up "
					+ bb + " walks, " + hbp + " hit by pitches, " 
					+ h + " hits, " + hr + " home runs, and " + Oruns + " runs.");
			
			moneyFinal = (moneyT - moneyL);
			moneyTracker += moneyFinal;
			
			if (moneyFinal >= 0)
				{
					System.out.println("Inning " + inningN + " summary: "
										+ "\n\t\t\tprofit-->  +$" + moneyFinal 
										+ "\n\t\t\tscore-->  " + PrunZ1 + " to " + OrunZ1);
				}
			else if (moneyFinal < 0)
				{
					moneyFinal *= -1;
					System.out.println("Inning " + inningN + " summary: "
							+ "\n\t\t\tloss-->  -$" + moneyFinal 
							+ "\n\t\t\tscore-->  " + PrunZ1 + " to " + OrunZ1);
				}
			
			
			
			inningN++;
		}
		
		
		

		
		
		
		
		public static void qRubberInningT1()
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
											BB1++;
										}
									else if (r2 <= newHitByPitch)
										{
											hbp++;
											HBP1++;
										}
									else if (r3 <= newHits)
										{
											if(r3 <= newHR)
												{
													hr++;
													HR1++;
												}
											h++;
											H1++;
										}
									else
										{
											outs++;
										}
									
									
									
								//makes sure batters change down the lineup
									playerNum1++;
									
										if (playerNum1 >= 8)
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
						else if (inningN > pInnings)
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
												BB1++;
											}
										else if (r2 <= newHitByPitch)
											{
												hbp++;
												HBP1++;
											}
										else if (r3 <= newHits)
											{
												if(r3 <= newHR)
													{
														hr++;
														HR1++;
													}
												h++;
												H1++;
											}
										else
											{
												outs++;
												relieverO++;
											}
										
										
										
										
										playerNum1++;
										
								//lineup number
										if (playerNum1 >= 8)
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
				
				
				plusMoneyBB = BB1 * 12;
				plusMoneyHBP = HBP1 * 14;
				plusMoneyH = H1 * 37;
				plusMoneyHR = HR1 * 175;
				Pruns += HR1;
				
				
				moneyT = (plusMoneyBB + plusMoneyHBP + plusMoneyH + plusMoneyHR);
			}
		
		
		
		
		
		
		
		public static void qRubberInningB1()
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
											BB2++;
										}
									else if (r2 <= newHitByPitch)
										{
											hbp++;
											HBP2++;
										}
									else if (r3 <= newHits)
										{
											if(r3 <= newHR)
												{
													hr++;
													HR2++;
												}
											h++;
											H2++;
										}
									else
										{
											outs++;
										}
									
									
									
								//makes sure batters change down the lineup
									playerNum2++;
									
										if (playerNum2 >= 8)
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
						else if (inningN > pInnings)
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
												BB2++;
											}
										else if (r2 <= newHitByPitch)
											{
												hbp++;
												HBP2++;
											}
										else if (r3 <= newHits)
											{
												if(r3 <= newHR)
													{
														hr++;
														HR2++;
													}
												h++;
												H2++;
											}
										else
											{
												outs++;
												relieverO++;
											}
										
										
										
										
										playerNum2++;
										
								//lineup number
										if (playerNum2 >= 8)
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
				
				
				minusMoneyBB = BB2 * 12;
				minusMoneyHBP = HBP2 * 14;
				minusMoneyH = H2 * 37;
				minusMoneyHR = HR2 * 175;
				Oruns += HR2;
				
				
				moneyL = (minusMoneyBB + minusMoneyHBP + minusMoneyH + minusMoneyHR);
				BPlayerInfo.playerMoney -= moneyL;
				
		
				inningN++;
			}
		
		
		
	}
