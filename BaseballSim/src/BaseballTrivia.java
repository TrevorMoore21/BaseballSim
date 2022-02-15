import java.util.Scanner;


public class BaseballTrivia
	{

		static int triviaMenuNum;
		static Scanner triviaMenuInput = new Scanner(System.in);
		static String menuNum;
		static Scanner menuInput = new Scanner(System.in);
		static String hardTA;
		static Scanner hardTriviaR = new Scanner(System.in);
		
		static boolean e1 = false;
		static boolean e2 = false;
		static boolean e3 = false;
		static boolean e4 = false;
		static boolean e5 = false;
		static boolean e6 = false;
		static boolean e7 = false;
		
		static boolean m1 = false;
		static boolean m2 = false;
		static boolean m3 = false;
		static boolean m4 = false;
		static boolean m5 = false;
		static boolean m6 = false;
		static boolean m7 = false;
		
		static boolean h1 = false;
		static boolean h2 = false;
		static boolean h3 = false;
		static boolean h4 = false;
		static boolean h5 = false;
		static boolean h6 = false;
		static boolean h7 = false;
		
		static boolean easyTriv = true;
		static boolean mediumTriv = true;
		static boolean hardTriv = true;
		
		
		
		
		
		
//Trivia Menu
		public static void triviaMenu()
		{
			
			System.out.println("\nVoodoo Jobu welcomes you to Empire Baseball's Trivia. "
								+ "\nWould you like to play on easy, medium, or hard?"
								+ "\n\n\t1) Easy"
								+ "\n\t2) Medium"
								+ "\n\t3) Hard"
								+ "\n\n(enter 99 at any time to return to menu)");
			System.out.println();
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
			else if(triviaMenuNum == 99)
				{
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
						if(e1 == false && randomPick == 1)
							{
								randomPick += 3;
								e1 = true;
								
								System.out.println();
								System.out.println("What pitch is explicitily outlawed in the MLB?"
										+ "\n\n\t1) Gyroball"
										+ "\n\t2) Curveball"
										+ "\n\t3) Riseball"
										+ "\n\t4) Spitball");
									menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("4"))
									{
										System.out.println("\nCorrect! You earned $265");
										PlayerInfo.playerMoney += 265;		
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The Spitball was outlawed in 1920 after one hit Ray Chapman in the head and killed him");
									}
							}
					
				
						if(e2 == false && randomPick == 2)
							{
								randomPick += 3;
								e2 = true;
								System.out.println();
								System.out.println("What does the MLB stand for?"
										+ "\n\n\t1) Master Leggy Baseballers"
										+ "\n\t2) Megga Legit Boners"
										+ "\n\t3) Major League Baseball"
										+ "\n\t4) Most Lucious Bites");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("3"))
									{
										System.out.println("\nCorrect! You earned $345");
										PlayerInfo.playerMoney += 345;	
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The MLB stands for Major League Baseball");
									}
							}
				
						
						if(e3 == false && randomPick == 3)
							{
						
								randomPick += 3;
								e3 = true;
								System.out.println();
								System.out.println("Where is the Baseball Hall of Fame located?"
										+ "\n\n\t1) New York, New York"
										+ "\n\t2) Cooperstown, New York"
										+ "\n\t3) Richmond, Virginia"
										+ "\n\t4) Philadelphia, Pennsylvania");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
							if (menuNum.equals("2"))
								{
									System.out.println("\nCorrect! You earned $375");
									PlayerInfo.playerMoney += 375;
								}
							else
								{
									System.out.println("\nIncorrect");
									System.out.println("The Baseball Hall of Fame is located in Cooperstown, New York");
								}
							}
						
						
						if(e4 == false && randomPick == 4)
							{
								
								randomPick += 3;
								e4 = true;
								System.out.println();
								System.out.println("What is the distance between the bases?"
										+ "\n\n\t1) 100 feet"
										+ "\n\t2)  90 feet"
										+ "\n\t3)  75 feet"
										+ "\n\t4)  30 feet");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("2"))
									{
										System.out.println("\nCorrect! You earned $210");
										PlayerInfo.playerMoney += 210;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The distance between the base path distance is 90 feet");
									}
							}
						
						
						if(e5 == false && randomPick == 5)
							{
								
								randomPick = 1;
								e5 = true;
								System.out.println();
								System.out.println("How much does a baseball weigh?"
										+ "\n\n\t1) 12 ounces"
										+ "\n\t2)  7 ounces"
										+ "\n\t3)  5 ounces"
										+ "\n\t4)  1 pound");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("3"))
									{
										System.out.println("\nCorrect! You earned $350");
										PlayerInfo.playerMoney += 350;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Baseballs weigh 5 ounces");
									}
							}
						
						
						if(e6 == false && randomPick == 6)
							{
								
								randomPick = 2;
								e6 = true;
								System.out.println();
								System.out.println("What is Derek Jeter's nickname?"
										+ "\n\n\t1) Mr. November"
										+ "\n\t2) Flaming Iron"
										+ "\n\t3) Brown Stain"
										+ "\n\t4) Platinum Bat");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("1"))
									{
										System.out.println("\nCorrect! You earned $335");
										PlayerInfo.playerMoney += 335;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Derek Jeter earned the nickname ''Mr. November'' after proving to be a clutch hitter deep in the playoffs");
									}
							}
						
						
						if(e7 == false && randomPick == 7)
							{
								
								randomPick = 3;
								e7 = true;
								System.out.println();
								System.out.println("How many inngings are in an MLB game?"
										+ "\n\n\t1) 12"
										+ "\n\t2) 9"
										+ "\n\t3) 7"
										+ "\n\t4) 6");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("2"))
									{
										System.out.println("\nCorrect! You earned $285");
										PlayerInfo.playerMoney += 285;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Every MLB game is 9 innings, unless extra innings are played to prevent the occurence of a tie");
									}
							}
						
						
						if (e1 == true && e2 == true && e3 == true && e4 == true && e5 == true && e6 == true && e7 == true)
							{
								
								e1 = false;
								e2 = false;
								e3 = false;
								e4 = false;
								e5 = false;
								e6 = false;
								e7 = false;
								
								easyTriv = false;
								
							}
					}
				while (easyTriv == true);
				
				easyTriv = true;
				
			}
		
		
		
		
		
		
		
//medium Trivia
		public static void mediumTrivia()
			{
				
				int randomPick = (int) (Math.random() * 7) + 1;
				
				
				do
					{
						if(m1 == false && randomPick == 1)
							{
								
								randomPick += 3;
								m1 = true;
								System.out.println();
								System.out.println("Who holds the record for the most single season home runs?"
										+ "\n\n\t1) Barry Bonds"
										+ "\n\t2) Mark Mcgwire"
										+ "\n\t3) Babe Ruth"
										+ "\n\t4) David Ortiz");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("1"))
									{
										System.out.println("\nCorrect! You earned $565");
										PlayerInfo.playerMoney += 565;		
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Barry Bonds holds this record with 73 home runs");
									}
							}
					
				
						if(m2 == false && randomPick == 2)
							{
						
								randomPick += 3;
								m2 = true;
								System.out.println();
								System.out.println("Who has thrown the hardest, verified pitch ever recorded in MLB history?"
										+ "\n\n\t1) John Cena"
										+ "\n\t2) Randy Johnson"
										+ "\n\t3) Aroldis Chapman"
										+ "\n\t4) Jacob DeGrom");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("3"))
									{
										System.out.println("Correct! You earned $615");
										PlayerInfo.playerMoney += 615;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Aroldis Chapman holds this record with 106 mph");
									}
							}
				
						
						if(m3 == false && randomPick == 3)
							{
						
								randomPick += 3;
								m3 = true;
								System.out.println();
								System.out.println("Who was the first player to throw a pitch over 100 mph?"
										+ "\n\n\t1) Randy Johnson"
										+ "\n\t2) Mike Mussina"
										+ "\n\t3) Mariano Rivera"
										+ "\n\t4) Nolan Ryan");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
							if (menuNum.equals("4"))
								{
									System.out.println("\nCorrect! You earned $415");
									PlayerInfo.playerMoney += 415;
								}
							else
								{
									System.out.println("\nIncorrect");
									System.out.println("Nolan Ryan was the first to record a pitch at or above 100 mph");
								}	
							}
						
						
						if(m4 == false && randomPick == 4)
							{
								
								randomPick += 3;
								m4 = true;
								System.out.println();
								System.out.println("What is the distance between home plate and the pitcher's rubber?"
										+ "\n\n\t1) 58 feet 6 inches"
										+ "\n\t2)  62 feet 6 inches"
										+ "\n\t3)  56 feet 6 inches"
										+ "\n\t4)  60 feet 6 inches");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("4"))
									{
										System.out.println("\nCorrect! You earned $400");
										PlayerInfo.playerMoney += 400;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The distance between home plate and the pitcher's rubber is 60 feet 6 inches");
									}
							}
						
						
						if(m5 == false && randomPick == 5)
							{
								
								randomPick = 1;
								m5 = true;
								System.out.println();
								System.out.println("How many laces are on a baseball?"
										+ "\n\n\t1) 108"
										+ "\n\t2)  96"
										+ "\n\t3)  148"
										+ "\n\t4)  124");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("1"))
									{
										System.out.println("\nCorrect! You earned $645");
										PlayerInfo.playerMoney += 645;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Baseballs have 108 laces");
									}
							}
	
						
						if(m6 == false && randomPick == 6)
							{
								
								randomPick = 2;
								m6 = true;
								System.out.println();
								System.out.println("The Brooklyn ''Dodgers'' nickname originally refered to dodging ________?"
										+ "\n\n\t1) City Buses"
										+ "\n\t2) Fat People"
										+ "\n\t3) City traffic"
										+ "\n\t4) Trolleys");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("4"))
									{
										System.out.println("\nCorrect! You earned $555");
										PlayerInfo.playerMoney += 555;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The ''Dodgers'' received their nickname after dodging trolleys");
									}
							}
						
						
						if(m7 == false && randomPick == 7)
							{
								
								randomPick = 3;
								m7 = true;
								System.out.println();
								System.out.println("Who holds the record for most hits in a single season?"
										+ "\n\n\t1) Ichiro Suzuki"
										+ "\n\t2) Tony Gwynn"
										+ "\n\t3) Derek Jeter"
										+ "\n\t4) Pete Rose");
								menuNum = menuInput.nextLine();
						
								if(menuNum.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (menuNum.equals("1"))
									{
										System.out.println("\nCorrect! You earned $485");
										PlayerInfo.playerMoney += 485;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Ichiro Suzuki holds this record with 262 hits");
									}
							}
						
						
						if (m1 == true && m2 == true && m3 == true && m4 == true && m5 == true && m6 == true && m7 == true)
							{
								
								m1 = false;
								m2 = false;
								m3 = false;
								m4 = false;
								m5 = false;
								m6 = false;
								m7 = false;
								
								mediumTriv = false;
								
							}
					}
				while (mediumTriv == true);
				
				mediumTriv = true;
			}
		
		
		
		
		
		
		
//hard Trivia	
		public static void hardTrivia()
			{
				int randomPick = (int) (Math.random() * 7) + 1;
				
				
				do
					{
						
						if(h1 == false && randomPick == 1)
							{
								
								randomPick += 3;
								h1 = true;
								System.out.println();
								System.out.println("Name one of the first five members inducted into the baseball Hall of Fame"
										+ "\n(first and last name)");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
								
								if (hardTA.equals("Babe Ruth") || hardTA.equals("babe ruth") || hardTA.equals("BABE RUTH") || hardTA.equals("Babe ruth"))
									{
										
										System.out.println("\nCorrect! You earned $1050");
										PlayerInfo.playerMoney += 1050;
									}
								else if (hardTA.equals("Ty Cobbs") || hardTA.equals("ty cobbs") || hardTA.equals("TY COBBS") 
										|| hardTA.equals("Ty Cobb") || hardTA.equals("ty cobb") || hardTA.equals("Ty cobbs") || hardTA.equals("Ty cobb"))
									{
										
										System.out.println("\nCorrect! You earned $1050");
										PlayerInfo.playerMoney += 1050;
									}
								else if (hardTA.equals("Honus Wagner") || hardTA.equals("honus wagner") || hardTA.equals("HONUS WAGNER") || hardTA.equals("Honus wagner"))
									{
										
										System.out.println("\nCorrect! You earned $1050");
										PlayerInfo.playerMoney += 1050;
									}
								else if (hardTA.equals("Walter Johnson") || hardTA.equals("walter johnson") || hardTA.equals("WALTER JOHNSON") || hardTA.equals("Walter johnson"))
									{
										
										System.out.println("\nCorrect! You earned $1050");
										PlayerInfo.playerMoney += 1050;
									}
								else if (hardTA.equals("Christy Mathewson") || hardTA.equals("christy mathewson") || hardTA.equals("CHRISTY MATHEWSON") || hardTA.equals("Christy mathewson"))
									{
										
										System.out.println("\nCorrect! You earned $1050");
										PlayerInfo.playerMoney += 1050;
									}
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								else
									{
										
										System.out.println("\nIncorrect, you lost $200");
										System.out.println("The five inducties are: Babe Ruth, Ty Cobbs, Honus Wagner, Walter Johnson, and Christy Mathewson");
										PlayerInfo.playerMoney -= 200;
									}
							}
					
	
				
						if(h2 == false && randomPick == 2)
							{
						
								randomPick += 3;
								h2 = true;
								System.out.println();
								System.out.println("What team did Babe Ruth hit his first career MLB home run against?");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
								
								if (hardTA.equals("New York Yankees") || hardTA.equals("new york yankees") || hardTA.equals("NEW YORK YANKEES") || hardTA.equals("New York yankees")
										|| hardTA.equals("Yankees") || hardTA.equals("yankees") || hardTA.equals("YANKEES"))
									{
										
										System.out.println("\nCorrect! You earned $925");
										PlayerInfo.playerMoney += 925;
									}
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								else
									{
										System.out.println("\nIncorrect, you lost $250");
										System.out.println("Babe Ruth's first career MLB homerun was against the New York Yankees on May 6, 1915");
										PlayerInfo.playerMoney -= 250;
									}
							}
				
						
						if(h3 == false && randomPick == 3)
							{
						
								randomPick += 3;
								h3 = true;
								System.out.println();
								System.out.println("What famous Atlanta Braves manager was ejected from a record 162 MLB games?");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
								
								if (hardTA.equals("Bobby Cox") || hardTA.equals("bobby cox") || hardTA.equals("Bobby Cox") || hardTA.equals("Bobby cox"))
									{
										
										System.out.println("\nCorrect! You earned $1090");
										PlayerInfo.playerMoney += 1090;
									}
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								else
									{
										System.out.println("\nIncorrect, you lost $100");
										System.out.println("Legendary manager Bobby Cox holds the record for most MLB ejections");
										PlayerInfo.playerMoney -= 100;
									}
							}
						
						
						if(h4 == false && randomPick == 4)
							{
								
								randomPick += 3;
								h4 = true;
								System.out.println();
								System.out.println("Who was the first Major League player to have his number retired?");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
								
								if (hardTA.equals("Lou Gehrig") || hardTA.equals("lou gehrig") || hardTA.equals("LOU GEHRIG") || hardTA.equals("Lou gehrig"))
									{
										
										System.out.println("\nCorrect! You earned $915");
										PlayerInfo.playerMoney += 915;
									}
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								else
									{
										System.out.println("\nIncorrect, you lost $125");
										System.out.println("Legendary player Lou Gehrig had his number retired on July 4, 1939");
										PlayerInfo.playerMoney -= 125;
									}
							}

						
						if(h5 == false && randomPick == 5)
							{
								
								randomPick = 1;
								h5 = true;
								System.out.println();
								System.out.println("Which MLB pitcher threw a no-hitter without a right hand?");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
										
								if (hardTA.equals("Jim Abbot") || hardTA.equals("jim abbot") || hardTA.equals("JIM ABBOT") || hardTA.equals("Jim abbot"))
									{
												
										System.out.println("\nCorrect! You earned $845");
										PlayerInfo.playerMoney += 845;
									}
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Jim Abbot threw a no-hitter and completed a successful 10 year career without a right hand");
									}
							}
	
						
						if(h6 == false && randomPick == 6)
							{
								
								randomPick = 2;
								h6 = true;
								System.out.println();
								System.out.println("What is the lowest recorded attendance for an MLB game?");
								System.out.println("(answer in number of people)");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
								
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								if (hardTA.equals("0"))
									{
												
										System.out.println("\nCorrect! You earned $805");
										PlayerInfo.playerMoney += 805;
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("The lowest turnout for an MLB game was 0 people in 2015 at Oriole Park");
									}
							}
						
					
						if(h7 == false && randomPick == 7)
							{
								
								randomPick = 3;
								h7 = true;
								System.out.println();
								System.out.println("What female pitcher struct out both Lou Gehrig and Babe Ruth?");
								System.out.println();
								hardTA = hardTriviaR.nextLine();
								
								if (hardTA.equals("Jackie Mitchell") || hardTA.equals("jackie mitchell") || hardTA.equals("JACKIE MITCHELL") || hardTA.equals("Jackie mitchell"))
									{
												
										System.out.println("\nCorrect! You earned $1500");
										PlayerInfo.playerMoney += 1500;
									}
								if(hardTA.equals("99"))
									{
										PlayGame.simMenu();
									}
								else
									{
										System.out.println("\nIncorrect");
										System.out.println("Jackie Mitchell is the talented woman who struck out these two legends");
									}
							}
						
						
						if (h1 == true && h2 == true && h3 == true && h4 == true && h5 == true && h6 == true && h7 == true)
							{
								
								h1 = false;
								h2 = false;
								h3 = false;
								h4 = false;
								h5 = false;
								h6 = false;
								h7 = false;
								
								hardTriv = false;
								
							}
					}
				while (hardTriv == true);
				
				hardTriv = true;
				
			}
		
	}
