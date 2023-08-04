package homework;
public class Day3VariableHomework {
	
public static void main ( String args [ ]) { 
	
		String carName = "Volvo";
		int maxSpeed = 120;
		int favNum = 15;
		
		System.out.println ( carName);
		System.out.println ( maxSpeed);
		System.out.println ( favNum);
		
		favNum = 1111;
		carName = "BMW";
		/*
		 * in step 7 we changed the car name to BMW, that is why when we ask
		 * the system to print carName it take the latest one.
		 */
			System.out.println (carName);
			// Here since we have not changed the value of max speed we get the same value.
			System.out.println ( maxSpeed);
			
			// we changed the favNum value to 1111, that is why the java take the latest one.
			System.out.println(favNum);
			
			int X = 5;
			int Y = 10;
			int Result = X+Y;
			System.out.println ( Result);
			System.out.println ( "Result = "+ Result);
			
			int idNumber = 1111;
			double Age = 52.7123;
			String Name = " Java Programming";
			System.out.println ( idNumber);
			System.out.println ( Age);
			System.out.println ( Name);
			String myNameIs = "Khwaja Latif Sediqi";
			int myFavNumber = 777;
			String myHobby ="To Play Football";
			
	System.out.println ( "My name is"+ " " + myNameIs+"," + " "+"my favorite number" + " " +
	myFavNumber +","+ " " + " and i like"+ " " + myHobby+".");
	
	System.out.println ( " My name is  " + myNameIs + " my favorite number  " + myFavNumber + " ,and i like "  + myHobby +".");
			
			
			
			
		
		
		
		
	}

}
