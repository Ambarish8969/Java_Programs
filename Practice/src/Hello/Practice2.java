package Hello;
class A1{
    public A1(int a,int b){
        super();
        System.out.println(a+b);
    }
}
class B extends A1{
    public B(int c, int d){
        super(4,5);
        System.out.println(c-d);
    }
}
public class Practice2 {
	public static void main(String[] args) {
		System.out.println("Hello ambi");
		 B obj1=new B(3,1);
//	     obj1.sub(3,1);
	} 
} 