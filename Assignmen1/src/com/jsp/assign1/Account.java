package com.jsp.assign1;

public class Account {
	
	static String bank_name="State Bank of India";
	
	String user_name;
	long account_number;
	String ifsc_code;
	
	public Account(String user_name,int account_number,String ifsc_code)
	{
		this.user_name=user_name;
		this.account_number=account_number;
		this.ifsc_code=ifsc_code;
	}
	public void getDetails() {
		System.out.println(bank_name);
		System.out.println(user_name);
		System.out.println(account_number);
		System.out.println(ifsc_code);
	}
	public static void main(String[] args) {
		Account obj=new Account("Ambarish",489975356,"SBI0464");
		obj.getDetails();
	}

}
