package Hello;

class Email{
	private static String emailid;
	private String password;
	
	public Email(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
class Email2{
	String email_id;
	String password;
	
	public void printDetails() {
		System.out.println(email_id+" "+password);
	}
}
public class Practice1{
	
	public static void main(String[] args) {
		Email email=new Email("ambi@gmail.com","ambi@00");
	   email.getEmailid();
		System.out.println(email.getEmailid()+" "+email.getPassword());
		
		Email2 email2=new Email2();
		email2.email_id="ambika@gmail.com";
		email2.password="ambika@00"; 
		System.out.println(email2.email_id+" "+email2.password);
//		Email2.email_id;
		
	}
}