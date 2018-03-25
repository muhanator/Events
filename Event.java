package firstPackage;
/*
 * This program has 4 different packages and they contain the following classes in each.
 * 1) Event class
 * 2) Festival, Culturalfiesta, Musicfiesta
 * 3) SportCompetition
 * 4)Fair
 * 
 * It involves many things used in JAVA such as class inheritance, access, rights, method overriding etc.
 * The class Event is the Father of all the other classes because everything created in this program as a whole
 * is an Event. It's purpose is to help a planning office manage different types of year round events.
 */

public class Event 
{
	//Defining the attributes: 
		private int year;	
		private int month;
		private int numCities;	//number of cities event will be held in
		
	//default constructor:
		public Event()
		{
			year=0;
			month= 0;
			numCities=0;
		}
	//parametrized constructor with all the parameters:
		public Event(int year, int month, int numCities)
		{
			this.year=year;
			this.month=month;
			this.numCities=numCities;
		}
	//copy constructor:
		public Event(Event e)
		{
			this.year=e.year;
			this.month=e.month;
			this.numCities=e.numCities;
		}
		
//getters and setters:
	//accessor method for the year:
		public int getYear()
		{
			return year;
		}
	//accessor method for month:
		public int getMonth()
		{
			return month;
		}
	//accessor method for number of cities:
		public int getNumCities()
		{
			return numCities;
		}
	
	//toString() method:
		public String toString()
		{
			return("This Event will be held in " + year + ", month: " + month + " in " + 
					numCities  + " cities");
		}
	//equals method:
		public boolean equals(Object o)
		{
		//it checks to see if it is a null reference and thus protects the program from crashing 
			if (o!=null && o.getClass()==this.getClass()) 
			{
			//cast the given object to an Event object and check if all attrivutes match:
				Event temp= (Event) o;
				return(this.year==temp.year && this.month==temp.month &&
						this.numCities==temp.numCities);
			}
			else
				return false;
		}
		
}
