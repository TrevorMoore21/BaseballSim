import java.util.Scanner;

public class PlayGame
	{

		static int menuNum;
		static Scanner simMenuInput = new Scanner(System.in);
		
		
//Main menu
		public static void simMenu()
			{
				
				System.out.println(GreetSimPlayer.playerName + ", would you like to..."
						+ "\n\n\t1) Trivia"
						+ "\n\t2) Play Simulated Game"
						+ "\n\t3) Review Rules");
				menuNum = simMenuInput.nextInt();
				
				
				if(menuNum == 1)
					{
						System.out.println("Hi, welcome to Monopoly");
					}
				else if(menuNum == 2)
					{
						System.out.println("Wassup Fart-Catcher, welcome to Monopoly");
					}
				else
					{
						System.out.println("Welcome to Monopoly fool");
					}
			}
		
		
		
	}
