
public class AllStarPlayer
	{

		private String type, firstName, lastName, rarity;
		private int yearsPlayed, cost;
		
		//need two constructors for inheritance to work with this constructor?
		public AllStarPlayer()
		{
			
		}
		
		
		public AllStarPlayer(String t, String fn, String ln, String rare, int yp, int c)
		{
			type = t;
			firstName = fn;
			lastName = ln;
			rarity = rare;
			yearsPlayed = yp;
			cost = c;
		}



		public String getType()
			{
				return type;
			}


		public void setType(String type)
			{
				this.type = type;
			}


		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		
		public String getRarity()
			{
				return rarity;
			}


		public void setRarity(String rarity)
			{
				this.rarity = rarity;
			}
		
		public int getYearsPlayed()
			{
				return yearsPlayed;
			}

		public void setYearsPlayed(int yearsPlayed)
			{
				this.yearsPlayed = yearsPlayed;
			}
		
		public int getCost()
			{
				return cost;
			}


		public void setCost(int cost)
			{
				this.cost = cost;
			}

	}
