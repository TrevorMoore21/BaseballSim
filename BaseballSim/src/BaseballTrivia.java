import java.util.Scanner;

public class BaseballTrivia
	{

		static int triviaMenuNum;
		static Scanner triviaMenuInput = new Scanner(System.in);
		
		public static void triviaMenu()
		{
			
			System.out.println("Voodoo Jobu welcomes you to Empire Baseball's Trivia. "
								+ "\nWould you like to play easy, medium, or hard?"
								+ "\n\t1) Easy"
								+ "\n\t2) Medium"
								+ "\n\t3) Hard");
			
			triviaMenuNum = triviaMenuInput.nextInt();
			
			if(triviaMenuNum == 1)
				{
					
					easyTrivia();
					
				}
			else if(triviaMenuNum == 2)
				{
					
					mediumTrivia();
					
				}
			else if(triviaMenuNum == 3)
				{
					
					hardTrivia();
					
				}
			else
				{
					System.out.println();
					System.out.println("Sorry, Voodoo Jobu didn't catch that, try again");
					triviaMenu();
				}
		}
			
		
		
		public static void easyTrivia()
			{
			
			/////ADD HERE
			
			}
		
		
		public static void mediumTrivia()
			{
				
			/////ADD HERE
				
			}
		
		
		public static void hardTrivia()
			{
				
			//////ADD HERE
				
			}
		
	}
