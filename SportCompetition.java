package thirdPackage;
import firstPackage.Event;


//Defining a new class named SportCompetition which is a type of Event
public class SportCompetition extends Event 
{
	//defining attributes:
		private int numActivities;
		private seasonName season;
		
	//defining the enum for the seasons:
		public static enum seasonName
		{
			Summer, Fall, Winter, Spring;
		}
	
	//default constructor:
		public SportCompetition()
		{
			super();
			numActivities=0;
			season= null;
			
		}
	//parametrized constructor:
		public SportCompetition(int year, int month, int numCities, int numActivities, seasonName s)
		{
			super(year, month, numCities);
			this.numActivities=numActivities;
			season=s;
		}
	//copy constructor:
		public SportCompetition(SportCompetition s)
		{
			super(s.getYear(), s.getMonth(), s.getNumCities());
			this.numActivities= s.numActivities;
			this.season= s.season;
		}
		
	//toString() method:
		public String toString()
		{
			return("This SportCompetition will be held in " + this.getYear() + ", month: " + 
					this.getMonth() + " in " + this.getNumCities() + " cities, it has "
					+ numActivities + " activities and takes place in the season of " + season);
		}
	//equals method:
		public boolean equals(Object o)
		{
			if (super.equals(o))
			{
				SportCompetition temp= (SportCompetition) o;
				return (this.numActivities==temp.numActivities && this.season==temp.season);
			}
			else 
				return false;
		}
}
