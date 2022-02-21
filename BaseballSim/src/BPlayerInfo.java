import java.util.ArrayList;
import java.util.Collection;

public class BPlayerInfo
	{

		static String playerName;
		static int playerMoney;
		static boolean stillPlaying = true;
		static ArrayList<BAllStarPlayer> team = new ArrayList<BAllStarPlayer>();
		
		
		
		
		
		
//starts game with giving player all of the coal players to make a team
		public static void introFillPlayerTeam()
		{
			for (int i = 0; i <= 19; i++) 
				{
					if (ATxtReader.player[i].getRarity().equals("Coal"))
						{
							team.add(ATxtReader.player[i]);
						}
				}
		}
		

		
		
		
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