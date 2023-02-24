package Hello;

abstract class Shape{
	int length,height;
	abstract void printArea();
}
class Rectangle extends Shape{
	@Override
	void printArea() {
		System.out.println("Rectangle : "+length*height);
	}
}
class Triangle extends Shape{

	@Override
	void printArea() {
		System.out.println("Triangle : "+length*height);
	}
	
}
class Circle extends Shape{

	@Override
	void printArea() {
		System.out.println("Circle : "+length*height);
	}
	
}
public interface Practice {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		Circle c1=new Circle();
		r1.printArea();
		t1.printArea();
		c1.printArea();
	}
}
