/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.                                                      //Check if our code works - they want us to print year month day (hint: using the functions we wrote)
	private static void nDaysInMonthTest(int year) {
		// Replace this comment with your code
	
			for (int month = 1; month <= 12; month++){                                                            //need to print all 12 month
			int daysInMonth = nDaysInMonth(month, year);                                                                //sends it to the function nDaysInMonth
			System.out.println("Number of days in month " + month + "of year " + year + ": " + daysInMonth);
			}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {                                           //input year returns boolean true or false (if its a leap year)
	    // Replace the following statement with your code
		
		if ((year%4==0 && year%100!=0) || year%400==0){                  //how to test if a year is a leap year
		  return true;
		}
		else{
		return false;
	}
}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	
	public static int nDaysInMonth(int month, int year) {                                         //function name nDaysInMonth
		// Replace the following statement with your code
		
		if (month == 4 || month == 6 || month == 9 || month == 11){                       //all the months with30 days
			return 30;
		}
		else if (month == 2){                                                     //feb
		 if (isLeapYear(year) == true){
			 return 29;
		 }
			 else{
				 return 28;
			}
		}
			else{                                                                                //all the other months that has 31
		return 31;
		}
		
	}
}
