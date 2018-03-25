package fourthPackage;
import firstPackage.Event;
import secondPackage.Festival;
import secondPackage.Culturalfiesta;
import secondPackage.Musicfiesta;
import thirdPackage.SportCompetition;
import thirdPackage.SportCompetition.seasonName;
import fourthPackage.Fair;
import fourthPackage.Fair.type;

/**
 * This is the driver class for the Event class and all of its children.
 *This is where all the methods will be tested for all these classes.
 */

public class EventDriver 
{
//main method:
	public static void main(String [] args)
	{
	//PART 1:
		System.out.println("********************************PART 1************************************************\n");
		
	//creating an event that is in 2010, month 02, in 10 cities:
		Event e1=new Event(2010, 02, 10);
	//creating the exact same event as above:
		Event e2= new Event(2010, 02, 10);
	//creating an event that is in 1867, month: 07 in 1 city:
		Event e3= new Event(1867, 07, 01);
		
	//creating festival that is in 1999, month 12, in 300 cities, named "Lights", ticket($): 100, lasts 1 day
		Festival fes1= new Festival(1999, 12, 300, "Lights", 100, 1);
	//creating the exact same Festival as above:
		Festival fes2= new Festival(1999, 12, 300, "Lights", 100, 1);
	//creating a Festival that is in 2010, month: 06, in 1 city, names "Black", ticket($): 275, lasts 7 days:
		Festival fes3= new Festival(2010, 06, 01, "Black", 275, 7);
		
	//Culturalfiesta in 2005, month: 06, in 12 cities, named "Chinese fiesta", ticket($): 50, lasts 7 days, 2 languages
		Culturalfiesta c1= new Culturalfiesta(2005, 06, 12, "Chinese fiesta", 50, 7, 2);
	//creating same Culturalfiesta as above:
		Culturalfiesta c2= new Culturalfiesta(2005, 06, 12, "Chinese fiesta", 50, 7, 2);
	//Culturalfiesta that is in 2018, month:02, in 99 cities, named "Japanese fiesta", ticket($): 75, 5 days, l language
		Culturalfiesta c3= new Culturalfiesta(2018, 02, 99, "Japanese fiesta", 75, 5, 1);
		
	//Musicfiesta in 2018, month: 08, in 25 cities, named "Ile Soniq", ticket($): 75, lasts 3 days, has 20 bands
		Musicfiesta m1= new Musicfiesta(2018, 8, 25, "Ile Soniq", 75, 3, 20);
	//creating the same Musicfiesta as above:
		Musicfiesta m2= new Musicfiesta(2018, 8, 25, "Ile Soniq", 75, 3, 20);
	//Musicfiesta in 2017, month: 07, in 22 cities, named "Coachella", ticket($): 90, lasts 5 days, has 25 bands
		Musicfiesta m3=new Musicfiesta(2017, 07, 22, "Coachella", 90, 5, 25);
		
	//SportCompetition in 2014, month: 07, in 16 cities, has 2 activities and is in summer: 
		SportCompetition s1= new SportCompetition(2014, 7, 16, 2, seasonName.Summer);
	//creating same SportCompetition as above:
		SportCompetition s2= new SportCompetition(2014, 7, 16, 2, seasonName.Summer);
	//SportCompetition in 1992, month: 06, in 5 cities, has 3 activities and is in Winter:
		SportCompetition s3=new SportCompetition(1992, 06, 5, 3, seasonName.Winter);
		
	//Fair in 1950, month: 09, in 12 cities, has 100 exhibitors and is science fair: 
		Fair f1= new Fair(1950, 9, 12, 100, type.Science);
	//creating same fair as above:
		Fair f2= new Fair(1950, 9, 12, 100, type.Science);
	//Fair in 1977, month: 10, in 32 cities, has 77 exhibitors is a a career fair:
		Fair f3= new Fair(1977, 10, 32, 77, type.Career);
		
	//Testing the toString() method using the 1st created objects from each class:
		System.out.println("--------------------Testing the toString() method -----------------------");
		System.out.println(e1 + "\n" + fes1 + "\n" + c1 + "\n" + m1 + "\n" + s1 + "\n" + f1 );
		System.out.println();
		
	//Testing the equals method (All these should be TRUE):
		System.out.println("--------------------Testing the equals() method--------------------------");
		System.out.println("Events e1 and e2 are equal is " + e1.equals(e2));
		System.out.println("Festival fes1 and fes 2 are equal is "+ fes1.equals(fes2));
		System.out.println("Culturalfiesta c1 and c2 are equal is " + c1.equals(c2));
		System.out.println("Musicfiesta m1 and m2 are equal is " + m1.equals(m2));
		System.out.println("SportCompetition s1 and s2 are equal is " + s1.equals(s2));
		System.out.println("Fair f1 and f2 are equal is " + f1.equals(f2));
		System.out.println();
	//Testing the equals method (All these should be FALSE):
		System.out.println("Events e1 and e3 are equal is " + e1.equals(e3));
		System.out.println("Festivals fes1 and fes3 are equal is " + fes1.equals(fes3));
		System.out.println("Musicfiesta m1 and m3 are equal is " + m1.equals(m3));
		System.out.println("Musicfiesta m2 and SportCompetition s3 are equal is " + m2.equals(s3));
		System.out.println("Fair f1 and Event e2 are equal is " + f1.equals(e2));
		System.out.println("Culturalfiesta c3 and Musicfiesta m3 are equal is " + c3.equals(m3));
		System.out.println();
		
		
	//creating an array of 10 Event objects(at least 1 from every class):
		Event[] array1= new Event[10];
		array1[0]=e1; array1[1]=fes1; array1[2]= c3; array1[3]=m2; array1[4]=s3;
		array1[5]=f2; array1[6]=c1; array1[7]=fes3; array1[8]=f3; array1[9]=m3;
		
		System.out.println("---------------------Finding the Event with the most number of Cities-----------------------");
	//finding the event that has the most number of cities:
		Event mostCities=null;	//declaring the variable which is an Event object and has the most cities
		int greatestIndex=0;	//this variable will store the index of the Event with the most cities
		for (int i=1; i<array1.length; i++)
		{
			if (array1[i].getNumCities()>array1[i-1].getNumCities())
			{
				mostCities= array1[i];
				greatestIndex=i;
			}
		}
		System.out.println("The Event with the most number of cities is located at index " + greatestIndex
		+ ": \n" + mostCities);
		System.out.println();
		
	//finding all the events that are happening on the same year:
		System.out.println("------------------Finding the events that happen on the same year------------------------");
		int currentYear=1800;	//starting the events at the year 1800
		int match=0; 	//represents the number events happening the same particular year
		int place;	//the objects numbered that match
		for (int i=currentYear; i<=2018; i++)
		{
			place=1;
			match=0;
			for (int j=0; j<array1.length; j++)
			{
				if (array1[j].getYear()==i) //if the year of the event we are on is the year currently in the loop
				{
					match++;
				}
			}
			if (match>=2)
			{
				System.out.println("There are " + match + " Events that happen the year of " + i + ":");
			//loop through the whole array again:
				for (int k=0; k<array1.length;k++)
				{
				//if the Event at index k has the same year we are currently on, print its info 
					if(array1[k].getYear()==i)
					{	
						System.out.println(place + ") LOCATED AT INDEX " + k + " OF THE ARRAY: \n" + array1[k]);
						place++;
					}
				}
				System.out.println();
			}
		}
		
		
//PART 2:
		System.out.println("\n********************************PART 2************************************************\n");
		
	//creating an Event array named "array2" of 12 objects(atleast one from each class):
		Event[] array2= new Event[12];
	//the first 10 events will be the same in array2 as they were in array1
		array2[0]=e1; array2[1]=fes1; array2[2]= c3; array2[3]=m2; array2[4]=s3;
		array2[5]=f2; array2[6]=c1; array2[7]=fes3; array2[8]=f3; array2[9]=m3;
		array2[10]=s1; array2[11]=e3;
		
	//displaying the contents of array2:
		System.out.println("Displaying the contents of array2: ");
		for (int i=0; i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
		
	//displaying the contents of the COPIED array2:
		System.out.println("\nDisplaying the contents of the COPY of array2 using method <copyFestival>:");
	//calling the CopyFestival() method to create a copy of array 2:
		CopyFestival(array2);
		
	}
	
/*
 * static method that takes an array of Events and returns an array of Events.
 * creates an array of the same length. It copies all the FESTIVALS from the passed array
 * to the new array and then returns it
 */
	public static Event[] CopyFestival(Event[] e)
	{
	//makes a copy of the array with the same length:
		Event[] copyArray=new Event[e.length];
		
	//This method here does not misbehave since polymorphism is happening:
		
//		for(int i=0; i<copyArray.length; i++)
//		{
//		//if the Event at the current index is a Festival, we add it to the new copy array: 
//			if (e[i].getClass()==Festival.class)	
//			{
//			//we make a temporary object and cast it to look like a Festival:
//				//Festival temp= (Festival) e[i];
//		//then starting from the 1st index of the copy Array, we create a copy of the Festival and add it to array:
//				copyArray[i]= new Festival((Festival) e[i]);
//			}
//			else
//				copyArray[i]=e[i];
//		}
		
	/*This method misbehaves and does not make proper copies of the objects within the array because polymorphism is
	 * not happening because we are not using a clone() method. A clone method would work and produce copies that do
	 * not misbehave because the clone method is overriden in every class so polymorphism happens. However, in this 
	 * case we are using a copy consructor and the name of a constructor is different in every class. Therefore, 
	 * they are not overriden and so polymorphism is not happening and so the method misbehaves. 
	 */
	
		for (int k=0; k<copyArray.length; k++)
		{
			copyArray[k]=new Event(e[k]);
		}
		for (int j=0; j<copyArray.length; j++)
		{
			System.out.println(copyArray[j]);
		}
		return copyArray;
	}
}
