/*
 * 	Student name: Deepkumar Rajendrakumar Patel
	Student Email: drpatel33@myseneca.ca
	Student number: 153693189
	Section: ZAA
 * */
package workShop2;

public class Palindrome {
	public static void main (String[] s) {
		
		String input = s[0];
		//check condition
		  if(isPalindrome(input)) {
			  System.out.println(input + " is a Polindrome");
	        } else {
	        	System.out.println(input + " is not a Polindrome");
	        }
	    }
	  
	  static boolean isPalindrome(String str) {
		   
		 //stack to hold input
		  Stack stack = new Stack(str.length());	  
		  
		  //populate stack
		  for(int i=0; i < str.length(); ++i) {
			  stack.push(str.charAt(i));
		  }
		  //compare with pop
		  for(int i=0; i < str.length(); i++) {
			  if (str.charAt(i)!=stack.pop()) {
				  return false;
			  }		
		 }
		  
		  return true;
	  }
}
