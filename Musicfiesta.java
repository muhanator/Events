package secondPackage;


/*Defining a new class named MusicFiesta which is a type of Festival: */
public class Musicfiesta extends Festival
{
	//defining attribute(s):
		private int numBands;	//number of bands
	
	//default constructor:
		public Musicfiesta()
		{
			numBands=0;
		}
	//parametrized constructor:
		public Musicfiesta(int year, int month, int numCities, String name, double ticketPrice, int duration,int numBands)
		{
			super(year, month, numCities, name, ticketPrice, duration);
			this.numBands=numBands;
		}
	//copy constructor:
		public Musicfiesta(Musicfiesta m)
		{
		//m is a child of event so it can access its attributes directly:
			super(m.getYear(), m.getMonth(), m.getNumCities(), m.getName(), m.getTicketPrice(), m.getDuration());
			this.numBands=m.numBands;
		}
	
	
//	//toString() method for PART 1:
		
		/*Notice how the attributes name, duration and ticketPrice can be accessed directly since the father (Festival)
		 * has made them protected so that only his friends(classes in same package) and his children can see them*/
//		public String toString()
//		{
//			return ("This " + name +  " Musicfiesta will be held in " + this.getYear() + ", month: " + 
//					this.getMonth() + " in " + this.getNumCities() + " cities, for " + duration +
//					" days, the ticket will cost " + ticketPrice + "$, and has " + numBands + " bands." );
//		}
	
	//toString() method for PART 2:
		
		/*Notice how the attributes name, duration and ticketPrice now need permission from the Father (Festival class)
		 * to be accessed because he has made them private: */
		public String toString()
		{
			return ("This " + this.getName() +  " Musicfiesta will be held in " + this.getYear() + ", month: " + 
					this.getMonth() + " in " + this.getNumCities() + " cities, for " + this.getDuration() +
					" days, the ticket will cost " + this.getTicketPrice() + "$, and has " + numBands + " bands." );
		}
		
		
	//equals method:
		public boolean equals(Object o)
		{
			if (super.equals(o))
			{
				Musicfiesta temp= (Musicfiesta) o;
				return (this.numBands==temp.numBands);
			}
			else 
				return false;
		}
}
