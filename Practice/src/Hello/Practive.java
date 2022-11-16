package Hello;

public class Practive {
	
	public static void main(String[] args) {
		int a=1,b=2,c=3,d=4;
		int e=a++ + ++b + c - --d + --b;
		System.out.println(e);
		System.out.println(a+=10);
		System.out.println(b*=2);
		c-=2;
		d*=3;
		a=b+d;
		int k=a++ + ++b + c - --d + -- b;
		System.out.println(k);
		b/=2;
		d=a+c;
		a/=3;
		int j=a++ + ++b + c - --d + --b;
		System.out.println(j);
	}
}