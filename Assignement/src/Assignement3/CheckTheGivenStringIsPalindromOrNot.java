package Assignement3;

import java.util.Scanner;

public class CheckTheGivenStringIsPalindromOrNot {

	public static void main(String[] args) {
		String string;
		boolean flag = true;
		//taking the user input 
		Scanner s = new Scanner(System.in);
		System.out.println("enter youw string");
		
		//converting given string in to lower case
		string = s.next().toLowerCase();
		
		System.out.println(string);
		
		//iterate the string forward and backward,compare 
		//one character at a time till middle of the string is reached 
		for(int i = 0; i<string.length()/2;i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Given string is palindrom");
		}else
			System.out.println("Given string is not a plindrom");
		}

	}


