
public class BSPitchers extends AllStarPlayer
	{

		private int gamesPlayed, battersFaced, hitsAllowed, walks, strikeOut, hitByPitch;
		private double inningsPitched;
		
		
		public BSPitchers(String t, String fn, String ln, String rare,
						  int yp, int c, int g, int bf, int h, int w, int s, int hbp, double i)
		{
			setType(t);
			setFirstName(fn);
			setLastName(ln);
			setRarity(rare);
			setYearsPlayed(yp);
			setCost(c);
			gamesPlayed = g;
			battersFaced = bf;
			hitsAllowed = h; 
			walks = w;
			strikeOut = s;
			hitByPitch = hbp;
			inningsPitched = i;
		}

		public int getGamesPlayed()
			{
				return gamesPlayed;
			}

		public void setGamesPlayed(int gamesPlayed)
			{
				this.gamesPlayed = gamesPlayed;
			}

		public int getBattersFaced()
			{
				return battersFaced;
			}

		public void setBattersFaced(int battersFaced)
			{
				this.battersFaced = battersFaced;
			}

		public int getHitsAllowed()
			{
				return hitsAllowed;
			}

		public void setHitsAllowed(int hitsAllowed)
			{
				this.hitsAllowed = hitsAllowed;
			}

		public int getWalks()
			{
				return walks;
			}

		public void setWalks(int walks)
			{
				this.walks = walks;
			}

		public int getStrikeOut()
			{
				return strikeOut;
			}

		public void setStrikeOut(int strikeOut)
			{
				this.strikeOut = strikeOut;
			}

		public int getHitByPitch()
			{
				return hitByPitch;
			}

		public void setHitByPitch(int hitByPitch)
			{
				this.hitByPitch = hitByPitch;
			}
		
		public double getInningsPitched()
			{
				return inningsPitched;
			}

		public void setInningsPitched(double inningsPitched)
			{
				this.inningsPitched = inningsPitched;
			}
		
		
	}
