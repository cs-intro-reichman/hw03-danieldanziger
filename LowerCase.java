/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowercase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowercase(String s) {
        // Replace the following statement with your code
		String lowercase = "";
		
		for(int i = 0;  i < s.length(); i++){                                           //runs on the letters in the string
			char currentChar = s.charAt(i);                                             //currentChar is the string we get and run on while lowercase is the string we want to save it as new
			if (currentChar >= 'A' && currentChar <= 'Z'){
			 lowercase = lowercase + (char) (currentChar + ('a' - 'A'));                // can also write '32' intead of 'a'-'A'
		 }
		 else {
			  lowercase = lowercase + currentChar;
		 }
		}
		

        return lowercase;
    }
}