package com.jsp.assign1;

public class EmployeeRegister {
	String emp_name;
	String emp_email;
	long emp_phno;
	int emp_id;
	int emp_experience;
	
	public EmployeeRegister(String emp_name,String emp_email,int emp_id,int emp_experience) {
		this.emp_name=emp_name;
		this.emp_email=emp_email;
		this.emp_id=emp_id;
		this.emp_experience=emp_experience;
	}
	public EmployeeRegister(String emp_name,long emp_phno,int emp_id,int emp_experience) {
		this.emp_name=emp_name;
		this.emp_phno=emp_phno;
		this.emp_id=emp_id;
		this.emp_experience=emp_experience;
	}
	public void getDetails() {
		if(emp_phno==0) {
			System.out.println(emp_name);
			System.out.println(emp_email);
			System.out.println(emp_id);
			System.out.println(emp_experience);
		}else {
			System.out.println(emp_name);
			System.out.println(emp_phno);
			System.out.println(emp_id);
			System.out.println(emp_experience);
		}
	}
	public static void main(String[] args) {
		EmployeeRegister obj=new EmployeeRegister("Ambarish",9900408969l,46589,10);
		obj.getDetails();	
	}

}
