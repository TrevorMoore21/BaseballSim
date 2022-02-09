
public class BSPitchers extends AllStarPlayer
	{

		private int gamesPlayed, battersFaced, hitsAllowed, walks, strikeOut, hitByPitch;
		private double inningsPitched;
		
		
		public BSPitchers(String t, String t2, String fn, String ln, String rare, String o,
						  int yp, int c, int g, int bf, int h, int w, int s, int hbp, double ip)
		{
			setType(t);
			setType2(t2);
			setFirstName(fn);
			setLastName(ln);
			setRarity(rare);
			setOwner(o);
			setYearsPlayed(yp);
			setCost(c);
			gamesPlayed = g;
			battersFaced = bf;
			hitsAllowed = h; 
			walks = w;
			strikeOut = s;
			hitByPitch = hbp;
			inningsPitched = ip;
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
