import java.util.ArrayList;
import java.util.Collection;

public class PlayerInfo
	{

		static String playerName;
		static int playerMoney;
		static boolean stillPlaying = true;
		//static ArrayList<String> team = new ArrayList<String>();
		static ArrayList<AllStarPlayer> team = new ArrayList<AllStarPlayer>();
		
//		static String [][] playerPitchers = new String[12][14];
//		static String [][] playerHitters = new String[8][13];
		
		
		
		
		
//starts game with giving player all of the coal players to make a team
		public static void setCoalOwner()
		{
			for (int i = 0; i <= 20; i++) 
				{
					if (TxtReader.player[i].getRarity().equals("Coal"))
						{
							team.add(TxtReader.player[i]);
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
				
				displayPlayerStats();
				displayPlayerTeam();
			}
		
		
		public static void displayPlayerMoney()
			{
			
				System.out.println();
				System.out.println(playerName + "'s current balance: $" + playerMoney);
				System.out.println();
			
			}
		
		
		
		public static void displayPlayerTeam()
			{
				displayPitchers();
				displayHitters();
		
			}
		
		
		public static void displayPitchers()
		{
			for (int i = 0; i <= 20; i++) 
				{
					if (team.get(i).getType().equals("Pitcher"))
						{

							String t2 = team.get(i).getType2();
							String fn = team.get(i).getFirstName();
							String ln = team.get(i).getLastName();
							String rare = team.get(i).getRarity();
							int yp = team.get(i).getYearsPlayed();
							int g = ((BSPitchers) team.get(i)).getGamesPlayed();
							int bf = ((BSPitchers) team.get(i)).getBattersFaced();
							int h = ((BSPitchers) team.get(i)).getHitsAllowed();
							int w = ((BSPitchers) team.get(i)).getWalks();
							int s = ((BSPitchers) team.get(i)).getStrikeOut();
							int hbp = ((BSPitchers) team.get(i)).getHitByPitch();
							double ip =  ((BSPitchers) team.get(i)).getInningsPitched();
							
							
							System.out.println("Position" + "\tFirst Name" +"\tLast Name" + "\tRarity" + "\tYears Played"
									+ "\tGames Played" + "\tBattersFaced" + "\tHits Allowed" + "\tWalks" + "\tStrike Outs"
											+ "\tHit by Pitch" + "\tInnings Pitched");
							System.out.println();
							System.out.println(t2 + "\t" + fn + " " + ln + "\t" + rare + "\t" + yp + "\t" + g + "\t" + bf + "\t"
									+ h + "\t" + w + "\t" + s + "\t" + hbp + "\t" + ip);
							
						}
				}
		}
		
		public static void displayHitters()
			{
				for (int i = 0; i <= 20; i++) 
					{
					
						if (team.get(i).getType().equals("Hitter"))
							{

								String t2 = team.get(i).getType2();
								String fn = team.get(i).getFirstName();
								String ln = team.get(i).getLastName();
								String rare = team.get(i).getRarity();
								int yp = team.get(i).getYearsPlayed();
								
								
								fix these fool
								
								int pa = team.get(i).getYearsPlayed();
								int ab = team.get(i).getYearsPlayed();
								int rbi = team.get(i).getYearsPlayed();
								int bb = team.get(i).getYearsPlayed();
								int hr = team.get(i).getYearsPlayed();
								
								THESE SYSOs dont work fool
								System.out.println("Position" + "\tFirst Name" +"\tLast Name" + "\tRarity" + "\tYears Played"
										+ "\tGames Played" + "\tBattersFaced" + "\tHits Allowed" + "\tWalks" + "\tStrike Outs"
												+ "\tHit by Pitch" + "\tInnings Pitched");
								System.out.println();
								System.out.println(t2 + "\t" + fn + " " + ln + "\t" + rare + "\t" + yp + "\t" + g + "\t" + bf + "\t"
										+ h + "\t" + w + "\t" + s + "\t" + hbp + "\t" + ip);
								
								
								
								
							
							}
					}
			}
		
		
	}
	
