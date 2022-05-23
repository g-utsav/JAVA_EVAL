package question1;

/*Question 1:

Why String is immutable in java and what is the difference between String and String Builder? And Write some
of the methods of String class at least 5 with example.*/

/*
 * Strings are immutable in java because the varibles holding the strings doent actually hold the 
 * string but the reference to the string ie the variables hold the reference to the string in the
 * memory. So this means that say we have two varibles : -
 *  	String str1 = "Welcome";
 *  	String str2 = "Welcome";
 *  
 *  when the JVM hits the str1 it first finds if there exist a string with the characters as
 *  "Welcome" if it finds it it gives str1 the address of that string in the memory but for now lets assume
 *  there is no strings stored in the memory so now the JVM will  stores the "Welcome" in the memory(String
 *  Constant Pool) and assigns its hashed address to str1.  Now after it JVM hits str2 similarly
 *  the JVM will first find in the memory for the match as in this case there is a match so the JVM
 *  will assign its address to the str2 
 *  ***Now both the str1 and str2 have the same address and pointing to the same string object
 *  if say the string modification was allowed say we modify str1 to "THankYou" as str2 also points 
 *  to the same address so the value of str2 will also change which is not desirable that is why 
 *  strings are immutable in JAVA
 *  
 *  Difference between String and String Builder?
 *  	=> 	Strings created by String class are Immutable but where as strings of StringBuilder 
 *  are mutable
 *  	strings created by String class using the following syntax  :- String str1 = "Welcome"
 *  are stored in String constant Pool(Scp)/String Pool(SP) where as there is no way of creating 
 *  string objects with the similar syntax using String Builder Class also the syntax for the 
 *  String Builder class is :- StringBuilder sb = new StringBuilder("Welcome")  which is stored 
 *  in the Heap Memory of the RAM. 
 * 
 * 
 * */

public class Question1 {

	public static void main(String[] args) {
		// Examples of Methods in String Class
		
		//1)str1.equals(str2) Compares the value not the address
		String str1 = "Welcome";
		String str2 = "Welcome";
		System.out.println(str1.equals(str2));
		
		
		//2)str.indexOf(char) // Gives the indes of the character
		System.out.println(str1.indexOf('e'));
		
		//3)str1.charAt(index)   Gives the character at the given index
		System.out.println(str1.charAt(4));
		
		//4)str1.substring(startIndex, endIndex) // Gives the substring between the given index last index
		//not included
		System.out.println(str1.substring(2, 4));
		
		//5)str1.length() //Gives the length of the String
		System.out.println(str1.length());
	}

}
