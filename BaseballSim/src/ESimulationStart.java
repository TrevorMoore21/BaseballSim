import java.util.Scanner;





public class ESimulationStart
	{

		static String playerTeam;
		static int menuNum2;
		static Scanner simIntroInput = new Scanner(System.in);
		static Scanner simMenuInput2 = new Scanner(System.in);
		static String input3;
		static Scanner simMenuInput3 = new Scanner(System.in);
		

		
		
		
//View your team before Sim		
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
				System.out.println();
				System.out.println();
				System.out.println(BPlayerInfo.playerName + ", would you like play aginst the..."
						+ "\n\n\t1) RubberDucks   (easy)"
						+ "\n\t2) YardGoats     (easy)"
						+ "\n\t3) Biscuits      (medium)"
						+ "\n\t4) Pinkertons    (medium)"
						+ "\n\t5) El Farts      (hard)"
						+ "\n\t6) Chicharrones  (hard)"
						+ "\n\t7) Legends       (extreme)");
				menuNum2 = simMenuInput2.nextInt();
		
				if(menuNum2 == 1)
					{
						System.out.println();
						System.out.println("Here are the RubberDucks");
						BDisplayTeams.displayRubberTeam();
						
						quickPlayOption();
					}
				if(menuNum2 == 2)
					{
						System.out.println();
						System.out.println("Here are the YardGoats");
						BDisplayTeams.displayYardTeam();
						
						quickPlayOption();
					}
				if(menuNum2 == 3)
					{
						System.out.println();
						System.out.println("Here are the Biscuits");
						BDisplayTeams.displayBiscuitsTeam();
						
						quickPlayOption();
					}
				if(menuNum2 == 4)
					{
						System.out.println();
						System.out.println("Here are the Pinkertons");
						BDisplayTeams.displayPinkertonsTeam();
						
						quickPlayOption();
					}
				if(menuNum2 == 5)
					{
						System.out.println();
						System.out.println("Here are El Farts");
						BDisplayTeams.displayElFartsTeam();
						
						quickPlayOption();
					}
				if(menuNum2 == 6)
					{
						System.out.println();
						System.out.println("Here are the Chicharrones");
						BDisplayTeams.displayChicharronesTeam();
						
						quickPlayOption();
					}
				if(menuNum2 == 7)
					{
						System.out.println();
						System.out.println("Here are the Legends");
						BDisplayTeams.displayLegendsTeam();
						
						quickPlayOption();
					}
				
			}	
		
		
//by inning or full game
		public static void quickPlayOption()
			{
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(BPlayerInfo.playerName + ", how would you like to view this simulation?"
						+ "\n\n\t1) Regular   (innging by inning) "
						+ "\n\t2) Quickplay (see simulation summary)");
						input3 = simMenuInput3.nextLine();
						System.out.println();
						
						if (input3.equals("1"))
							{
								if (menuNum2 == 1)
									{
										
										
										FSimRubber.regRubberGame();
										
										DPlayGame.simMenu();
									}
								if (menuNum2 == 2)
									{
										FSimYard.regYardGame();
										
										DPlayGame.simMenu();
									}
								if (menuNum2 == 3)
									{
										//FSimulationR.regBiscuitGame();
									}
								if (menuNum2 == 4)
									{
										//FSimulationR.regPinkGame();
									}
								if (menuNum2 == 5)
									{
										//FSimulationR.regFartGame();
									}
								if (menuNum2 == 6)
									{
										//FSimulationR.regChichGame();
									}
								if (menuNum2 == 7)
									{
										//FSimulationR.regLegendGame();
									}
							}	
						
						
						
						if (input3.equals("2"))
							{
								
								if (menuNum2 == 1)
									{
										FSimRubber.qRubberGame();
										DPlayGame.simMenu();
									}
								if (menuNum2 == 2)
									{
										
										FSimYard.qYardGame();
										
										DPlayGame.simMenu();
									}
								if (menuNum2 == 3)
									{
										//FSimulationQ.quickBiscuitGame();
									}
								if (menuNum2 == 4)
									{
										//FSimulationQ.quickPinkGame();
									}
								if (menuNum2 == 5)
									{
										//FSimulationQ.quickFartGame();
									}
								if (menuNum2 == 6)
									{
										//FSimulationQ.quickChichGame();
									}
								if (menuNum2 == 7)
									{
									//	FSimulationQ.quickLegendGame();
									}
							}	
						
						
						
						else
							{
								System.out.println("\nSorry, Voodoo Jobu didn't catch that, try again");
								quickPlayOption();
							}
			}
		
		
		
		
		
		
		
		
	}
