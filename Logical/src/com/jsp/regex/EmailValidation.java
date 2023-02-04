package com.jsp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String email="ambarish8653@gmail.com";
		Pattern p=Pattern.compile("[A-Z,a-z]{4,8}_*[0-9]{4,8}@gmail[.]com");
		Matcher m=p.matcher(email);
		boolean ans=m.matches();
		System.out.println(ans);
	}
}
