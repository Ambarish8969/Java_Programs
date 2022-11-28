package com.jsp.interface1;

interface Post{
	public abstract void like();
	public abstract void comment();
	public abstract void share();
}
interface PhotoEdit{
	public abstract void addSong();
}
interface VideoEdit{
	public abstract void mute();
	public abstract void addSong();
}
class Photo implements PhotoEdit,Post{
	int size=5;
	public void like(){
		System.out.println("Photo liked");
	}
	public void comment() {
		System.out.println("Photo commented");
	}
	public void share() {
		System.out.println("Photo shared");
	}
	public void addSong() {
		System.out.println("Photo Song Added");
	}
	public void crop() {
		System.out.println("Photo Cropped");
	}
	public void filter() {
		System.out.println("Photo Filtered");
	}
}
class Video implements VideoEdit,Post{
	int duration=1;
	public void like(){
		System.out.println("Video liked");
	}
	public void comment() {
		System.out.println("Video commented");
	}
	public void share() {
		System.out.println("Video shared");
	}
	public void addSong() {
		System.out.println("Video Song Added");
	}
	public void mute() {
		System.out.println("Video Muted");
	}
	public void time() {
		System.out.println("Video time");
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Photo obj1=new Photo();
		obj1.crop();
		obj1.filter();
		obj1.addSong();
		obj1.like();
		obj1.comment();
		obj1.share();
		System.out.println("=============================");
		Video obj2=new Video();
		obj2.time();
		obj2.mute();
		obj2.addSong();
		obj2.like();
		obj2.comment();
		obj2.share();
	}
}
