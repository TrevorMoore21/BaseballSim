import java.util.ArrayList;

public class BTeams
	{

				static ArrayList<BAllStarPlayer> RubberDucks = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> YardGoats = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> Biscuits = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> Pinkertons = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> ElFarts = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> Chicharrones = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> Legends = new ArrayList<BAllStarPlayer>();
				
				
				
				static ArrayList<BAllStarPlayer> playerStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> playerStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> playerRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> playerReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> playerHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> playerLinup = new ArrayList<BAllStarPlayer>();
				
				static ArrayList<BAllStarPlayer> rubberStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> rubberStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> rubberRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> rubberReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> rubberHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> rubberLinup = new ArrayList<BAllStarPlayer>();

				static ArrayList<BAllStarPlayer> yardStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> yardStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> yardRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> yardReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> yardHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> yardLinup = new ArrayList<BAllStarPlayer>();
				
				static ArrayList<BAllStarPlayer> biscuitStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> biscuitStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> biscuitRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> biscuitReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> biscuitHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> biscuitLinup = new ArrayList<BAllStarPlayer>();
				
				static ArrayList<BAllStarPlayer> pinkertonStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> pinkertonStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> pinkertonRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> pinkertonReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> pinkertonHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> pinkertonLinup = new ArrayList<BAllStarPlayer>();
				
				static ArrayList<BAllStarPlayer> elfartStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> elfartStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> elfartRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> elfartReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> elfartHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> elfartLinup = new ArrayList<BAllStarPlayer>();
				
				static ArrayList<BAllStarPlayer> chicharronStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> chicharronStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> chicharronRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> chicharronReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> chicharronHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> chicharronLinup = new ArrayList<BAllStarPlayer>();
				
				static ArrayList<BAllStarPlayer> legendStarterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> legendStarter = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> legendRelieverZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> legendReliever = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> legendHitterZ = new ArrayList<BAllStarPlayer>();
				static ArrayList<BAllStarPlayer> legendLinup = new ArrayList<BAllStarPlayer>();
				
				
				
				
//fill ALL TEAMS				
				public static void fillAllTeams()
				{
					fillRubberDucks();
					fillYardGoats();
					fillBiscuits();
					fillPinkertons();
					fillElFarts();
					fillChicharrones();
					fillLegends();
				}
				
//randomize ALL SRLs			
				public static void randomizeAllSRL()
				{
					
					randomizePlayerSRL();
					randomizeRubberSRL();
					randomizeYardSRL();
					randomizeBiscuitSRL();
					randomizePinkertonSRL();
					randomizeElFartSRL();
					randomizeChicharronSRL();
					randomizeLegendSRL();
					
				}
				
				
				
				
				
									//FILL TEAMS
									//FILL TEAMS
									//FILL TEAMS
				
				
				
				
				
				
				public static void fillRubberDucks()
					{
					
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 1 || ATxtReader.player[i].getPlayerN() == 3 || ATxtReader.player[i].getPlayerN() == 4
										|| ATxtReader.player[i].getPlayerN() == 5 || ATxtReader.player[i].getPlayerN() == 24 || ATxtReader.player[i].getPlayerN() == 6
										|| ATxtReader.player[i].getPlayerN() == 7 || ATxtReader.player[i].getPlayerN() == 8 || ATxtReader.player[i].getPlayerN() == 11
										|| ATxtReader.player[i].getPlayerN() == 12 || ATxtReader.player[i].getPlayerN() == 42 || ATxtReader.player[i].getPlayerN() == 45
										|| ATxtReader.player[i].getPlayerN() == 13 || ATxtReader.player[i].getPlayerN() == 14 || ATxtReader.player[i].getPlayerN() == 15
										|| ATxtReader.player[i].getPlayerN() == 17 || ATxtReader.player[i].getPlayerN() == 19 || ATxtReader.player[i].getPlayerN() == 20
										|| ATxtReader.player[i].getPlayerN() == 87 || ATxtReader.player[i].getPlayerN() == 93)
											{
													RubberDucks.add(ATxtReader.player[i]);
											}
							}
					}
				
				public static void fillYardGoats()
					{
						
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 1 || ATxtReader.player[i].getPlayerN() == 4 || ATxtReader.player[i].getPlayerN() == 5
										|| ATxtReader.player[i].getPlayerN() == 25 || ATxtReader.player[i].getPlayerN() == 37 || ATxtReader.player[i].getPlayerN() == 6
										|| ATxtReader.player[i].getPlayerN() == 7 || ATxtReader.player[i].getPlayerN() == 8 || ATxtReader.player[i].getPlayerN() == 11
										|| ATxtReader.player[i].getPlayerN() == 38 || ATxtReader.player[i].getPlayerN() == 42 || ATxtReader.player[i].getPlayerN() == 58
										|| ATxtReader.player[i].getPlayerN() == 13 || ATxtReader.player[i].getPlayerN() == 15 || ATxtReader.player[i].getPlayerN() == 16
										|| ATxtReader.player[i].getPlayerN() == 18 || ATxtReader.player[i].getPlayerN() == 20 || ATxtReader.player[i].getPlayerN() == 70
										|| ATxtReader.player[i].getPlayerN() == 79 || ATxtReader.player[i].getPlayerN() == 96)
											{
													YardGoats.add(ATxtReader.player[i]);
											}
							}
					}
				
				public static void fillBiscuits()
					{
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 2 || ATxtReader.player[i].getPlayerN() == 4 || ATxtReader.player[i].getPlayerN() == 5
										|| ATxtReader.player[i].getPlayerN() == 21 || ATxtReader.player[i].getPlayerN() == 24 || ATxtReader.player[i].getPlayerN() == 6
										|| ATxtReader.player[i].getPlayerN() == 8 || ATxtReader.player[i].getPlayerN() == 9 || ATxtReader.player[i].getPlayerN() == 11
										|| ATxtReader.player[i].getPlayerN() == 38 || ATxtReader.player[i].getPlayerN() == 42 || ATxtReader.player[i].getPlayerN() == 43
										|| ATxtReader.player[i].getPlayerN() == 13 || ATxtReader.player[i].getPlayerN() == 14 || ATxtReader.player[i].getPlayerN() == 18
										|| ATxtReader.player[i].getPlayerN() == 19 || ATxtReader.player[i].getPlayerN() == 80 || ATxtReader.player[i].getPlayerN() == 81
										|| ATxtReader.player[i].getPlayerN() == 86 || ATxtReader.player[i].getPlayerN() == 98)
											{
													Biscuits.add(ATxtReader.player[i]);
											}
							}
					}
				
				public static void fillPinkertons()
					{
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 1 || ATxtReader.player[i].getPlayerN() == 2 || ATxtReader.player[i].getPlayerN() == 3
										|| ATxtReader.player[i].getPlayerN() == 22 || ATxtReader.player[i].getPlayerN() == 25 || ATxtReader.player[i].getPlayerN() == 6
										|| ATxtReader.player[i].getPlayerN() == 9 || ATxtReader.player[i].getPlayerN() == 11 || ATxtReader.player[i].getPlayerN() == 12
										|| ATxtReader.player[i].getPlayerN() == 45 || ATxtReader.player[i].getPlayerN() == 47 || ATxtReader.player[i].getPlayerN() == 53
										|| ATxtReader.player[i].getPlayerN() == 15 || ATxtReader.player[i].getPlayerN() == 16 || ATxtReader.player[i].getPlayerN() == 17
										|| ATxtReader.player[i].getPlayerN() == 20 || ATxtReader.player[i].getPlayerN() == 59 || ATxtReader.player[i].getPlayerN() == 67
										|| ATxtReader.player[i].getPlayerN() == 99 || ATxtReader.player[i].getPlayerN() == 100)
											{
													Pinkertons.add(ATxtReader.player[i]);
											}
							}
					}
				
				public static void fillElFarts()
					{
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 4 || ATxtReader.player[i].getPlayerN() == 5 || ATxtReader.player[i].getPlayerN() == 30
										|| ATxtReader.player[i].getPlayerN() == 33 || ATxtReader.player[i].getPlayerN() == 34 || ATxtReader.player[i].getPlayerN() == 7
										|| ATxtReader.player[i].getPlayerN() == 10 || ATxtReader.player[i].getPlayerN() == 44 || ATxtReader.player[i].getPlayerN() == 47
										|| ATxtReader.player[i].getPlayerN() == 49 || ATxtReader.player[i].getPlayerN() == 50 || ATxtReader.player[i].getPlayerN() == 54
										|| ATxtReader.player[i].getPlayerN() == 13 || ATxtReader.player[i].getPlayerN() == 17 || ATxtReader.player[i].getPlayerN() == 77
										|| ATxtReader.player[i].getPlayerN() == 68 || ATxtReader.player[i].getPlayerN() == 84 || ATxtReader.player[i].getPlayerN() == 92
										|| ATxtReader.player[i].getPlayerN() == 93 || ATxtReader.player[i].getPlayerN() == 94)
											{
												ElFarts.add(ATxtReader.player[i]);
											}
							}
					}
				
				public static void fillChicharrones()
					{
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 1 || ATxtReader.player[i].getPlayerN() == 3 || ATxtReader.player[i].getPlayerN() == 35
										|| ATxtReader.player[i].getPlayerN() == 36 || ATxtReader.player[i].getPlayerN() == 27 || ATxtReader.player[i].getPlayerN() == 8
										|| ATxtReader.player[i].getPlayerN() == 11 || ATxtReader.player[i].getPlayerN() == 43 || ATxtReader.player[i].getPlayerN() == 46
										|| ATxtReader.player[i].getPlayerN() == 48 || ATxtReader.player[i].getPlayerN() == 55 || ATxtReader.player[i].getPlayerN() == 57
										|| ATxtReader.player[i].getPlayerN() == 16 || ATxtReader.player[i].getPlayerN() == 18 || ATxtReader.player[i].getPlayerN() == 74
										|| ATxtReader.player[i].getPlayerN() == 75 || ATxtReader.player[i].getPlayerN() == 60 || ATxtReader.player[i].getPlayerN() == 66
										|| ATxtReader.player[i].getPlayerN() == 90 || ATxtReader.player[i].getPlayerN() == 91)
											{
												Chicharrones.add(ATxtReader.player[i]);
											}
							}
					}
				
				public static void fillLegends()
					{
						for (int i = 0; i <= 99; i++) 
							{
								if (ATxtReader.player[i].getPlayerN() == 23 || ATxtReader.player[i].getPlayerN() == 26 || ATxtReader.player[i].getPlayerN() == 29
										|| ATxtReader.player[i].getPlayerN() == 31 || ATxtReader.player[i].getPlayerN() == 32 || ATxtReader.player[i].getPlayerN() == 44
										|| ATxtReader.player[i].getPlayerN() == 46 || ATxtReader.player[i].getPlayerN() == 48 || ATxtReader.player[i].getPlayerN() == 51
										|| ATxtReader.player[i].getPlayerN() == 52 || ATxtReader.player[i].getPlayerN() == 55 || ATxtReader.player[i].getPlayerN() == 43
										|| ATxtReader.player[i].getPlayerN() == 65 || ATxtReader.player[i].getPlayerN() == 71 || ATxtReader.player[i].getPlayerN() == 73
										|| ATxtReader.player[i].getPlayerN() == 76 || ATxtReader.player[i].getPlayerN() == 82 || ATxtReader.player[i].getPlayerN() == 89
										|| ATxtReader.player[i].getPlayerN() == 95 || ATxtReader.player[i].getPlayerN() == 97)
											{
													Legends.add(ATxtReader.player[i]);
											}
							}
					}
				
				
				
				
				
				
				
									//RANDOMIZE PLAYER SRLs
									//RANDOMIZE PLAYER SRLs
									//RANDOMIZE PLAYER SRLs
				
				
				

//randomize Player's Starter, Relievers, and Lineup
						public static void randomizePlayerSRL()
						{
							
							pickPlayerRandoStarter();
							pickPlayerRandoReliever();
							createPlayerLineup();
							
						}
						

//pick Player's random Starter
						public static void pickPlayerRandoStarter()
							{
								
								int startRandoN = (int) (Math.random() * 5);
								boolean gas = false;
								int xxx = 0;
								
								
								for (BAllStarPlayer s: BPlayerInfo.team)
									{
										if( s.getType2().equals("Starter"))
											{
												playerStarterZ.add(s);
											}
									}
						
								
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
								
								
								//System.out.println(playerStarter.get(0).getFirstName() + " " + playerStarter.get(0).getLastName());
							}
						
						
//pick Player's random Reliever
								public static void pickPlayerRandoReliever()
									{
							
										for (BAllStarPlayer r: BPlayerInfo.team)
											{
												if( r.getType2().equals("Reliever"))
													{
														playerRelieverZ.add(r);
													}
											}
						
									}
	
						
//randomize Player's lineup
						public static void createPlayerLineup()
						{
							
							boolean bombs = false;
							boolean h1 = false;
							boolean h2 = false;
							boolean h3 = false;
							boolean h4 = false;
							boolean h5 = false;
							boolean h6 = false;
							boolean h7 = false;
							boolean h8 = false;
							
						
							
							for (BAllStarPlayer h: BPlayerInfo.team)
								{
									if( h.getType().equals("Hitter"))
										{
											playerHitterZ.add(h);
										}
								}			
							
						
							do
								{
									//random num from 0 to 8
									int startRandoN = (int) (Math.random() * 9);
									
									
									if (h1 == false && startRandoN == 0)
										{
											
											playerLinup.add(playerHitterZ.get(0));
											
											h1 = true;
										}
									if (h2 == false && startRandoN == 1)
										{
											
											playerLinup.add(playerHitterZ.get(1));
											
											h2 = true;
										}
									if (h3 == false && startRandoN == 2)
										{
											
											playerLinup.add(playerHitterZ.get(2));
											
											h3 = true;
										}
									if (h4 == false && startRandoN == 3)
										{
											
											playerLinup.add(playerHitterZ.get(3));
											
											h4 = true;
										}
									if (h5 == false && startRandoN == 4)
										{
											
											playerLinup.add(playerHitterZ.get(4));
											
											h5 = true;
										}
									if (h6 == false && startRandoN == 5)
										{
											
											playerLinup.add(playerHitterZ.get(5));
											
											h6 = true;
										}
									if (h7 == false && startRandoN == 6)
										{
											
											playerLinup.add(playerHitterZ.get(6));
											
											h7 = true;
										}
									if (h8 == false && startRandoN == 7)
										{
											
											playerLinup.add(playerHitterZ.get(7));
											
											h8 = true;
										}
									
									if (h1 == true && h2 == true && h3 == true && h4 == true && h5 == true 
											&& h6 == true && h7 == true && h8 == true)
										{
											
											h1 = false;
											h2 = false;
											h3 = false;
											h4 = false;
											h5 = false;
											h6 = false;
											h7 = false;
											h8 = false;
											
											
											bombs = true;
										}
								} while (bombs == false);
							
								bombs = false;
							
				
								
								
//							for (int i = 0; i < 8; i++)
//								{
//									
//									System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//									
//								}
							
						}

						
						
						
						
						
						
						
						//RANDOMIZE RUBBER SRLs
						//RANDOMIZE RUBBER SRLs
						//RANDOMIZE RUBBER SRLs
	
	
	

//randomize Player's Starter, Relievers, and Lineup
			public static void randomizeRubberSRL()
			{
				
				pickRubberRandoStarter();
				pickRubberRandoReliever();
				createRubberLineup();
				
			}
			

//pick Player's random Starter
			public static void pickRubberRandoStarter()
				{
					
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
					
					
					for (BAllStarPlayer s: BPlayerInfo.team)
						{
							if( s.getType2().equals("Starter"))
								{
									rubberStarterZ.add(s);
								}
						}
			
					
					do
						{
							if (xxx == startRandoN && gas == false)
								{
									
									rubberStarter.add(rubberStarterZ.get(startRandoN));
									
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
					
					
					//System.out.println(playerStarter.get(0).getFirstName() + " " + playerStarter.get(0).getLastName());
				}
			
			
//pick Player's random Reliever
					public static void pickRubberRandoReliever()
						{
				
							for (BAllStarPlayer r: BPlayerInfo.team)
								{
									if( r.getType2().equals("Reliever"))
										{
											rubberRelieverZ.add(r);
										}
								}
			
						}

			
//randomize Player's lineup
			public static void createRubberLineup()
			{
				
				boolean bombs = false;
				boolean h1 = false;
				boolean h2 = false;
				boolean h3 = false;
				boolean h4 = false;
				boolean h5 = false;
				boolean h6 = false;
				boolean h7 = false;
				boolean h8 = false;
				
			
				
				for (BAllStarPlayer h: BPlayerInfo.team)
					{
						if( h.getType().equals("Hitter"))
							{
								rubberHitterZ.add(h);
							}
					}			
				
			
				do
					{
						//random num from 0 to 8
						int startRandoN = (int) (Math.random() * 9);
						
						
						if (h1 == false && startRandoN == 0)
							{
								
								rubberLinup.add(rubberHitterZ.get(0));
								
								h1 = true;
							}
						if (h2 == false && startRandoN == 1)
							{
								
								rubberLinup.add(rubberHitterZ.get(1));
								
								h2 = true;
							}
						if (h3 == false && startRandoN == 2)
							{
								
								rubberLinup.add(rubberHitterZ.get(2));
								
								h3 = true;
							}
						if (h4 == false && startRandoN == 3)
							{
								
								rubberLinup.add(rubberHitterZ.get(3));
								
								h4 = true;
							}
						if (h5 == false && startRandoN == 4)
							{
								
								rubberLinup.add(rubberHitterZ.get(4));
								
								h5 = true;
							}
						if (h6 == false && startRandoN == 5)
							{
								
								rubberLinup.add(rubberHitterZ.get(5));
								
								h6 = true;
							}
						if (h7 == false && startRandoN == 6)
							{
								
								rubberLinup.add(rubberHitterZ.get(6));
								
								h7 = true;
							}
						if (h8 == false && startRandoN == 7)
							{
								
								rubberLinup.add(rubberHitterZ.get(7));
								
								h8 = true;
							}
						
						if (h1 == true && h2 == true && h3 == true && h4 == true && h5 == true 
								&& h6 == true && h7 == true && h8 == true)
							{
								
								h1 = false;
								h2 = false;
								h3 = false;
								h4 = false;
								h5 = false;
								h6 = false;
								h7 = false;
								h8 = false;
								
								
								bombs = true;
							}
					} while (bombs == false);
				
					bombs = false;
				
	
					
					
//				for (int i = 0; i < 8; i++)
//					{
//						
//						System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//						
//					}
				
			}
				
				
				
				
						
						
						
						
						
						
						
						
		}
		
	
