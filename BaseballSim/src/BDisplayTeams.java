
public class BDisplayTeams
	{

		
		
		
		
		
				
									//PLAYER TEAM
									//PLAYER TEAM
									//PLAYER TEAM
							

//Display FULL Player Team
				public static void displayPlayerTeam()
					{
						displayPlayerPitchers();
						displayPlayerHitters();
				
					}
				
//Print Player Pitchers	
				public static void displayPlayerPitchers()
				{
					
					System.out.println();
					System.out.println();
					System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
							"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
							 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
							  "HitByPitch" , "InningsPitched");
					System.out.println();
					
					
					for (int i = 0; i <= 19; i++) 
						{
							if (BPlayerInfo.team.get(i).getType().equals("Pitcher"))
								{

									String t2 = BPlayerInfo.team.get(i).getType2();
									String fn = BPlayerInfo.team.get(i).getFirstName();
									String ln = BPlayerInfo.team.get(i).getLastName();
									String rare = BPlayerInfo.team.get(i).getRarity();
									int yp = BPlayerInfo.team.get(i).getYearsPlayed();
									int g = ((BBSPitchers) BPlayerInfo.team.get(i)).getGamesPlayed();
									int bf = ((BBSPitchers) BPlayerInfo.team.get(i)).getBattersFaced();
									int h = ((BBSPitchers) BPlayerInfo.team.get(i)).getHitsAllowed();
									int w = ((BBSPitchers) BPlayerInfo.team.get(i)).getWalks();
									int s = ((BBSPitchers) BPlayerInfo.team.get(i)).getStrikeOut();
									int hbp = ((BBSPitchers) BPlayerInfo.team.get(i)).getHitByPitch();
									double ip =  ((BBSPitchers) BPlayerInfo.team.get(i)).getInningsPitched();
									
									System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
											 t2, fn + " " + ln, rare, 
											 yp, g, bf, h, 
											 w, s, hbp, ip);
								}
						}
				}
				
				
//Print Player Hitters		
				public static void displayPlayerHitters()
					{
						
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();
						
						
						for (int i = 0; i <= 19; i++) 
							{
							
								if (BPlayerInfo.team.get(i).getType().equals("Hitter"))
									{

										String t2 = BPlayerInfo.team.get(i).getType2();
										String fn = BPlayerInfo.team.get(i).getFirstName();
										String ln = BPlayerInfo.team.get(i).getLastName();
										String rare = BPlayerInfo.team.get(i).getRarity();
										int yp = BPlayerInfo.team.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BPlayerInfo.team.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BPlayerInfo.team.get(i)).getAtBats();
										int rbi = ((BBSHitters) BPlayerInfo.team.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BPlayerInfo.team.get(i)).getHits();
										int bb = ((BBSHitters) BPlayerInfo.team.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BPlayerInfo.team.get(i)).getHomeRuns();
										
										
										
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}
					}
		
				
				
				
				
				
					
									//RUBBERDUCKS
									//RUBBERDUCKS
									//RUBBERDUCKS
				
				
//Display FULL Rubber Team
				public static void displayRubberTeam()
					{
						displayRubberPitchers();
						displayRubberHitters();
				
					}				
				
				
//Print Rubber Pitchers	
				public static void displayRubberPitchers()
						{
							System.out.println();
							System.out.println();
							System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
									"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
									 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
									  "HitByPitch" , "InningsPitched");
							System.out.println();
							
							
							for (int i = 0; i <= 19; i++) 
								{
									if (BTeams.RubberDucks.get(i).getType().equals("Pitcher"))
										{

											String t2 = BTeams.RubberDucks.get(i).getType2();
											String fn = BTeams.RubberDucks.get(i).getFirstName();
											String ln = BTeams.RubberDucks.get(i).getLastName();
											String rare = BTeams.RubberDucks.get(i).getRarity();
											int yp = BTeams.RubberDucks.get(i).getYearsPlayed();
											int g = ((BBSPitchers) BTeams.RubberDucks.get(i)).getGamesPlayed();
											int bf = ((BBSPitchers) BTeams.RubberDucks.get(i)).getBattersFaced();
											int h = ((BBSPitchers) BTeams.RubberDucks.get(i)).getHitsAllowed();
											int w = ((BBSPitchers) BTeams.RubberDucks.get(i)).getWalks();
											int s = ((BBSPitchers) BTeams.RubberDucks.get(i)).getStrikeOut();
											int hbp = ((BBSPitchers) BTeams.RubberDucks.get(i)).getHitByPitch();
											double ip =  ((BBSPitchers) BTeams.RubberDucks.get(i)).getInningsPitched();
											
											
											System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
													 t2, fn + " " + ln, rare, 
													 yp, g, bf, h, 
													 w, s, hbp, ip);
										}
								}
						}
							
//Print Rubber Hitters		
				public static void displayRubberHitters()
							{
								
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
										"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
										 "AtBats", "Hits", "Walks", "HomeRuns",
										  "RBIs");
								System.out.println();
								
								
								for (int i = 0; i <= 19; i++) 
									{
									
										if (BTeams.RubberDucks.get(i).getType().equals("Hitter"))
											{

												String t2 = BTeams.RubberDucks.get(i).getType2();
												String fn = BTeams.RubberDucks.get(i).getFirstName();
												String ln = BTeams.RubberDucks.get(i).getLastName();
												String rare = BTeams.RubberDucks.get(i).getRarity();
												int yp = BTeams.RubberDucks.get(i).getYearsPlayed();
												int pa = ((BBSHitters) BTeams.RubberDucks.get(i)).getPlateAppearances();
												int ab = ((BBSHitters) BTeams.RubberDucks.get(i)).getAtBats();
												int rbi = ((BBSHitters) BTeams.RubberDucks.get(i)).getRunsBattedIn();
												int h = ((BBSHitters) BTeams.RubberDucks.get(i)).getHits();
												int bb = ((BBSHitters) BTeams.RubberDucks.get(i)).getBaseOnBalls();
												int hr = ((BBSHitters) BTeams.RubberDucks.get(i)).getHomeRuns();
												
												
												
												System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
														 "   " + t2, fn + " " + ln, rare, 
														 yp, pa, ab, h, 
														 bb, hr, rbi);
											}
									}
							}	

				
				
				
				
				
				
									//YARDGOATS
									//YARDGOATS
									//YARDGOATS


//Display FULL Yard Team
				public static void displayYardTeam()
					{
						displayYardPitchers();
						displayYardHitters();

					}				


//Print Yard Pitchers	
				public static void displayYardPitchers()
					{
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
								 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
								  "HitByPitch" , "InningsPitched");
						System.out.println();
		
		
						for (int i = 0; i <= 19; i++) 
							{
								if (BTeams.YardGoats.get(i).getType().equals("Pitcher"))
									{

										String t2 = BTeams.YardGoats.get(i).getType2();
										String fn = BTeams.YardGoats.get(i).getFirstName();
										String ln = BTeams.YardGoats.get(i).getLastName();
										String rare = BTeams.YardGoats.get(i).getRarity();
										int yp = BTeams.YardGoats.get(i).getYearsPlayed();
										int g = ((BBSPitchers) BTeams.YardGoats.get(i)).getGamesPlayed();
										int bf = ((BBSPitchers) BTeams.YardGoats.get(i)).getBattersFaced();
										int h = ((BBSPitchers) BTeams.YardGoats.get(i)).getHitsAllowed();
										int w = ((BBSPitchers) BTeams.YardGoats.get(i)).getWalks();
										int s = ((BBSPitchers) BTeams.YardGoats.get(i)).getStrikeOut();
										int hbp = ((BBSPitchers) BTeams.YardGoats.get(i)).getHitByPitch();
										double ip =  ((BBSPitchers) BTeams.YardGoats.get(i)).getInningsPitched();
						
						
										System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
												 t2, fn + " " + ln, rare, 
												 yp, g, bf, h, 
												 w, s, hbp, ip);
									}
							}
					}
		
//Print Yard Hitters		
				public static void displayYardHitters()
					{	
			
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();
			
			
						for (int i = 0; i <= 19; i++) 
							{
				
								if (BTeams.YardGoats.get(i).getType().equals("Hitter"))
									{

										String t2 = BTeams.YardGoats.get(i).getType2();
										String fn = BTeams.YardGoats.get(i).getFirstName();
										String ln = BTeams.YardGoats.get(i).getLastName();
										String rare = BTeams.YardGoats.get(i).getRarity();
										int yp = BTeams.YardGoats.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BTeams.YardGoats.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BTeams.YardGoats.get(i)).getAtBats();
										int rbi = ((BBSHitters) BTeams.YardGoats.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BTeams.YardGoats.get(i)).getHits();
										int bb = ((BBSHitters) BTeams.YardGoats.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BTeams.YardGoats.get(i)).getHomeRuns();
							
							
							
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}
		}

				
				
				
				
				
				
				//BISCUITS
				//BISCUITS
				//BISCUITS


//Display FULL Biscuit Team
				public static void displayBiscuitsTeam()
					{
						displayBiscuitsPitchers();
						displayBiscuitsHitters();

					}				


//Print Biscuit Pitchers	
				public static void displayBiscuitsPitchers()
					{
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
								 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
								  "HitByPitch" , "InningsPitched");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								if (BTeams.Biscuits.get(i).getType().equals("Pitcher"))
									{

										String t2 = BTeams.Biscuits.get(i).getType2();
										String fn = BTeams.Biscuits.get(i).getFirstName();
										String ln = BTeams.Biscuits.get(i).getLastName();
										String rare = BTeams.Biscuits.get(i).getRarity();
										int yp = BTeams.Biscuits.get(i).getYearsPlayed();
										int g = ((BBSPitchers) BTeams.Biscuits.get(i)).getGamesPlayed();
										int bf = ((BBSPitchers) BTeams.Biscuits.get(i)).getBattersFaced();
										int h = ((BBSPitchers) BTeams.Biscuits.get(i)).getHitsAllowed();
										int w = ((BBSPitchers) BTeams.Biscuits.get(i)).getWalks();
										int s = ((BBSPitchers) BTeams.Biscuits.get(i)).getStrikeOut();
										int hbp = ((BBSPitchers) BTeams.Biscuits.get(i)).getHitByPitch();
										double ip =  ((BBSPitchers) BTeams.Biscuits.get(i)).getInningsPitched();
	
										
										System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
												 t2, fn + " " + ln, rare, 
												 yp, g, bf, h, 
												 w, s, hbp, ip);
									}
							}
					}

//Print Biscuit Hitters		
				public static void displayBiscuitsHitters()
					{	

						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								
								if (BTeams.Biscuits.get(i).getType().equals("Hitter"))
									{

										String t2 = BTeams.Biscuits.get(i).getType2();
										String fn = BTeams.Biscuits.get(i).getFirstName();
										String ln = BTeams.Biscuits.get(i).getLastName();
										String rare = BTeams.Biscuits.get(i).getRarity();
										int yp = BTeams.Biscuits.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BTeams.Biscuits.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BTeams.Biscuits.get(i)).getAtBats();
										int rbi = ((BBSHitters) BTeams.Biscuits.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BTeams.Biscuits.get(i)).getHits();
										int bb = ((BBSHitters) BTeams.Biscuits.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BTeams.Biscuits.get(i)).getHomeRuns();
		
		
		
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}	
					}
				
				
				
				
				
				
				
				//PINKERTONS
				//PINKERTONS
				//PINKERTONS


//Display FULL Pinkerton Team
				public static void displayPinkertonsTeam()
					{
						displayPinkertonsPitchers();
						displayPinkertonsHitters();

					}				


//Print Pinkerton Pitchers	
				public static void displayPinkertonsPitchers()
					{
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
								 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
								  "HitByPitch" , "InningsPitched");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								if (BTeams.Pinkertons.get(i).getType().equals("Pitcher"))
									{

										String t2 = BTeams.Pinkertons.get(i).getType2();
										String fn = BTeams.Pinkertons.get(i).getFirstName();
										String ln = BTeams.Pinkertons.get(i).getLastName();
										String rare = BTeams.Pinkertons.get(i).getRarity();
										int yp = BTeams.Pinkertons.get(i).getYearsPlayed();
										int g = ((BBSPitchers) BTeams.Pinkertons.get(i)).getGamesPlayed();
										int bf = ((BBSPitchers) BTeams.Pinkertons.get(i)).getBattersFaced();
										int h = ((BBSPitchers) BTeams.Pinkertons.get(i)).getHitsAllowed();
										int w = ((BBSPitchers) BTeams.Pinkertons.get(i)).getWalks();
										int s = ((BBSPitchers) BTeams.Pinkertons.get(i)).getStrikeOut();
										int hbp = ((BBSPitchers) BTeams.Pinkertons.get(i)).getHitByPitch();
										double ip =  ((BBSPitchers) BTeams.Pinkertons.get(i)).getInningsPitched();
	
										
										System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
												 t2, fn + " " + ln, rare, 
												 yp, g, bf, h, 
												 w, s, hbp, ip);
									}
							}
					}

//Print Pinkerton Hitters		
				public static void displayPinkertonsHitters()
					{	

						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								
								if (BTeams.Pinkertons.get(i).getType().equals("Hitter"))
									{

										String t2 = BTeams.Pinkertons.get(i).getType2();
										String fn = BTeams.Pinkertons.get(i).getFirstName();
										String ln = BTeams.Pinkertons.get(i).getLastName();
										String rare = BTeams.Pinkertons.get(i).getRarity();
										int yp = BTeams.Pinkertons.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BTeams.Pinkertons.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BTeams.Pinkertons.get(i)).getAtBats();
										int rbi = ((BBSHitters) BTeams.Pinkertons.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BTeams.Pinkertons.get(i)).getHits();
										int bb = ((BBSHitters) BTeams.Pinkertons.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BTeams.Pinkertons.get(i)).getHomeRuns();
		
		
		
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}	
					}
				
				
				
				
				
				
				
				//EL FARTS
				//EL FARTS
				//EL FARTS


//Display FULL El Farts Team
				public static void displayElFartsTeam()
					{
						displayElFartsPitchers();
						displayElFartsHitters();

					}				


//Print El Farts Pitchers	
				public static void displayElFartsPitchers()
					{
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
								 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
								  "HitByPitch" , "InningsPitched");
						System.out.println();

						for (int i = 0; i <= 19; i++) 
							{
								if (BTeams.ElFarts.get(i).getType().equals("Pitcher"))
									{

										String t2 = BTeams.ElFarts.get(i).getType2();
										String fn = BTeams.ElFarts.get(i).getFirstName();
										String ln = BTeams.ElFarts.get(i).getLastName();
										String rare = BTeams.ElFarts.get(i).getRarity();
										int yp = BTeams.ElFarts.get(i).getYearsPlayed();
										int g = ((BBSPitchers) BTeams.ElFarts.get(i)).getGamesPlayed();
										int bf = ((BBSPitchers) BTeams.ElFarts.get(i)).getBattersFaced();
										int h = ((BBSPitchers) BTeams.ElFarts.get(i)).getHitsAllowed();
										int w = ((BBSPitchers) BTeams.ElFarts.get(i)).getWalks();
										int s = ((BBSPitchers) BTeams.ElFarts.get(i)).getStrikeOut();
										int hbp = ((BBSPitchers) BTeams.ElFarts.get(i)).getHitByPitch();
										double ip =  ((BBSPitchers) BTeams.ElFarts.get(i)).getInningsPitched();
	
										
										System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
												 t2, fn + " " + ln, rare, 
												 yp, g, bf, h, 
												 w, s, hbp, ip);
									}
							}
					}

//Print El Farts Hitters		
				public static void displayElFartsHitters()
					{	

						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								
								if (BTeams.ElFarts.get(i).getType().equals("Hitter"))
									{

										String t2 = BTeams.ElFarts.get(i).getType2();
										String fn = BTeams.ElFarts.get(i).getFirstName();
										String ln = BTeams.ElFarts.get(i).getLastName();
										String rare = BTeams.ElFarts.get(i).getRarity();
										int yp = BTeams.ElFarts.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BTeams.ElFarts.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BTeams.ElFarts.get(i)).getAtBats();
										int rbi = ((BBSHitters) BTeams.ElFarts.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BTeams.ElFarts.get(i)).getHits();
										int bb = ((BBSHitters) BTeams.ElFarts.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BTeams.ElFarts.get(i)).getHomeRuns();
		
		
		
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}	
					}
				
				
				
				
				
				
				
				//CHICHARRONES
				//CHICHARRONES
				//CHICHARRONES


//Display FULL Chicharrones Team
				public static void displayChicharronesTeam()
					{
						displayChicharronesPitchers();
						displayChicharronesHitters();

					}				


//Print Chicharrones Pitchers	
				public static void displayChicharronesPitchers()
					{
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
								 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
								  "HitByPitch" , "InningsPitched");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								if (BTeams.Chicharrones.get(i).getType().equals("Pitcher"))
									{

										String t2 = BTeams.Chicharrones.get(i).getType2();
										String fn = BTeams.Chicharrones.get(i).getFirstName();
										String ln = BTeams.Chicharrones.get(i).getLastName();
										String rare = BTeams.Chicharrones.get(i).getRarity();
										int yp = BTeams.Chicharrones.get(i).getYearsPlayed();
										int g = ((BBSPitchers) BTeams.Chicharrones.get(i)).getGamesPlayed();
										int bf = ((BBSPitchers) BTeams.Chicharrones.get(i)).getBattersFaced();
										int h = ((BBSPitchers) BTeams.Chicharrones.get(i)).getHitsAllowed();
										int w = ((BBSPitchers) BTeams.Chicharrones.get(i)).getWalks();
										int s = ((BBSPitchers) BTeams.Chicharrones.get(i)).getStrikeOut();
										int hbp = ((BBSPitchers) BTeams.Chicharrones.get(i)).getHitByPitch();
										double ip =  ((BBSPitchers) BTeams.Chicharrones.get(i)).getInningsPitched();
	
										
										System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
												 t2, fn + " " + ln, rare, 
												 yp, g, bf, h, 
												 w, s, hbp, ip);
									}
							}
					}

//Print Chicharrones Hitters		
				public static void displayChicharronesHitters()
					{	

						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								
								if (BTeams.Chicharrones.get(i).getType().equals("Hitter"))
									{

										String t2 = BTeams.Chicharrones.get(i).getType2();
										String fn = BTeams.Chicharrones.get(i).getFirstName();
										String ln = BTeams.Chicharrones.get(i).getLastName();
										String rare = BTeams.Chicharrones.get(i).getRarity();
										int yp = BTeams.Chicharrones.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BTeams.Chicharrones.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BTeams.Chicharrones.get(i)).getAtBats();
										int rbi = ((BBSHitters) BTeams.Chicharrones.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BTeams.Chicharrones.get(i)).getHits();
										int bb = ((BBSHitters) BTeams.Chicharrones.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BTeams.Chicharrones.get(i)).getHomeRuns();
		
		
		
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}	
					}

				
				
				
				
				
									//LEGENDS
									//LEGENDS
									//LEGENDS


//Display FULL Legends Team
				public static void displayLegendsTeam()
					{
						displayLegendsPitchers();
						displayLegendsHitters();

					}				


//Print Legends Pitchers	
				public static void displayLegendsPitchers()
					{
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-14s %-15s %-14s %-8s %-13s %-13s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "GamesPlayed",
								 "BattersFaced", "HitsAllowed", "Walks", "StrikeOuts",
								  "HitByPitch" , "InningsPitched");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{
								if (BTeams.Legends.get(i).getType().equals("Pitcher"))
									{

										String t2 = BTeams.Legends.get(i).getType2();
										String fn = BTeams.Legends.get(i).getFirstName();
										String ln = BTeams.Legends.get(i).getLastName();
										String rare = BTeams.Legends.get(i).getRarity();
										int yp = BTeams.Legends.get(i).getYearsPlayed();
										int g = ((BBSPitchers) BTeams.Legends.get(i)).getGamesPlayed();
										int bf = ((BBSPitchers) BTeams.Legends.get(i)).getBattersFaced();
										int h = ((BBSPitchers) BTeams.Legends.get(i)).getHitsAllowed();
										int w = ((BBSPitchers) BTeams.Legends.get(i)).getWalks();
										int s = ((BBSPitchers) BTeams.Legends.get(i)).getStrikeOut();
										int hbp = ((BBSPitchers) BTeams.Legends.get(i)).getHitByPitch();
										double ip =  ((BBSPitchers) BTeams.Legends.get(i)).getInningsPitched();
	
										
										System.out.printf("\n%-12s %-23s %-13s %-14s %-14s %-15s %-11s %-10s %-13s %-14s %-13s",
												 t2, fn + " " + ln, rare, 
												 yp, g, bf, h, 
												 w, s, hbp, ip);
									}
							}
					}

//Print Legends Hitters		
				public static void displayLegendsHitters()
					{	

						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.printf("%-17s %-18s %-9s %-14s %-19s %-9s %-7s %-8s %-11s %-13s",  
								"Position", "Name", "Rarity", "YearsPlayed", "PlateAppearances",
								 "AtBats", "Hits", "Walks", "HomeRuns",
								  "RBIs");
						System.out.println();


						for (int i = 0; i <= 19; i++) 
							{

								if (BTeams.Legends.get(i).getType().equals("Hitter"))
									{

										String t2 = BTeams.Legends.get(i).getType2();
										String fn = BTeams.Legends.get(i).getFirstName();
										String ln = BTeams.Legends.get(i).getLastName();
										String rare = BTeams.Legends.get(i).getRarity();
										int yp = BTeams.Legends.get(i).getYearsPlayed();
										int pa = ((BBSHitters) BTeams.Legends.get(i)).getPlateAppearances();
										int ab = ((BBSHitters) BTeams.Legends.get(i)).getAtBats();
										int rbi = ((BBSHitters) BTeams.Legends.get(i)).getRunsBattedIn();
										int h = ((BBSHitters) BTeams.Legends.get(i)).getHits();
										int bb = ((BBSHitters) BTeams.Legends.get(i)).getBaseOnBalls();
										int hr = ((BBSHitters) BTeams.Legends.get(i)).getHomeRuns();
		
		
		
										System.out.printf("\n%-12s %-23s %-13s %-15s %-15s %-8s %-8s %-9s %-9s %-14s",
												 "   " + t2, fn + " " + ln, rare, 
												 yp, pa, ab, h, 
												 bb, hr, rbi);
									}
							}
					}
				
				
				
				
				
				
				
				
		
	}
