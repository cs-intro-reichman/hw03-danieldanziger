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
	    while (dayOfMonth != 31 || month != 12 || year != givenYear - 1) {
	    	advance();
		}
 
		advance();
	 	while (dayOfMonth != 31 || month != 12 || year != givenYear) {
	 		if (dayOfWeek == 1) 
	 			System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");	
	 		else 
	 			System.out.println(dayOfMonth + "/" + month + "/" + year);
	 		advance();
        }
        System.out.println("31/12/" + givenYear);
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
	 }
		
		 
	public static boolean isLeapYear(int year) {                                           //input year returns boolean true or false (if its a leap year)
	    // Replace the following statement with your code
		
		if ((year%4==0 && year%100!=0) || year%400==0){                  //how to test if a year is a leap year (why || and not another &&?)
		  return true;
		}
		else{
		return false;
		}
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
