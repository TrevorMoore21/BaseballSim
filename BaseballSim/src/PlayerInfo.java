import java.util.ArrayList;
import java.util.Collection;

public class PlayerInfo
	{

		static String playerName;
		static int playerMoney;
		static boolean stillPlaying = true;
		static ArrayList<String> team = new ArrayList<String>();
		
		
		//Player Stats				
		public static void displayPlayerStats()
			{
				System.out.println();
				System.out.println(playerName + "'s current balance: $" + playerMoney);

				for (int i = 0; i < 20; i++)
					{
						team.addAll((Collection<? extends String>) TxtReader.player[i]);
						
						
			/*			if(inventoryCounter == 0)
							{
								System.out.println("You do not own any properties");
								inventoryCounter = 0;
								
							}
						else if (inventoryCounter == 1)
							{
								System.out.print("You own: ");
								System.out.print(ownedSpaces);
							}
						else if (inventoryCounter >= 2)
							{
								System.out.print(", ");
								System.out.print(ownedSpaces);
							}
							
							
					}
				
				
				
				
				inventoryCounter = 0;
				System.out.println();
				System.out.println();
				
				if(turnCounter1 == 1)
					{
						turnCounter1 = 0;
						
					}
					
			*/ 
						System.out.println(team); 
			}
		
		
	}
	}
