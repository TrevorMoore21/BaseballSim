import java.util.Scanner;

public class BaseballTrivia
	{

		static int triviaMenuNum;
		static Scanner triviaMenuInput = new Scanner(System.in);
		static int menuNum;
		static Scanner menuInput = new Scanner(System.in);
		
		public static void triviaMenu()
		{
			
			System.out.println("\nVoodoo Jobu welcomes you to Empire Baseball's Trivia. "
								+ "\nWould you like to play on easy, medium, or hard?"
								+ "\n\n\t1) Easy"
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
			
		
//easy Trivia
		public static void easyTrivia()
			{
			
				//
				
				int introNumber = (int) (Math.random() * 3) + 1;
				
				
				for(int i = 0; i <= 1; i++)
					{
						if(HEREREERERERERERERERERER)
							{
						System.out.println();
						System.out.println("What pitch is explicitily outlawed in the MLB?"
								+ "\n\n\t1) Gyroball"
								+ "\n\t2) Curveball"
								+ "\n\t3) Riseball"
								+ "\n\t4) Spitball");
						menuNum = menuInput.nextInt();
						
							if (menuNum == 4)
								{
									System.out.println("Correct! You earned $150");
									PlayerInfo.playerMoney += 150;
								}
							else
								{
									System.out.println("Incorrect");
									System.out.println("The Spitball was outlawed in 1920 after one hit Ray Chapman in the head and killed him");
								}
							}
					}
				
				if(introNumber == 2)
					{
						
						System.out.println();
						System.out.println("What does the MLB stand for?"
								+ "\n\n\t1) Master Leggy Baseballers"
								+ "\n\t2) Megga Legit Boners"
								+ "\n\t3) Major League Baseball"
								+ "\n\t4) Most Lucious Bites");
						menuNum = menuInput.nextInt();
						
							if (menuNum == 3)
								{
									System.out.println("Correct! You earned $145");
									PlayerInfo.playerMoney += 145;
								}
							else
								{
									System.out.println("Incorrect, MLB stands for Major League Baseball");
								}
					}
				
				if(introNumber == 3)
					{
						
						System.out.println();
						System.out.println("Where is the Baseball Hall of Fame located?"
								+ "\n\n\t1) New York, New York"
								+ "\n\t2) Cooperstown, New York"
								+ "\n\t3) Richmond, Virginia"
								+ "\n\t4) Philadelphia, Pennsylvania");
						menuNum = menuInput.nextInt();
						
							if (menuNum == 2)
								{
									System.out.println("Correct! You earned $175");
									PlayerInfo.playerMoney += 175;
								}
							else
								{
									System.out.println("Incorrect, the Baseball Hall of Fame is located in Cooperstown, New York");
								}
					}
			
			}
		
//medium Trivia
		public static void mediumTrivia()
			{
				
				int introNumber = (int) (Math.random() * 3) + 1;
				
				
				if(introNumber == 1)
					{
						System.out.println();
						System.out.println("Who holds the record for the most single season home runs?"
								+ "\n\n\t1) Barry Bonds"
								+ "\n\t2) Mark Mcgwire"
								+ "\n\t3) Babe Ruth"
								+ "\n\t4) David Ortiz");
						menuNum = menuInput.nextInt();
						
							if (menuNum == 1)
								{
									System.out.println("Correct! You earned $325");
									PlayerInfo.playerMoney += 325;
								}
							else
								{
									System.out.println("Incorrect, Barry Bonds holds this record");
									
								}
					}
				
				if(introNumber == 2)
					{
						System.out.println();
						System.out.println("Who has thrown the hardest, verified pitch ever recorded in MLB history?"
								+ "\n\n\t1) John Cena"
								+ "\n\t2) Randy Johnson"
								+ "\n\t3) Aroldis Chapman"
								+ "\n\t4) Jacob DeGrom");
						menuNum = menuInput.nextInt();
						
							if (menuNum == 3)
								{
									System.out.println("Correct! Aroldis Chapman's fastest pitch was 106 mph");
									System.out.println("You earned $415");
									PlayerInfo.playerMoney += 415;
								}
							else
								{
									System.out.println("Incorrect, Aroldis Chapman holds this record with 106 mph");
								}
					}
				
				if(introNumber == 3)
					{
						System.out.println();
						System.out.println("Who was the first player to throw a pitch over 100 mph?"
								+ "\n\n\t1) Randy Johnson"
								+ "\n\t2) Mike Mussina"
								+ "\n\t3) Mariano Rivera"
								+ "\n\t4) Nolan Ryan");
						menuNum = menuInput.nextInt();
						
							if (menuNum == 4)
								{
									System.out.println("Correct! You earned $370");
									PlayerInfo.playerMoney += 370;
								}
							else
								{
									System.out.println("Incorrect, Nolan Ryan was the first to record a pitch at or above 100 mph");
								}
					}
				
			}
		
//hard Trivia	
		public static void hardTrivia()
			{
				
				int introNumber = (int) (Math.random() * 3) + 1;
				
				
				if(introNumber == 1)
					{
						
					}
				
				if(introNumber == 2)
					{
						
					}
				
				if(introNumber == 3)
					{
						
					}
				
			}
		
	}
