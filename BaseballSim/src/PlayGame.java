import java.util.Scanner;



public class PlayGame
	{

		static String menuNum;
		static Scanner simMenuInput = new Scanner(System.in);
		
		
//Main menu
		public static void simMenu()
			{
				System.out.println();
				System.out.println(PlayerInfo.playerName + ", would you like to..."
						+ "\n\n\t1) Play a round of Trivia"
						+ "\n\t2) Play a Simulated Game"
						+ "\n\t3) Review Rules");
				menuNum = simMenuInput.nextLine();
				
				
				if(menuNum.equals("1"))
					{
						
						BaseballTrivia.triviaMenu();
					}
				else if(menuNum.equals("2"))
					{
						
						Simulation.simIntro();
					}
				else if(menuNum.equals("3"))
					{
						GreetSimPlayer.displayRule();
						System.out.println();
						System.out.println();
						simMenu();
					}
				else if(menuNum.equals("99"))
					{
						System.out.println();
						simMenu();
					}
				else
					{
						System.out.println();
						System.out.println("Sorry, Voodoo Jobu didn't catch that, try again");
						simMenu();
					}
			}
		
		
		
	}
