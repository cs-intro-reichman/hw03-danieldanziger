/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900                                                        //already gave us the info that 1/1/1900 was a Monday and the number of days in that month
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	
	public static void main(String args[]) {
		int givenYear = Integer.parseInt(args[0]);
	    int debugDaysCounter = 0; 
	
 
		while (year<=givenYear) {
	 		advance();
	 		debugDaysCounter++;
	 		
	 		if (month == 12 && dayOfMonth == 31 && year==givenYear) { 
	 			break;
	 		}
        }
	 }
	
	 
	 private static void advance() {                                   
		dayOfMonth++;
		 dayOfWeek = (dayOfWeek % 7) + 1;
		 if(dayOfMonth > nDaysInMonth){
			 month++;
			 dayOfMonth = 1;
			 if(month > 12){
				 year++;
				 month = 1;
			 }
			 nDaysInMonth = nDaysInMonth(month, year);
		 }

		 System.out.print(dayOfMonth + "/");
		 System.out.print(month + "/");
		 System.out.print(year);
		 if (dayOfWeek == 1 && dayOfMonth == 1) {
			 System.out.println(" Sunday");
		 } else {
			 System.out.println();
		 }

	 }
		
		 
	private static boolean isLeapYear(int year) {
		return false;
	}
	 
	private static int nDaysInMonth(int month, int year) {
		if(month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else if (month == 2){
			if(isLeapYear(year) == true){
				return 29;
			}
			else{
				return 28;
			}
		}
		else{
			return 31;
		}
	}
}
