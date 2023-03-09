package Hello;

import java.util.ArrayList;
import java.util.HashSet;

class A {
	String name;
	int age;
	int marks;
	
	public A(String name,int age,int marks) {
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "name = "+name+" age = "+age+" marks = "+marks;
	}
	
}

class Practice2{
	
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Ambika");
		System.out.println(sb.hashCode());
		sb=sb.append("Nisha");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println("--------------------------------");
		sb=new StringBuffer("Ambi");
		System.out.println(sb.hashCode());
		sb=sb.append("ambu");
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}

} 