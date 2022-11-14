package com.jsp.inheritance;

class Whatsapp1{
	public void sendMessage() {
		System.out.println("send message");
	}
}
class Whatsapp2 extends Whatsapp1{
	public void sendVoicemessage() {
		System.out.println("send voice message");
	}
}
class Whatsapp3 extends Whatsapp2{
	public void videoCall() {
		System.out.println("video call");
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
		Whatsapp1 obj1=new Whatsapp1();
		obj1.sendMessage();
		System.out.println("------------------------");
		Whatsapp2 obj2=new Whatsapp2();
		obj2.sendMessage();
		obj2.sendVoicemessage();
		System.out.println("------------------------");
		Whatsapp3 obj3=new Whatsapp3();
		obj3.sendMessage();
		obj3.sendVoicemessage();
		obj3.videoCall();
	}

}
