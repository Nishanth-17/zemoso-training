package practice.SolidPrinciples;


/*
class Scooter{
	void topSpeed() {
	}
	void fuelType() {
	}
}
class Activa extends Scooter{
	void fuelType() {
		System.out.println("Petrol");
	}
	void topSpeed() {
		System.out.println(80);
	}
}
class Ather extends Scooter{
	void fuelType() {
		System.out.println("They do not have fuel, they run on battery");
	}
	void topSpeed() {
		System.out.println(40);
	}
}
public class LSP {

	public static void main(String[] args) {
		Ather bs=new Ather();
		bs.fuelType();	
	}
}
*/

//LISKOV'S SUBSTITUTION PRINCIPLE
class Scooter{
	void topSpeed() {
	}
	void fuelType() {
	}
}
class Batteryscooter{
	void noFuel() {
		//This vehicle requires no fuel
	}
	void topSpeed() {
		//Provide the top speed 
	}
}
class Activa extends Scooter{
	public void topSpeed() {
		System.out.println(100);
	}
	public void fuelType() {
		System.out.println("Petrol");
	}
}
class Ather extends Batteryscooter{
	public void topSpeed() {
		System.out.println(80);
	}
	public void noFuel() {
		System.out.println("Vehicle runs on Battery");
	}
}
public class LSP {

	public static void main(String[] args) {
		Activa scooty1=new Activa();
		scooty1.fuelType();
		scooty1.topSpeed();
		Ather scooty2=new Ather();
		scooty2.noFuel();
		scooty2.topSpeed();
	}
}





