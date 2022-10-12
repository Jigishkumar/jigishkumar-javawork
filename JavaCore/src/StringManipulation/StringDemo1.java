package StringManipulation;

public class StringDemo1 {

	

	    public static void main(String args[]) {
	        String strLiteral = "Hello World!";
	        System.out.println(strLiteral); // output will be: Hello World!
	        
	        String strObject = new String("Hello World!");
	        System.out.println(strObject); // output will be: Hello World!
	        

	        // Method 1     
	        String str0 = "I like strings";
	        String str00 = "I like strings";
	        System.out.println(str0 == str00); // output will be: true

	        // Method 2
	        String str3 = new String("I like strings");
	        String str4 = new String("I like strings");
	        System.out.println(str3 == str4); // output will be: false
	        
	        
	        String str5 = new String("I like strings");
	        String str6 = new String("I like strings");
	        System.out.println(str5.equals(str6));  // output will be: true

	        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
	        String helloString = new String(helloArray);  
	        System.out.println(helloString); // prints out Hello.
	        
	        String myStr0= "I like strings";
	        int stringLength = myStr0.length();
	        System.out.println("String Length is " + stringLength);
	        // output will be: String Length is 14
	        
	        //example 1
	        String myStr = "My cat's name is ".concat("Copycat");
	        System.out.println(myStr);
	        // output will be: My cat's name is Copycat

	        //example 2
	        String myStr2 = "Hello, " + "World" + "!" ;
	        System.out.println(myStr2);
	        // output will be: Hello, World!

	        //example 2.5
	        String myStr3 = "Hello,"+ "World" + "!"; // Be careful, don't forget to add spaces!
	        System.out.println(myStr3);
	        //output will be: Hello,World! because no spaces were included above

	        //example 3
	        String string1 = "Welcome ";
	        String string2 = "to ";
	        String string3 = "Java";
	        String string4 = "!";
	        System.out.println(string1 + string2 + string3 + string4);
	        // output will be: Welcome to Java!
	        
	        String str1 = "ThIsIsSoMeTeXt";
	        String str2 = "thisissometext";

	        // Converts text to lowercase
	        System.out.println(str1.toLowerCase());// output will be: thisisometext

	        // Converts text to UPPERCASE
	        System.out.println(str1.toUpperCase()); // output will be: THISISSOMETEXT

	        // Returns the character at the specified index
	        System.out.println(str1.charAt(3)); // output will be: s

	        // Returns the first position of the character specified.
	        System.out.println(str1.indexOf("I")); // output will be: 2

	        // Returns true or false if the string ends with the specified character
	        System.out.println(str1.startsWith("t")); // output will be: false

	        // Returns true or false if the string ends with the specified character
	        System.out.println(str1.endsWith("t")); // output will be: true

	        // Returns true or false if the string contains the specified characters
	        System.out.println(str1.contains("So")); // output will be: true

	        // Returns a new string that is a substring of this string.
	        // start index is inclusive and endindex is exclusive
	        System.out.println(str1.substring(1, 3)); // output will be: hIs

	        // Checks if the values of two strings are the same:
	        System.out.println(str1.equals(str2)); // output will be: false

	        // Compares two strings ignoring case considerations:
	        System.out.println(str1.equalsIgnoreCase(str2)); // output will be: true

	        //Searches a string for a specified value and then replaces it with another value
	        System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt
	        

	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}


