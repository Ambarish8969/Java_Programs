package com.jsp.inheritance;

class Account{
	long accno;
	double bal;
	String owner;
	String ifsc;
	static String bankname="ICICI";
	
	public Account(long accno,double bal,String owner,String ifsc) {
		this.accno=accno;
		this.bal=bal;
		this.owner=owner;
		this.ifsc=ifsc;
	}
	public void showDetails() {
		System.out.println(bankname);
		System.out.println(accno);
		System.out.println(bal);
		System.out.println(owner);
		System.out.println(ifsc);
	}
	
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println("current bal : "+bal+", deposit amt : "+amt);
	}
	public void withdraw(double amt) {
		if(bal>=amt) {
			bal=bal-amt;
			System.out.println("current bal : "+bal+", withdraw amt : "+amt);
		}else {
			System.out.println("Invalid Transaction.");
		}
	}
}
class Savings extends Account{
	double roi=0.005;
	public Savings(long accno,double bal,String owner,String ifsc) {
		super(accno,bal,owner,ifsc);
		showDetails();
		System.out.println("Savings Account");
	}
	public void calculateroi() {
		bal=bal+bal*roi;
	}
}
class Current extends Account{
	double min_bal=50000.0;
	public Current(long accno,double bal,String owner,String ifsc) {
		super(accno,bal,owner,ifsc);
		showDetails();
		System.out.println("Current Account");
	}
	public void showminBal() {
		System.out.println("Minimum bal : "+min_bal);
	}
}
public class MainAccount {

	public static void main(String[] args) {
		Current obj1=new Current(14378411789l,20000.0,"Namrata","ICIC786");
//		obj1.deposit(10000);
//		obj1.withdraw(2000);
//		obj1.showminBal();
		System.out.println("=========================");
		Savings obj2=new Savings(4567841164l,10000.0,"Ambarish","ICIC908");
//		obj2.deposit(3000);
//		obj2.withdraw(1000);
		
	}

}
