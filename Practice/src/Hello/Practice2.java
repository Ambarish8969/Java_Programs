package Hello;

class Practice2 {
	@Override
	public void finalize() {
		System.out.println("Object is Removing.");
	}
	
	public static void main(String[] args){
		Practice2 p1=new Practice2();
		p1=null;
		System.gc();
		System.out.println("Object is Removed.");
		
	} 
} 