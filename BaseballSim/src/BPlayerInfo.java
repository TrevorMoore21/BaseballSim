import java.util.ArrayList;
import java.util.Collection;

public class BPlayerInfo
	{

		static String playerName;
		static int playerMoney;
		static boolean stillPlaying = true;
		static ArrayList<BAllStarPlayer> team = new ArrayList<BAllStarPlayer>();
		
//		static String [][] playerPitchers = new String[12][14];
//		static String [][] playerHitters = new String[8][13];
		
		
		
		
		
//starts game with giving player all of the coal players to make a team
		public static void introFillTeam()
		{
			for (int i = 0; i <= 19; i++) 
				{
					if (ATxtReader.player[i].getRarity().equals("Coal"))
						{
							team.add(ATxtReader.player[i]);
						}
				}
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
				BDisplayTeams.displayPlayerTeam();
			}
		
		
		
		
		
//Player Money
		public static void displayPlayerMoney()
			{
			
				System.out.println();
				System.out.println(playerName + "'s current balance: $" + playerMoney);
				System.out.println();
			
			}
	}
	















