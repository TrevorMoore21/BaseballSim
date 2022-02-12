import java.util.Scanner;

public class GreetSimPlayer
	{

		
		static Scanner simVersionInput = new Scanner(System.in);
		static String playONaw;
		static Scanner playInput = new Scanner(System.in);
		
		
//Baseball Sim Intro Greeting
		public static void simIntro()
			{

				System.out.println("Hi, welcome to Empire Baseball. "
											+ "My name is Voodoo Jobu, and I am your host.");
				
				System.out.println("What is your name?");
				PlayerInfo.playerName = simVersionInput.nextLine();
				
				System.out.println();
				System.out.println("Welcome, " + PlayerInfo.playerName + "!");
			}
		
		
		
//Baseball Sim rule display		
		public static void displayRule()
		{
			System.out.println("\n\n\tEmpire Baseball's only rule is simple --> make money (either by answering Trivia questions or playing Simulated Games)");
			System.out.println();
			System.out.println("\t      hint (in the beginning, you will make more money answering Trivia questions than playing Simulated Games"
								+ "\n\t\t      ...until you either buy better players, upgrade your fanbase, or upgrade stadiums)");
		}
		
		
		
//Would You like to play
		public static void playOrNaw()
		{
			System.out.println("\n\n\t\t\t\t\t\t Would you like to begin?");
			playONaw = playInput.nextLine();
			
			if (playONaw.equals("yes") || playONaw.equals("Yes") || playONaw.equals("YES"))
				{
					PlayGame.simMenu();
				}
			else if (playONaw.equals("no") || playONaw.equals("No") || playONaw.equals("NO"))
				{
					System.out.println("\n\nGo away then, tf");
				}
			else
				{
					System.out.println("\nSorry, Voodoo Jobu didn't catch that, try again");
					playOrNaw();
				}
			
			
		}
		
		
		
	}
