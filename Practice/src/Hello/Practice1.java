package Hello;

public class Practice1{
	public static void main(String[] args) {
		long n=7963473;
		String s=n+"";
		String ans="";
		for(int i=0;i<s.length();i=i+2) {
			if(i==s.length()-1) {
				ans=ans+s.charAt(i);
			}
			else if(s.charAt(i)>s.charAt(i+1)) {
				ans=ans+s.charAt(i);
			}
			else {
				ans=ans+s.charAt(i+1);
			}
		}
		System.out.println(Long.parseLong(ans));
	}
}