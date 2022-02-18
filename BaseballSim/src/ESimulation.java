import java.util.Scanner;

public class ESimulation
	{

		static String playerTeam;
		static int menuNum2;
		static Scanner simIntroInput = new Scanner(System.in);
		static Scanner simMenuInput2 = new Scanner(System.in);

		
		public static void simIntro()
		{
			System.out.println("\n\nWould you like to view your team before you play?");
			playerTeam = simIntroInput.nextLine();
			
			if (playerTeam.equals("yes") || playerTeam.equals("Yes") || playerTeam.equals("YES"))
				{
					BPlayerInfo.displayPlayerStats();
					simTeams();
				}
			else if (playerTeam.equals("no") || playerTeam.equals("No") || playerTeam.equals("NO"))
				{
					simTeams();
				}
			else
				{
					System.out.println("\nSorry, Voodoo Jobu didn't catch that, try again");
					simIntro();
				}
		}
		
//Pick team to play
		public static void simTeams()
			{
				
				System.out.println();
				System.out.println(BPlayerInfo.playerName + ", would you like play aginst the..."
						+ "\n\n\t1) Rubberducks   (easy)"
						+ "\n\t2) YardGoats     (easy)"
						+ "\n\t3) Biscuits      (medium)"
						+ "\n\t4) Pinkertons    (medium)"
						+ "\n\t5) El Farts      (hard)"
						+ "\n\t6) Chicharrones  (hard)"
						+ "\n\t7) Legends       (extreme)");
				menuNum2 = simMenuInput2.nextInt();
		
				if(menuNum2 == 1)
					{
						
						
						Manually add players to teams by .getPlayerN?
						
						
					}
				if(menuNum2 == 2)
					{
						
					}
				if(menuNum2 == 3)
					{
						
					}
				if(menuNum2 == 4)
					{
						
					}
				if(menuNum2 == 5)
					{
						
					}
				if(menuNum2 == 6)
					{
						
					}
				if(menuNum2 == 7)
					{
						
					}
				
			}
	}
