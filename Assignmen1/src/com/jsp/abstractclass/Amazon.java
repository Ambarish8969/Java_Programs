package com.jsp.abstractclass;

abstract class Amazon1{

	public abstract void login();
}

class CustomerLogin extends Amazon1{
	String username;
	String password;
	
	public CustomerLogin(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	@Override
	public void login() {
		if(username=="ambarish") {
			if(password=="ambi@00") {
				System.out.println("Customer LoggedIn Successfully");
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid Username");
		}
	}
}
class EmployeeLogin extends Amazon1{
	
	String empId;
	String empPassword;
	
	public EmployeeLogin(String empId,String empPassword) {
		this.empId=empId;
		this.empPassword=empPassword;
	}
	
	@Override
	public void login() {
		if(empId=="ajfk45") {
			if(empPassword=="emp@00") {
				System.out.println("Employee Successfully loggedIn");
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid empId");
		}
	}
}
public class Amazon {

	public static void main(String[] args) {
		CustomerLogin obj1=new CustomerLogin("ambarish","ambi@00");
		obj1.login();
		EmployeeLogin obj2=new EmployeeLogin("ajfk45","emp@00");
		obj2.login();
	}

}
