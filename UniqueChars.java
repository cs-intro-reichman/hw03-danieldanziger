/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
		
		String unique = "";
		
		for(int i = 0;  i < s.length(); i++){  
			char currentChar = s.charAt(i);   
			if (currentChar != ' '){                                                 //if the currentChar is not a space (since a space can be more than once
				if (unique.indexOf(currentChar) == -1){                              //if it is -1 its not in the new string (unique) and we want to add it. if its any other number it will not add it to the unique
					unique = unique + currentChar;                                   //add it
				}
			}
		else{
			unique = unique + currentChar;                                           //if its not a space add it

			}
		}
		
        return unique;
    }
}