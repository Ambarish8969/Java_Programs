package com.jsp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String[] args) {
		String str="ambris";
		Pattern p=Pattern.compile("[a-z,A-Z]{6}");
		Matcher m=p.matcher(str);
		boolean ans=m.matches(); 
		System.out.println(ans);
	}
}
