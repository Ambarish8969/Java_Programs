package com.jsp.string1;

// To print vowels which are not present in given String.

public class String5 {
	public static void main(String[] args) {
		 String input = "hello";

	        input = input.toLowerCase();

	        boolean[] vowelsPresent = new boolean[5];

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c == 'a') {
	                vowelsPresent[0] = true;
	            } else if (c == 'e') {
	                vowelsPresent[1] = true;
	            } else if (c == 'i') {
	                vowelsPresent[2] = true;
	            } else if (c == 'o') {
	                vowelsPresent[3] = true;
	            } else if (c == 'u') {
	                vowelsPresent[4] = true;
	            }
	        }
	        System.out.print("Vowels not present: ");
	        for (int i = 0; i < 5; i++) {
	            if (!vowelsPresent[i]) {
	                if (i == 0) {
	                    System.out.print("a");
	                } else if (i == 1) {
	                    System.out.print("e");
	                } else if (i == 2) {
	                    System.out.print("i");
	                } else if (i == 3) {
	                    System.out.print("o");
	                } else if (i == 4) {
	                    System.out.print("u");
	                }
	            }
	        }
	        System.out.println();
	}

}
