import java.util.ArrayList;
import java.util.Collection;

public class BPlayerInfo
	{

		static String playerName;
		static int playerMoney;
		static boolean stillPlaying = true;
		//static ArrayList<String> team = new ArrayList<String>();
		static ArrayList<BAllStarPlayer> team = new ArrayList<BAllStarPlayer>();
		
//		static String [][] playerPitchers = new String[12][14];
//		static String [][] playerHitters = new String[8][13];
		
		
		
		
		
//starts game with giving player all of the coal players to make a team
		public static void introFillTeam()
		{
			for (int i = 0; i <= 20; i++) 
				{
					if (ATxtReader.player[i].getRarity().equals("Coal"))
						{
							team.add(ATxtReader.player[i]);
						}
				}
			
			
			
			
			//for display use if statement to get pitcher/hitter
			//use multiple getters to get differerent info for each line
			//team.add(TxtReader.player[0]);
		}
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		
		//DOES NOT WORK BRUH
		
//fills TWO 2D arrays with Player's team when STARTING the game
		public static void playerTeam()
		{
			
			//MAKE 2D ARRAYS TO ADD IN PITCHERS AND HITTERS
			
			for (int i = 0; i <= 11; i++)
				{
					if (TxtReader.player[i].getType().equals("Pitcher") && TxtReader.player[i].getOwner().equals(playerName))
						{
							
									
									playerPitchers[i][i] = TxtReader.player[i].getType2();
									playerPitchers[i+1][i] = TxtReader.player[i].getFirstName();
									playerPitchers[i+2][i] = TxtReader.player[i].getLastName();
									playerPitchers[i+3][i] = TxtReader.player[i].getRarity();
									playerPitchers[i+4][i] = TxtReader.player[i].getYearsPlayed();
									playerPitchers[i+5][i] = TxtReader.player[i].getGamesPlayed();
									playerPitchers[i+6][i] = TxtReader.player[i].getBattersFaced();
									playerPitchers[i+7][i] = TxtReader.player[i].getHitsAllowed();
									playerPitchers[i+8][i] = TxtReader.player[i].getWalks();
									playerPitchers[i+9][i] = TxtReader.player[i].getStrikeOut();
									playerPitchers[i+10][i] = TxtReader.player[i].getHitByPitch();
									playerPitchers[i+11][i] = TxtReader.player[i].getInningsPitched();
									
						}
				}
			
			
			
			for (int x = 12; x <= 20; x++)
				{
					if (TxtReader.player[x].getType().equals("Hitter") && TxtReader.player[x].getOwner().equals(playerName))
						{
							
									
									playerHitters[i-12][i] = TxtReader.player[i].getType2();
									playerHitters[i-11][i] = TxtReader.player[i].getFirstName();
									playerHitters[i-10][i] = TxtReader.player[i].getLastName();
									playerHitters[i-9][i] = TxtReader.player[i].getRarity();
									playerHitters[i-8][i] = TxtReader.player[i].getYearsPlayed();
									playerHitters[i-7][i] = TxtReader.player[i].getPlateAppearances();
									playerHitters[i-6][i] = TxtReader.player[i].getAtBats();
									playerHitters[][i] = TxtReader.player[i].getRunsBattedIn();
									playerHitters[][i] = TxtReader.player[i].getHits();
									playerHitters[][i] = TxtReader.player[i].getBaseOnBalls();
									playerHitters[][i] = TxtReader.player[i].getHomeRuns();
									
									
									
									
									//row-12
								
						}
				}
			}
			*/
			
			
			
		
		
		
		
//Player Stats				
		public static void displayPlayerStats()
			{
				
				displayPlayerMoney();
				displayPlayerTeam();
			}
		
		
		
		
		
//Player Money
		public static void displayPlayerMoney()
			{
			
				System.out.println();
				System.out.println(playerName + "'s current balance: $" + playerMoney);
				System.out.println();
			
			}
		
		

		
		
//Display FULL Team
		public static void displayPlayerTeam()
			{
				displayPitchers();
				displayHitters();
		
			}
		
//Print Pitchers	
		public static void displayPitchers()
		{
			
			System.out.println();
			System.out.println("Position" + "          Name" + "          Rarity" + "     YearsPlayed"
								+ "     GamesPlayed" + "     BattersFaced" + "     HitsAllowed" + "     Walks" 
								+ "     StrikeOuts" + "     HitByPitch" + "     InningsPitched");
			System.out.println();
			
			
			for (int i = 0; i <= 19; i++) 
				{
					if (team.get(i).getType().equals("Pitcher"))
						{

							String t2 = team.get(i).getType2();
							String fn = team.get(i).getFirstName();
							String ln = team.get(i).getLastName();
							String rare = team.get(i).getRarity();
							int yp = team.get(i).getYearsPlayed();
							int g = ((BBSPitchers) team.get(i)).getGamesPlayed();
							int bf = ((BBSPitchers) team.get(i)).getBattersFaced();
							int h = ((BBSPitchers) team.get(i)).getHitsAllowed();
							int w = ((BBSPitchers) team.get(i)).getWalks();
							int s = ((BBSPitchers) team.get(i)).getStrikeOut();
							int hbp = ((BBSPitchers) team.get(i)).getHitByPitch();
							double ip =  ((BBSPitchers) team.get(i)).getInningsPitched();
							
							
							System.out.println(t2 + "     " + fn + " " + ln + "     " + rare + "     " 
												+ yp + "     " + g + "     " + bf + "     " + h + "     " 
												+ w + "     " + s + "     " + hbp + "     " + ip);
						}
				}
		}
		
		
//Print Hitters		
		public static void displayHitters()
			{
				
				System.out.println();
				System.out.println("Position" + "          Name" + "          Rarity" + "     YearsPlayed"
						+ "     PlateAppearances" + "     AtBats" + "     Hits" + "     Walks" 
						+ "     HomeRuns" + "     RBIs");
				System.out.println();
				
				
				for (int i = 0; i <= 19; i++) 
					{
					
						if (team.get(i).getType().equals("Hitter"))
							{

								String t2 = team.get(i).getType2();
								String fn = team.get(i).getFirstName();
								String ln = team.get(i).getLastName();
								String rare = team.get(i).getRarity();
								int yp = team.get(i).getYearsPlayed();
								int pa = ((BBSHitters) team.get(i)).getPlateAppearances();
								int ab = ((BBSHitters) team.get(i)).getAtBats();
								int rbi = ((BBSHitters) team.get(i)).getRunsBattedIn();
								int h = ((BBSHitters) ATxtReader.player[i]).getHits();
								int bb = ((BBSHitters) team.get(i)).getBaseOnBalls();
								int hr = ((BBSHitters) team.get(i)).getHomeRuns();
								
								
								
								System.out.println("   " + t2 + "     " + fn + " " + ln + "     " + rare + "     " 
													+ yp + "     " + pa + "     " + ab + "     "
													+ h + "     " + bb + "     " + hr + "     " + rbi);
							}
					}
			}
		
		
	}
	














