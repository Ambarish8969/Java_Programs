package com.jsp.string1;

// To print nearest vowel
public class String2 { 
	public static void main(String[] args) {
		char input='y';
		if(input>='a' && input<='d') {
			if(input<'c') {
				System.out.println('a');
			}else {
				System.out.println('e');
			}
		}else if(input>='e' && input<='h') {
			if(input<'g') {
				System.out.println('e');
			}else {
				System.out.println('i');
			}
		}else if(input>='i' && input<='n') {
			if(input<'l') {
				System.out.println('i');
			}else {
				System.out.println('o');
			}
		}else if(input>='o' && input<='t') {
			if(input<'q') {
				System.out.println('o');
			}else {
				System.out.println('u');
			}
		}else {
			System.out.println('u');
		}
	}
}