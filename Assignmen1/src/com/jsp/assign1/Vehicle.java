package com.jsp.assign1;

import java.util.Scanner;

public class Vehicle {
	
	String name;
	int modle;
	String vehicle_number;
	
	public Vehicle(String name,int modle,String vehicle_number) {
		this.name=name;
		this.modle=modle;
		this.vehicle_number=vehicle_number;
	}
	
	public void showVehicleDetails() {
		System.out.println(name);
		System.out.println(modle);
		System.out.println(vehicle_number);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.next();
		int modle=input.nextInt();
		String vehicle_number=input.next();
		Vehicle obj=new Vehicle(name,modle,vehicle_number);
		obj.showVehicleDetails();
		input.close();
	}

}
