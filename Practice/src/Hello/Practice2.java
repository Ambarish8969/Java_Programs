package Hello;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class User{
	private String name;
	private int id;
	private String password;
	private long phno;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public User(String name,int id,String password,long phno) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.phno=phno;
	}
	
}

class Practice2 {
	public static void main(String[] args){
		User u1=new User("Ambi",101,"ambi@00",48979865);
		User u2=new User("Ambika",102,"ambika@00",7894564);
		User u3=new User("Aish",103,"aisha@00",11231344);
		User u4=new User("Raki",104,"raki@00",784435698);
		
		Map<User,Integer> m1=new TreeMap<User,Integer>();
		m1.put(u1,u1.getId());
		m1.put(u2,u2.getId());
		m1.put(u3, u3.getId());
		m1.put(u4, u4.getId());
		
		Set<User> key=m1.keySet();
		System.out.println(m1);

	} 
} 