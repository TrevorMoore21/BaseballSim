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
										
										boolean grouch = false;
										boolean r1 = false;
										boolean r2 = false;
										boolean r3 = false;
										boolean r4 = false;
										boolean r5 = false;
										boolean r6 = false;
										boolean r7 = false;
										
							
										for (BAllStarPlayer r: BPlayerInfo.team)
											{
												if( r.getType2().equals("Reliever"))
													{
														playerRelieverZ.add(r);
													}
											}
						
										
										
										do
											{
												//random num from 0 to 8
												int startRandoN = (int) (Math.random() * 9);
												
												
												if (r1 == false && startRandoN == 0)
													{
														
														playerReliever.add(playerRelieverZ.get(0));
														
														r1 = true;
													}
												if (r2 == false && startRandoN == 1)
													{
														
														playerReliever.add(playerRelieverZ.get(1));
														
														r2 = true;
													}
												if (r3 == false && startRandoN == 2)
													{
														
														playerReliever.add(playerRelieverZ.get(2));
														
														r3 = true;
													}
												if (r4 == false && startRandoN == 3)
													{
														
														playerReliever.add(playerRelieverZ.get(3));
														
														r4 = true;
													}
												if (r5 == false && startRandoN == 4)
													{
														
														playerReliever.add(playerRelieverZ.get(4));
														
														r5 = true;
													}
												if (r6 == false && startRandoN == 5)
													{
														
														playerReliever.add(playerRelieverZ.get(5));
														
														r6 = true;
													}
												if (r7 == false && startRandoN == 6)
													{
														
														playerReliever.add(playerRelieverZ.get(6));
														
														r7 = true;
													}
												
												
												if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
														&& r6 == true && r7 == true)
													{
														
														r1 = false;
														r2 = false;
														r3 = false;
														r4 = false;
														r5 = false;
														r6 = false;
														r7 = false;
														
														
														grouch = true;
													}
											} while (grouch == false);
										
										grouch = false;
																			
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
	
	
	

//randomize Rubber Starter, Relievers, and Lineup
			public static void randomizeRubberSRL()
			{
				
				pickRubberRandoStarter();
				pickRubberRandoReliever();
				createRubberLineup();
				
			}
			

//pick Rubber random Starter
			public static void pickRubberRandoStarter()
				{
					
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
					
					
					for (BAllStarPlayer s: RubberDucks)
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
			
			
//pick Rubber random Reliever
					public static void pickRubberRandoReliever()
						{

							boolean grouch = false;
							boolean r1 = false;
							boolean r2 = false;
							boolean r3 = false;
							boolean r4 = false;
							boolean r5 = false;
							boolean r6 = false;
							boolean r7 = false;
							
				
							for (BAllStarPlayer r: RubberDucks)
								{
									if( r.getType2().equals("Reliever"))
										{
											rubberRelieverZ.add(r);
										}
								}
			
							
							
							do
								{
									//random num from 0 to 8
									int startRandoN = (int) (Math.random() * 9);
									
									
									if (r1 == false && startRandoN == 0)
										{
											
											rubberReliever.add(rubberRelieverZ.get(0));
											
											r1 = true;
										}
									if (r2 == false && startRandoN == 1)
										{
											
											rubberReliever.add(rubberRelieverZ.get(1));
											
											r2 = true;
										}
									if (r3 == false && startRandoN == 2)
										{
											
											rubberReliever.add(rubberRelieverZ.get(2));
											
											r3 = true;
										}
									if (r4 == false && startRandoN == 3)
										{
											
											rubberReliever.add(rubberRelieverZ.get(3));
											
											r4 = true;
										}
									if (r5 == false && startRandoN == 4)
										{
											
											rubberReliever.add(rubberRelieverZ.get(4));
											
											r5 = true;
										}
									if (r6 == false && startRandoN == 5)
										{
											
											rubberReliever.add(rubberRelieverZ.get(5));
											
											r6 = true;
										}
									if (r7 == false && startRandoN == 6)
										{
											
											rubberReliever.add(rubberRelieverZ.get(6));
											
											r7 = true;
										}
									
									
									if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
											&& r6 == true && r7 == true)
										{
											
											r1 = false;
											r2 = false;
											r3 = false;
											r4 = false;
											r5 = false;
											r6 = false;
											r7 = false;
											
											
											grouch = true;
										}
								} while (grouch == false);
							
							grouch = false;
			
						}

			
//randomize Rubber lineup
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
				
			
				
				for (BAllStarPlayer h: RubberDucks)
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
				

			
			
			
			
			
			
									//RANDOMIZE YARD SRLs
									//RANDOMIZE YARD SRLs
									//RANDOMIZE YARD SRLs




//randomize Yard Starter, Relievers, and Lineup
			public static void randomizeYardSRL()
				{
	
					pickYardRandoStarter();
					pickYardRandoReliever();
					createYardLineup();
	
				}


//pick Yard random Starter
			public static void pickYardRandoStarter()
				{
		
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
		
		
					for (BAllStarPlayer s: YardGoats)
						{
							if( s.getType2().equals("Starter"))
								{
									yardStarterZ.add(s);
								}
						}

		
					do
						{
							if (xxx == startRandoN && gas == false)
								{
						
									yardStarter.add(yardStarterZ.get(startRandoN));
						
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


//pick Yard random Reliever
			public static void pickYardRandoReliever()
				{

					boolean grouch = false;
					boolean r1 = false;
					boolean r2 = false;
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;
					boolean r6 = false;
					boolean r7 = false;
					
		
					for (BAllStarPlayer r: YardGoats)
						{
							if( r.getType2().equals("Reliever"))
								{
									yardRelieverZ.add(r);
								}
						}
	
					
					
					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
							
							
							if (r1 == false && startRandoN == 0)
								{
									
									yardReliever.add(yardRelieverZ.get(0));
									
									r1 = true;
								}
							if (r2 == false && startRandoN == 1)
								{
									
									yardReliever.add(yardRelieverZ.get(1));
									
									r2 = true;
								}
							if (r3 == false && startRandoN == 2)
								{
									
									yardReliever.add(yardRelieverZ.get(2));
									
									r3 = true;
								}
							if (r4 == false && startRandoN == 3)
								{
									
									yardReliever.add(yardRelieverZ.get(3));
									
									r4 = true;
								}
							if (r5 == false && startRandoN == 4)
								{
									
									yardReliever.add(yardRelieverZ.get(4));
									
									r5 = true;
								}
							if (r6 == false && startRandoN == 5)
								{
									
									yardReliever.add(yardRelieverZ.get(5));
									
									r6 = true;
								}
							if (r7 == false && startRandoN == 6)
								{
									
									yardReliever.add(yardRelieverZ.get(6));
									
									r7 = true;
								}
							
							
							if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
									&& r6 == true && r7 == true)
								{
									
									r1 = false;
									r2 = false;
									r3 = false;
									r4 = false;
									r5 = false;
									r6 = false;
									r7 = false;
									
									
									grouch = true;
								}
						} while (grouch == false);
					
					grouch = false;

				}


//randomize Yard lineup
			public static void createYardLineup()
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
	

	
					for (BAllStarPlayer h: YardGoats)
						{
							if( h.getType().equals("Hitter"))
								{
									yardHitterZ.add(h);
								}
						}			
	

					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
			
			
							if (h1 == false && startRandoN == 0)
								{
					
									yardLinup.add(yardHitterZ.get(0));
					
									h1 = true;
								}
							if (h2 == false && startRandoN == 1)
								{
					
									yardLinup.add(yardHitterZ.get(1));
					
									h2 = true;
								}
							if (h3 == false && startRandoN == 2)
								{
					
									yardLinup.add(yardHitterZ.get(2));
					
									h3 = true;
								}
							if (h4 == false && startRandoN == 3)
								{
					
									yardLinup.add(yardHitterZ.get(3));
									
									h4 = true;
								}
							if (h5 == false && startRandoN == 4)
								{
					
									yardLinup.add(yardHitterZ.get(4));
					
									h5 = true;
								}
							if (h6 == false && startRandoN == 5)
								{
									
									yardLinup.add(yardHitterZ.get(5));
					
									h6 = true;
								}
							if (h7 == false && startRandoN == 6)
								{
					
									yardLinup.add(yardHitterZ.get(6));
					
									h7 = true;
								}
							if (h8 == false && startRandoN == 7)
								{
					
									yardLinup.add(yardHitterZ.get(7));
					
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
	

		
		
//					for (int i = 0; i < 8; i++)
//						{
//					
//							System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//					
//						}
	
				}


			
			
			
			
			
			
									//RANDOMIZE BISCUIT SRLs
									//RANDOMIZE BISCUIT SRLs
									//RANDOMIZE BISCUIT SRLs




//randomize Biscuit Starter, Relievers, and Lineup
			public static void randomizeBiscuitSRL()
				{
	
					pickBiscuitRandoStarter();
					pickBiscuitRandoReliever();
					createBiscuitLineup();
	
				}


//pick Biscuit random Starter
			public static void pickBiscuitRandoStarter()
				{
		
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
		
		
					for (BAllStarPlayer s: Biscuits)
						{
							if( s.getType2().equals("Starter"))
								{
									biscuitStarterZ.add(s);
								}
						}

		
					do
						{
							if (xxx == startRandoN && gas == false)
								{
						
									biscuitStarter.add(biscuitStarterZ.get(startRandoN));
						
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


//pick Biscuit random Reliever
			public static void pickBiscuitRandoReliever()
				{

					boolean grouch = false;
					boolean r1 = false;
					boolean r2 = false;
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;
					boolean r6 = false;
					boolean r7 = false;
					
		
					for (BAllStarPlayer r: Biscuits)
						{
							if( r.getType2().equals("Reliever"))
								{
									biscuitRelieverZ.add(r);
								}
						}
	
					
					
					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
							
							
							if (r1 == false && startRandoN == 0)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(0));
									
									r1 = true;
								}
							if (r2 == false && startRandoN == 1)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(1));
									
									r2 = true;
								}
							if (r3 == false && startRandoN == 2)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(2));
									
									r3 = true;
								}
							if (r4 == false && startRandoN == 3)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(3));
									
									r4 = true;
								}
							if (r5 == false && startRandoN == 4)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(4));
									
									r5 = true;
								}
							if (r6 == false && startRandoN == 5)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(5));
									
									r6 = true;
								}
							if (r7 == false && startRandoN == 6)
								{
									
									biscuitReliever.add(biscuitRelieverZ.get(6));
									
									r7 = true;
								}
							
							
							if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
									&& r6 == true && r7 == true)
								{
									
									r1 = false;
									r2 = false;
									r3 = false;
									r4 = false;
									r5 = false;
									r6 = false;
									r7 = false;
									
									
									grouch = true;
								}
						} while (grouch == false);
					
					grouch = false;

				}


//randomize Biscuit lineup
			public static void createBiscuitLineup()
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
	

	
					for (BAllStarPlayer h: Biscuits)
						{
							if( h.getType().equals("Hitter"))
								{
									biscuitHitterZ.add(h);
								}
						}			
	

					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
			
			
							if (h1 == false && startRandoN == 0)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(0));
					
									h1 = true;
								}
							if (h2 == false && startRandoN == 1)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(1));
					
									h2 = true;
								}
							if (h3 == false && startRandoN == 2)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(2));
					
									h3 = true;
								}
							if (h4 == false && startRandoN == 3)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(3));
									
									h4 = true;
								}
							if (h5 == false && startRandoN == 4)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(4));
					
									h5 = true;
								}
							if (h6 == false && startRandoN == 5)
								{
									
									biscuitLinup.add(biscuitHitterZ.get(5));
					
									h6 = true;
								}
							if (h7 == false && startRandoN == 6)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(6));
					
									h7 = true;
								}
							if (h8 == false && startRandoN == 7)
								{
					
									biscuitLinup.add(biscuitHitterZ.get(7));
					
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
	

		
		
//					for (int i = 0; i < 8; i++)
//						{
//					
//							System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//					
//						}
	
				}


			
			
			
			
			
			
									//RANDOMIZE PINKERTON SRLs
									//RANDOMIZE PINKERTON SRLs
									//RANDOMIZE PINKERTON SRLs




//randomize Pinkerton Starter, Relievers, and Lineup
			public static void randomizePinkertonSRL()
				{
	
					pickPinkertonRandoStarter();
					pickPinkertonRandoReliever();
					createPinkertonLineup();
	
				}


//pick Pinkerton random Starter
			public static void pickPinkertonRandoStarter()
				{
		
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
		
		
					for (BAllStarPlayer s: Pinkertons)
						{
							if( s.getType2().equals("Starter"))
								{
									pinkertonStarterZ.add(s);
								}
						}

		
					do
						{
							if (xxx == startRandoN && gas == false)
								{
						
									pinkertonStarter.add(pinkertonStarterZ.get(startRandoN));
						
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


//pick Pinkerton random Reliever
			public static void pickPinkertonRandoReliever()
				{

					boolean grouch = false;
					boolean r1 = false;
					boolean r2 = false;
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;
					boolean r6 = false;
					boolean r7 = false;
					
		
					for (BAllStarPlayer r: Pinkertons)
						{
							if( r.getType2().equals("Reliever"))
								{
									pinkertonRelieverZ.add(r);
								}
						}
	
					
					
					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
							
							
							if (r1 == false && startRandoN == 0)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(0));
									
									r1 = true;
								}
							if (r2 == false && startRandoN == 1)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(1));
									
									r2 = true;
								}
							if (r3 == false && startRandoN == 2)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(2));
									
									r3 = true;
								}
							if (r4 == false && startRandoN == 3)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(3));
									
									r4 = true;
								}
							if (r5 == false && startRandoN == 4)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(4));
									
									r5 = true;
								}
							if (r6 == false && startRandoN == 5)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(5));
									
									r6 = true;
								}
							if (r7 == false && startRandoN == 6)
								{
									
									pinkertonReliever.add(pinkertonRelieverZ.get(6));
									
									r7 = true;
								}
							
							
							if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
									&& r6 == true && r7 == true)
								{
									
									r1 = false;
									r2 = false;
									r3 = false;
									r4 = false;
									r5 = false;
									r6 = false;
									r7 = false;
									
									
									grouch = true;
								}
						} while (grouch == false);
					
					grouch = false;

				}


//randomize Pinkerton lineup
			public static void createPinkertonLineup()
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
	

	
					for (BAllStarPlayer h: Pinkertons)
						{
							if( h.getType().equals("Hitter"))
								{
									pinkertonHitterZ.add(h);
								}
						}			
	

					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
			
			
							if (h1 == false && startRandoN == 0)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(0));
					
									h1 = true;
								}
							if (h2 == false && startRandoN == 1)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(1));
					
									h2 = true;
								}
							if (h3 == false && startRandoN == 2)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(2));
					
									h3 = true;
								}
							if (h4 == false && startRandoN == 3)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(3));
									
									h4 = true;
								}
							if (h5 == false && startRandoN == 4)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(4));
					
									h5 = true;
								}
							if (h6 == false && startRandoN == 5)
								{
									
									pinkertonLinup.add(pinkertonHitterZ.get(5));
					
									h6 = true;
								}
							if (h7 == false && startRandoN == 6)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(6));
					
									h7 = true;
								}
							if (h8 == false && startRandoN == 7)
								{
					
									pinkertonLinup.add(pinkertonHitterZ.get(7));
					
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
	

		
		
//					for (int i = 0; i < 8; i++)
//						{
//					
//							System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//					
//						}
	
				}


			
			
			
			
			
			
									//RANDOMIZE EL FART SRLs
									//RANDOMIZE EL FART SRLs
									//RANDOMIZE EL FART SRLs



//randomize El Fart Starter, Relievers, and Lineup
			public static void randomizeElFartSRL()
				{
	
					pickElFartRandoStarter();
					pickElFartRandoReliever();
					createElFartLineup();
	
				}


//pick El Fart random Starter
			public static void pickElFartRandoStarter()
				{
		
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
		
		
					for (BAllStarPlayer s: ElFarts)
						{
							if( s.getType2().equals("Starter"))
								{
									elfartStarterZ.add(s);
								}
						}

		
					do
						{
							if (xxx == startRandoN && gas == false)
								{
						
									elfartStarter.add(elfartStarterZ.get(startRandoN));
						
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


//pick El Fart random Reliever
			public static void pickElFartRandoReliever()
				{
	
					boolean grouch = false;
					boolean r1 = false;
					boolean r2 = false;
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;
					boolean r6 = false;
					boolean r7 = false;
					
		
					for (BAllStarPlayer r: ElFarts)
						{
							if( r.getType2().equals("Reliever"))
								{
									elfartRelieverZ.add(r);
								}
						}
	
					
					
					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
							
							
							if (r1 == false && startRandoN == 0)
								{
									
									elfartReliever.add(elfartRelieverZ.get(0));
									
									r1 = true;
								}
							if (r2 == false && startRandoN == 1)
								{
									
									elfartReliever.add(elfartRelieverZ.get(1));
									
									r2 = true;
								}
							if (r3 == false && startRandoN == 2)
								{
									
									elfartReliever.add(elfartRelieverZ.get(2));
									
									r3 = true;
								}
							if (r4 == false && startRandoN == 3)
								{
									
									elfartReliever.add(elfartRelieverZ.get(3));
									
									r4 = true;
								}
							if (r5 == false && startRandoN == 4)
								{
									
									elfartReliever.add(elfartRelieverZ.get(4));
									
									r5 = true;
								}
							if (r6 == false && startRandoN == 5)
								{
									
									elfartReliever.add(elfartRelieverZ.get(5));
									
									r6 = true;
								}
							if (r7 == false && startRandoN == 6)
								{
									
									elfartReliever.add(elfartRelieverZ.get(6));
									
									r7 = true;
								}
							
							
							if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
									&& r6 == true && r7 == true)
								{
									
									r1 = false;
									r2 = false;
									r3 = false;
									r4 = false;
									r5 = false;
									r6 = false;
									r7 = false;
									
									
									grouch = true;
								}
						} while (grouch == false);
					
					grouch = false;

				}


//randomize El Fart lineup
			public static void createElFartLineup()
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
	

	
					for (BAllStarPlayer h: ElFarts)
						{
							if( h.getType().equals("Hitter"))
								{
									elfartHitterZ.add(h);
								}
						}			
	

					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
			
			
							if (h1 == false && startRandoN == 0)
								{
					
									elfartLinup.add(elfartHitterZ.get(0));
					
									h1 = true;
								}
							if (h2 == false && startRandoN == 1)
								{
					
									elfartLinup.add(elfartHitterZ.get(1));
					
									h2 = true;
								}
							if (h3 == false && startRandoN == 2)
								{
					
									elfartLinup.add(elfartHitterZ.get(2));
					
									h3 = true;
								}
							if (h4 == false && startRandoN == 3)
								{
					
									elfartLinup.add(elfartHitterZ.get(3));
									
									h4 = true;
								}
							if (h5 == false && startRandoN == 4)
								{
					
									elfartLinup.add(elfartHitterZ.get(4));
					
									h5 = true;
								}
							if (h6 == false && startRandoN == 5)
								{
									
									elfartLinup.add(elfartHitterZ.get(5));
					
									h6 = true;
								}
							if (h7 == false && startRandoN == 6)
								{
					
									elfartLinup.add(elfartHitterZ.get(6));
					
									h7 = true;
								}
							if (h8 == false && startRandoN == 7)
								{
					
									elfartLinup.add(elfartHitterZ.get(7));
					
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
	

		
		
//					for (int i = 0; i < 8; i++)
//						{
//					
//							System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//					
//						}
	
				}


			
			
			
			
			
			
									//RANDOMIZE CHICHARRON SRLs
									//RANDOMIZE CHICHARRON SRLs
									//RANDOMIZE CHICHARRON SRLs




//randomize Chicharron Starter, Relievers, and Lineup
			public static void randomizeChicharronSRL()
				{
	
					pickChicharronRandoStarter();
					pickChicharronRandoReliever();
					createChicharronLineup();
	
				}


//pick Chicharron random Starter
			public static void pickChicharronRandoStarter()
				{
		
					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;
		
		
					for (BAllStarPlayer s: Chicharrones)
						{
							if( s.getType2().equals("Starter"))
								{
									chicharronStarterZ.add(s);
								}
						}

		
					do
						{
							if (xxx == startRandoN && gas == false)
								{
						
									chicharronStarter.add(chicharronStarterZ.get(startRandoN));
						
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


//pick Chicharron random Reliever
			public static void pickChicharronRandoReliever()
				{
	

					boolean grouch = false;
					boolean r1 = false;
					boolean r2 = false;
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;
					boolean r6 = false;
					boolean r7 = false;
					
		
					for (BAllStarPlayer r: Chicharrones)
						{
							if( r.getType2().equals("Reliever"))
								{
									chicharronRelieverZ.add(r);
								}
						}
	
					
					
					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
							
							
							if (r1 == false && startRandoN == 0)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(0));
									
									r1 = true;
								}
							if (r2 == false && startRandoN == 1)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(1));
									
									r2 = true;
								}
							if (r3 == false && startRandoN == 2)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(2));
									
									r3 = true;
								}
							if (r4 == false && startRandoN == 3)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(3));
									
									r4 = true;
								}
							if (r5 == false && startRandoN == 4)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(4));
									
									r5 = true;
								}
							if (r6 == false && startRandoN == 5)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(5));
									
									r6 = true;
								}
							if (r7 == false && startRandoN == 6)
								{
									
									chicharronReliever.add(chicharronRelieverZ.get(6));
									
									r7 = true;
								}
							
							
							if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
									&& r6 == true && r7 == true)
								{
									
									r1 = false;
									r2 = false;
									r3 = false;
									r4 = false;
									r5 = false;
									r6 = false;
									r7 = false;
									
									
									grouch = true;
								}
						} while (grouch == false);
					
					grouch = false;

				}


//randomize Chicharron lineup
			public static void createChicharronLineup()
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
	

	
					for (BAllStarPlayer h: Chicharrones)
						{
							if( h.getType().equals("Hitter"))
								{
									chicharronHitterZ.add(h);
								}
						}			
	

					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
			
			
							if (h1 == false && startRandoN == 0)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(0));
					
									h1 = true;
								}
							if (h2 == false && startRandoN == 1)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(1));
					
									h2 = true;
								}
							if (h3 == false && startRandoN == 2)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(2));
					
									h3 = true;
								}
							if (h4 == false && startRandoN == 3)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(3));
									
									h4 = true;
								}
							if (h5 == false && startRandoN == 4)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(4));
					
									h5 = true;
								}
							if (h6 == false && startRandoN == 5)
								{
									
									chicharronLinup.add(chicharronHitterZ.get(5));
					
									h6 = true;
								}
							if (h7 == false && startRandoN == 6)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(6));
					
									h7 = true;
								}
							if (h8 == false && startRandoN == 7)
								{
					
									chicharronLinup.add(chicharronHitterZ.get(7));
					
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
	

		
		
//					for (int i = 0; i < 8; i++)
//						{
//					
//							System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//					
//						}
	
				}


			
			
			
			
			
			
			//RANDOMIZE LEGEND SRLs
			//RANDOMIZE LEGEND SRLs
			//RANDOMIZE LEGEND SRLs




//randomize Legend Starter, Relievers, and Lineup
			public static void randomizeLegendSRL()
				{

					pickLegendRandoStarter();
					pickLegendRandoReliever();
					createLegendLineup();

				}


//pick Legend random Starter
			public static void pickLegendRandoStarter()
				{

					int startRandoN = (int) (Math.random() * 5);
					boolean gas = false;
					int xxx = 0;


					for (BAllStarPlayer s: Legends)
						{
							if( s.getType2().equals("Starter"))
								{
									legendStarterZ.add(s);
								}
						}


					do
						{
							if (xxx == startRandoN && gas == false)
								{

									legendStarter.add(legendStarterZ.get(startRandoN));

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
	

//pick Legend random Reliever
			public static void pickLegendRandoReliever()
				{


					boolean grouch = false;
					boolean r1 = false;
					boolean r2 = false;
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;
					boolean r6 = false;
					boolean r7 = false;
					
		
					for (BAllStarPlayer r: Legends)
						{
							if( r.getType2().equals("Reliever"))
								{
									legendRelieverZ.add(r);
								}
						}
	
					
					
					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);
							
							
							if (r1 == false && startRandoN == 0)
								{
									
									legendReliever.add(legendRelieverZ.get(0));
									
									r1 = true;
								}
							if (r2 == false && startRandoN == 1)
								{
									
									legendReliever.add(legendRelieverZ.get(1));
									
									r2 = true;
								}
							if (r3 == false && startRandoN == 2)
								{
									
									legendReliever.add(legendRelieverZ.get(2));
									
									r3 = true;
								}
							if (r4 == false && startRandoN == 3)
								{
									
									legendReliever.add(legendRelieverZ.get(3));
									
									r4 = true;
								}
							if (r5 == false && startRandoN == 4)
								{
									
									legendReliever.add(legendRelieverZ.get(4));
									
									r5 = true;
								}
							if (r6 == false && startRandoN == 5)
								{
									
									legendReliever.add(legendRelieverZ.get(5));
									
									r6 = true;
								}
							if (r7 == false && startRandoN == 6)
								{
									
									legendReliever.add(legendRelieverZ.get(6));
									
									r7 = true;
								}
							
							
							if (r1 == true && r2 == true && r3 == true && r4 == true && r5 == true 
									&& r6 == true && r7 == true)
								{
									
									r1 = false;
									r2 = false;
									r3 = false;
									r4 = false;
									r5 = false;
									r6 = false;
									r7 = false;
									
									
									grouch = true;
								}
						} while (grouch == false);
					
					grouch = false;

				}


//randomize Legend lineup
			public static void createLegendLineup()
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



					for (BAllStarPlayer h: Legends)
						{
							if( h.getType().equals("Hitter"))
								{
									legendHitterZ.add(h);
								}
						}			


					do
						{
							//random num from 0 to 8
							int startRandoN = (int) (Math.random() * 9);


							if (h1 == false && startRandoN == 0)
								{

									legendLinup.add(legendHitterZ.get(0));

									h1 = true;
								}
							if (h2 == false && startRandoN == 1)
								{

									legendLinup.add(legendHitterZ.get(1));
									
									h2 = true;
								}
							if (h3 == false && startRandoN == 2)
								{

									legendLinup.add(legendHitterZ.get(2));
			
									h3 = true;
								}
							if (h4 == false && startRandoN == 3)
								{

									legendLinup.add(legendHitterZ.get(3));
			
									h4 = true;
								}
							if (h5 == false && startRandoN == 4)
								{

									legendLinup.add(legendHitterZ.get(4));
			
									h5 = true;
								}
							if (h6 == false && startRandoN == 5)
								{
			
									legendLinup.add(legendHitterZ.get(5));

									h6 = true;
								}
							if (h7 == false && startRandoN == 6)
								{

									legendLinup.add(legendHitterZ.get(6));

									h7 = true;
								}
							if (h8 == false && startRandoN == 7)
								{

									legendLinup.add(legendHitterZ.get(7));

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




//						for (int i = 0; i < 8; i++)
//							{
//
//								System.out.println(playerLinup.get(i).getFirstName() + " " + playerLinup.get(i).getLastName());
//
//							}

				}

				
			
						
		}
		
	
