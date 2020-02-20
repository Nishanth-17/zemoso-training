package practice.oopsconcepts;

//encapsulation is a technique for binding data members and methods together and also 
//protecting data from misuse by the outside world.

class Human {

//attributes of human object(Instance variables)
private String name;
private int age;
private double height;
private int weight;
private int handsandlegs=2;


//setter and getter methods for instance variables
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setHeight(double height) {
	this.height=height;
}
public double getHeight() {
	return height;
}
public void setWeight(int weight) {
	this.weight=weight;
}
public int getWeight() {
	return weight;
}
public int getHandsandLegs() {
	return handsandlegs;
}

//behavior or functionality of humans
public void walk() {
	System.out.println("Human can walk");
}
public void eat() {
	System.out.println("Humans can eat");
}
public void sleep() {
	System.out.println("Humans can sleep");
}
}


public class humanclass{
	public static void main(String args[])
	{
		Human h1=new Human();
		Human h2=new Human();
		h1.setAge(20);
		h1.setWeight(50);
		h2.setName("MIKE");
		System.out.println("h1 age is "+h1.getAge());
		System.out.println("h1 weight is "+h1.getWeight());
		System.out.println("Number of hands&legs: "+h1.getHandsandLegs());
		h1.eat();
	}
}
