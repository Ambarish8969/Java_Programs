package com.jsp.string1;

public class StrongWeak {
	public static void main(String[] args) {
		String s="helo1541";
		boolean b=true;
		for(int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				if(c==s.charAt(i+1) || c+1==s.charAt(i+1)) {
					b=false;
					break;
				}
			}
			else if(c==s.charAt(i+1)) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println("Strong");
		}else {
			System.out.println("Weak");
		}
	}
}
