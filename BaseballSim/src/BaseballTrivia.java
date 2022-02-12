import java.util.Scanner;

public class BaseballTrivia
	{

		static int triviaMenuNum;
		static Scanner triviaMenuInput = new Scanner(System.in);
		static int menuNum;
		static Scanner menuInput = new Scanner(System.in);
		static boolean c1 = false;
		static boolean c2 = false;
		static boolean c3 = false;
		static boolean c4 = false;
		static boolean c5 = false;
		static boolean c6 = false;
		static boolean c7 = false;
		
		
		
		
		
		
		
		
//Trivia Menu
		public static void triviaMenu()
		{
			
			System.out.println("\nVoodoo Jobu welcomes you to Empire Baseball's Trivia. "
								+ "\nWould you like to play on easy, medium, or hard?"
								+ "\n\n\t1) Easy"
								+ "\n\t2) Medium"
								+ "\n\t3) Hard");
			
			triviaMenuNum = triviaMenuInput.nextInt();
			
//Run Easy Trivia
			if(triviaMenuNum == 1)
				{
					
					easyTrivia();
					PlayGame.simMenu();
				}

//Run Medium Trivia	
			else if(triviaMenuNum == 2)
				{
					
					mediumTrivia();
					PlayGame.simMenu();
				}
			
//Run Hard Trivia
			else if(triviaMenuNum == 3)
				{
					
					hardTrivia();
					PlayGame.simMenu();
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
				
				int randomPick = (int) (Math.random() * 7) + 1;
				
				
				do
					{
						if(c1 == false && randomPick == 1)
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
										System.out.println("\nCorrect! You earned $150");
										PlayerInfo.playerMoney += 150;		
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The Spitball was outlawed in 1920 after one hit Ray Chapman in the head and killed him");
									}
								randomPick += 3;
								c1 = true;
							}
					
				
						if(c2 == false && randomPick == 2)
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
										System.out.println("\nCorrect! You earned $145");
										PlayerInfo.playerMoney += 145;	
									}
								else
									{
										System.out.println("\nIncorrect, MLB stands for Major League Baseball");
									}
								randomPick += 3;
								c2 = true;
							}
				
						
						if(c3 == false && randomPick == 3)
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
									System.out.println("\nCorrect! You earned $175");
									PlayerInfo.playerMoney += 175;
								}
							else
								{
									System.out.println("\nIncorrect, the Baseball Hall of Fame is located in Cooperstown, New York");
								}
							randomPick += 3;
							c3 = true;
							}
						
						
						if(c4 == false && randomPick == 4)
							{
								System.out.println();
								System.out.println("What is the distance between the bases?"
										+ "\n\n\t1) 100 feet"
										+ "\n\t2)  90 feet"
										+ "\n\t3)  75 feet"
										+ "\n\t4)  30 feet");
									menuNum = menuInput.nextInt();
						
								if (menuNum == 2)
									{
										System.out.println("\nCorrect! You earned $110");
										PlayerInfo.playerMoney += 110;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The distance between the base path distance is 90 feet");
									}
								randomPick += 3;
								c4 = true;
							}
						
						
						if(c5 == false && randomPick == 5)
							{
								System.out.println();
								System.out.println("How much does a baseball weigh?"
										+ "\n\n\t1) 12 ounces"
										+ "\n\t2)  7 ounces"
										+ "\n\t3   5 ounces"
										+ "\n\t4)  1 pound");
									menuNum = menuInput.nextInt();
						
								if (menuNum == 3)
									{
										System.out.println("\nCorrect! You earned $160");
										PlayerInfo.playerMoney += 160;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Baseballs weigh 5 ounces");
									}
								randomPick = 1;
								c5 = true;
							}
						
						
						if(c6 == false && randomPick == 6)
							{
								System.out.println();
								System.out.println("What is Derek Jeter's nickname?"
										+ "\n\n\t1) Mr. November"
										+ "\n\t2) Flaming Iron"
										+ "\n\t3) Brown Stain"
										+ "\n\t4) Platinum Bat");
									menuNum = menuInput.nextInt();
						
								if (menuNum == 1)
									{
										System.out.println("\nCorrect! You earned $210");
										PlayerInfo.playerMoney += 210;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Derek Jeter earned the nickname Mr. November after proving to be a clutch hitter deep in the playoffs");
									}
								randomPick = 2;
								c6 = true;
							}
						
						
						if(c7 == false && randomPick == 7)
							{
								System.out.println();
								System.out.println("How many inngings are in an MLB game?"
										+ "\n\n\t1) 12"
										+ "\n\t2) 9"
										+ "\n\t3) 7"
										+ "\n\t4) 6");
									menuNum = menuInput.nextInt();
						
								if (menuNum == 2)
									{
										System.out.println("\nCorrect! You earned $115");
										PlayerInfo.playerMoney += 115;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Every MLB game is 9 innings, unless extra innings are played to prevent the occurence of a tie");
									}
								randomPick = 3;
								c7 = true;
							}
					}
				while (c1 == false || c2 || false || c3 == false || c4 == false || c5 == false || c6 == false || c7 == false);
				
				c1 = false;
				c2 = false;
				c3 = false;
				c4 = false;
				c5 = false;
				c6 = false;
				c7 = false;
			}
		
		
		
		
		
		
		
//medium Trivia
		public static void mediumTrivia()
			{
				
				int randomPick = (int) (Math.random() * 3) + 1;
				
				
				if(randomPick == 1)
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
				
				if(randomPick == 2)
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
				
				if(randomPick == 3)
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
				
				int randomPick = (int) (Math.random() * 3) + 1;
				
				
				if(randomPick == 1)
					{
						
					}
				
				if(randomPick == 2)
					{
						
					}
				
				if(randomPick == 3)
					{
						
					}
				
			}
		
	}
