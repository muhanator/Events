package secondPackage;

/*Defining a new class named Culturalfiesta which is a type of Festival*/
public class Culturalfiesta extends Festival 
{
	/*Attribute: Maximum number of languages that can be spoken at this festival */
		private int numSpokenLanguages;
		
	//default constructor:
		public Culturalfiesta()
		{
			numSpokenLanguages=0;
		}
	//parametrized constructor(has 7 parameters):
		public Culturalfiesta(int year, int month, int numCities, String name, 
							  double ticketPrice, int duration, int num)
		{
			super(year, month, numCities, name, ticketPrice, duration);
			numSpokenLanguages=num;
		}
	//copy constructor:
		public Culturalfiesta(Culturalfiesta c)
		{
		//name, ticketPrice and duration are protected so c can access them directly
			super(c.getYear(), c.getMonth(), c.getNumCities(), c.getName(), c.getTicketPrice(), c.getDuration());
			this.numSpokenLanguages= c.numSpokenLanguages;
		}
		
		
	//toString method:
		public String toString()
		{
		/* notice now the attributes name, ticketprice and duration need permission from the father
		 * because the father has made these attributes private:
		 */
			return("This " + this.getName() + " Culturalfiesta will be held in " + this.getYear() +
					", month: " + this.getMonth() + " in " + this.getNumCities() + " cities, for " +
					this.getDuration() + " day(s), the ticket will cost $" + this.getTicketPrice() + " and has " +
					numSpokenLanguages + " spoken langauges.");
		}
		
		
		
	//equals method:
		public boolean equals(Object o)
		{
			if (super.equals(o))
			{
				Culturalfiesta temp= (Culturalfiesta) o;
				return (this.numSpokenLanguages== temp.numSpokenLanguages);
			}
			else
				return false;
		}
}



