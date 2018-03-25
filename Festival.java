package secondPackage;

//importing the Event class from the 1st package since we are currently in the 2nd package:
import firstPackage.Event;	

/*Defining a new class named Festival which is a type of Event*/
public class Festival extends Event
{
	/*Defining the attributes for PART 1: NOTICE THEY ARE PROTECTED IN THIS CASE */
//		protected String name;
//		protected double ticketPrice;
//		protected int duration;
	
	/*Defining the attributes for PART 2; NOTICE THEY ARE PRIVATE IN THIS CASE*/
		private String name;
		private double ticketPrice;
		private int duration;
		
	//default constructor:
		public Festival()
		{
			name=null;
			ticketPrice=0;
			duration=0;
		}
	//parametrized constructor(parameters are its own first and then the fathers):
		public Festival(int year, int month, int numCities, String name, double ticketPrice, int duration)
		{
		//using the super class to make the father:
			super(year,month,numCities);
			this.name=name;
			this.ticketPrice=ticketPrice;
			this.duration=duration;
		}
	//copy constructor:
		public Festival(Festival f)
		{
		//using super to create the father:
			super(f.getYear(), f.getMonth(), f.getNumCities());
			this.name=f.name;
			this.ticketPrice=f.ticketPrice;
			this.duration=f.duration;
		}

	//These attributes are used for PART 2:
		
		public String getName()
		{
			return name;
		}
		public double getTicketPrice()
		{
			return ticketPrice;
		}
		public int getDuration()
		{
			return duration;
		}
	
	//toString method:
		public String toString()
		{
			return("This " + name + " Festival will be held in " + this.getYear() + ", month: " +
					this.getMonth() + " in " + this.getNumCities() + " cities for " + duration +
					" day(s) and the ticket will cost $" + ticketPrice);
		}
	//equals method:
		public boolean equals(Object o)
		{
		//checks to see if father has the same attributes:
			if (super.equals(o))
			{
			//cast the object to a Festival class and check attributes:
				Festival temp=(Festival) o;
				return (this.name==temp.name && this.ticketPrice==temp.ticketPrice
						&& this.duration==temp.duration);
			}
			else
				return false;
		}
}
