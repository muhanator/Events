package fourthPackage;
import firstPackage.Event;

//Defining a new class named fair which is a type of Event
public class Fair extends Event 
{
	//attributes:
		private int numExhibitors;
		private type typ;
	//definng enum for type of fair:
		public static enum type
		{
			Career, Science, Trade, Travel;
		}
	
	//public constructor:
		public Fair()
		{
			super();
			numExhibitors=0;
			typ=null;
		}
	//parametrized constructor:
		public Fair(int year, int month, int numCities, int numExhibitors, type typ)
		{
			super(year, month, numCities);
			this.numExhibitors=numExhibitors;
			this.typ=typ;
		}
	//copy constructor:
		public Fair(Fair f)
		{
			super(f.getYear(), f.getMonth(), f.getNumCities());
			this.numExhibitors= f.numExhibitors;
			this.typ= f.typ;
		}
		
	//toString method:
		public String toString()
		{
			return ("This " + typ + " fair " + " will be held in " + this.getYear() + ", month: " + 
					this.getMonth() + " in " + this.getNumCities() + " cities and it has " +
					numExhibitors + " exhibitors.");
		}
	//equals method:
		public boolean equals(Object o)
		{
			if (super.equals(o))
			{
				Fair temp= (Fair) o;
				return (this.numExhibitors==temp.numExhibitors && this.typ==temp.typ);
			}
			else 
				return false;
		}
}
