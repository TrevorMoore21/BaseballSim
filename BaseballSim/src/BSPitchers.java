
public class BSPitchers extends AllStarPlayer
	{

		private int gamesPlayed, battersFaced, hitsAllowed, walks, strikeOut, hitByPitch;
		private double inningsPitched;
		
		
		public BSPitchers(String t, String fn, String ln, String rare,
						  int yp, int c, int g, double i, int bf, int h, int w, int s, int hbp)
		{
			setType(t);
			setFirstName(fn);
			setLastName(ln);
			setRarity(rare);
			setYearsPlayed(yp);
			setCost(c);
			gamesPlayed = g;
			inningsPitched = i;
			battersFaced = bf;
			hitsAllowed = h; 
			walks = w;
			strikeOut = s;
			hitByPitch = hbp;
		}

		public int getGamesPlayed()
			{
				return gamesPlayed;
			}

		public void setGamesPlayed(int gamesPlayed)
			{
				this.gamesPlayed = gamesPlayed;
			}

		public double getInningsPitched()
			{
				return inningsPitched;
			}

		public void setInningsPitched(double inningsPitched)
			{
				this.inningsPitched = inningsPitched;
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
		
		
		
		
	}
