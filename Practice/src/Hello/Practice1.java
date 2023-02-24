package Hello;

class Sample{
	synchronized public void method1() {
		for(int i=0;i<5;i++) {
			System.out.println("method 1");
		}
	}
	synchronized public void method2() {
		for(int i=0;i<5;i++) {
			System.out.println("method 2");
		}
	}
	
}
class Demo1 extends Thread{
	Sample s1;
	
	public Demo1(Sample s1) {
		this.s1=s1;
	}
	
	@Override 
	public void run() {
		s1.method1();
	}
}
class Demo2 extends Thread{
	Sample s2;
	
	public Demo2(Sample s2) {
		this.s2=s2;
	}
	
	@Override 
	public void run() {
		s2.method2();
	}
}
public class Practice1{
	public static void main(String[] args) {
		Sample s3=new Sample();
		Demo1 d1=new Demo1(s3);
		Demo2 d2=new Demo2(s3);
		d1.start();
		d2.start();
	}
}