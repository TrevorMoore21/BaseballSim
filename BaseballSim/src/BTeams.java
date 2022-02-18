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
			}
		
	
