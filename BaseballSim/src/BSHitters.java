
public class BSHitters extends AllStarPlayer
	{

		private int plateAppearances, atBats, runsBattedIn, hits, baseOnBalls, homeRuns;
		
		public BSHitters(String t, String t2, String fn, String ln, String rare, String o,
				         int yp, int c, int p, int a, int r, int h, int bb, int hr)
			{
				setType(t);
				setType2(t2);
				setFirstName(fn);
				setLastName(ln);
				setRarity(rare);
				setOwner(o);
				setYearsPlayed(yp);
				setCost(c);
				plateAppearances = p;
				atBats = a;
				runsBattedIn = r;
				hits = h;
				baseOnBalls = bb;
				homeRuns = hr;
				
			}

		public int getPlateAppearances()
			{
				return plateAppearances;
			}

		public void setPlateAppearances(int plateAppearances)
			{
				this.plateAppearances = plateAppearances;
			}

		public int getAtBats()
			{
				return atBats;
			}

		public void setAtBats(int atBats)
			{
				this.atBats = atBats;
			}

		public int getRunsBattedIn()
			{
				return runsBattedIn;
			}

		public void setRunsBattedIn(int runsBattedIn)
			{
				this.runsBattedIn = runsBattedIn;
			}

		public int getHits()
			{
				return hits;
			}

		public void setHits(int hits)
			{
				this.hits = hits;
			}

		public int getBaseOnBalls()
			{
				return baseOnBalls;
			}

		public void setBaseOnBalls(int baseOnBalls)
			{
				this.baseOnBalls = baseOnBalls;
			}

		public int getHomeRuns()
			{
				return homeRuns;
			}

		public void setHomeRuns(int homeRuns)
			{
				this.homeRuns = homeRuns;
			}
		
		
		
	}
