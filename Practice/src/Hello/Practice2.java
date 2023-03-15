package Hello;

class Person{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object t) {
		Person p=(Person)t;
		return this.age==p.age;
	}
}

class Practice2 {

	public static void main(String[] args) {
		Person p1=new Person("Ambarish",23);
		Person p2=new Person("Ambika",24);
		
		System.out.println(p1.equals(p2));
	}

}