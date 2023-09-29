package com.pregrad.ass1;

public class alpha {

	    public void check(char ch) {
	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            ch = Character.toLowerCase(ch); 
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch + " is a vowel.");
	            } else {
	                System.out.println(ch + " is a consonant.");
	            }
	        } else {
	            System.out.println("Error: Not a valid character.");
	        }
	    }

	        
	
}


