package Hello;

class Sample extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
public class Practice1 extends Thread{
	@Override
	public void run() {
		for(int i=4;i>=0;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Sample s1=new Sample();
		Practice1 p1=new Practice1();
		s1.start();
		//System.out.println("-----------------------------");
		p1.start();
		//System.out.println("-----------------------------");
		//obj1.method2();
	}
}