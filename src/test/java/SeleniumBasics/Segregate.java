package SeleniumBasics;

import java.util.Scanner;

public class Segregate 
{
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String alphabet = "";
	        String number = "";
	        String special = "";

	        // Iterate over each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	                // If the character is an alphabet, add it to the alphabet string
	                alphabet += ch;
	            } else if (Character.isDigit(ch)) {
	                // If the character is a number, add it to the number string
	                number += ch;
	            } else {
	                // If the character is a special character, add it to the special string
	                special += ch;
	            }
	        }

	        // Print the segregated strings
	        System.out.println("Alphabets: " + alphabet);
	        System.out.println("Numbers: " + number);
	        System.out.println("Special characters: " + special);
	    }
	

}
