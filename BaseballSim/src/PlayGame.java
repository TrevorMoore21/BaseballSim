import java.util.Scanner;



public class PlayGame
	{

		static int menuNum;
		static Scanner simMenuInput = new Scanner(System.in);
		
		
//Main menu
		public static void simMenu()
			{
				System.out.println();
				System.out.println(GreetSimPlayer.playerName + ", would you like to..."
						+ "\n\n\t1) Play a round of Trivia"
						+ "\n\t2) Play a Simulated Game"
						+ "\n\t3) Review Rules");
				menuNum = simMenuInput.nextInt();
				
				
				if(menuNum == 1)
					{
						
						BaseballTrivia.triviaMenu();
					}
				else if(menuNum == 2)
					{
						
						//print out players and such
						
						System.out.println("Wassup Fart-Catcher, welcome to Monopoly");
					}
				else if(menuNum == 3)
					{
						GreetSimPlayer.displayRule();
						System.out.println();
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
