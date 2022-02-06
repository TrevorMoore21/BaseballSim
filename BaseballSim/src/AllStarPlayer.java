
public class AllStarPlayer
	{

		private String type, type2, firstName, lastName, rarity, owner;
		private int yearsPlayed, cost;
		
		//need two constructors for inheritance to work with this constructor?
		public AllStarPlayer()
		{
			
		}
		
		
		public AllStarPlayer(String t, String t2, String fn, String ln, String rare, String o, int yp, int c)
		{
			type = t;
			type2 = t2;
			firstName = fn;
			lastName = ln;
			rarity = rare;
			owner = o;
			yearsPlayed = yp;
			cost = c;
		}



		public String getType()
			{
				return type;
			}

		public String getType2()
			{
				return type2;
			}


		public void setType2(String type2)
			{
				this.type2 = type2;
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
		
		public String getOwner()
			{
				return owner;
			}


		public void setOwner(String owner)
			{
				this.owner = owner;
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
