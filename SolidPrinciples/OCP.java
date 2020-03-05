package practice.SolidPrinciples;
/*
class Mobile{
	public void displayPrice(String Mobilename) {
		if(mobilename.equals("Apple iPhone X")) {
			System.out.println("5.8 inch display");
			System.out.println("FHD resolution");
			System.out.println("3500 mAH Battery");
			System.out.println("Price is: 97000");
		}
		if(mobilename.equals("OnePlus 7")) {
			System.out.println("6.6 inch display");
			System.out.println("FHD resolution");
			System.out.println("4000 mAH Battery");
			System.out.println("Price is: 42000");
		}
	}
}
public class OCP {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.displayPrice("Apple iPhone X");
	}
}
*/

//OPEN CLOSED PRINCIPLE
class Mobile{
	protected String mobileName;
	Mobile(String mobileName){
		this.mobileName=mobileName;
	}
	public void features() {
		//System.out.println("6.0 inch display");
		//System.out.println("HD resolution");
		//System.out.println("3000 mAH Battery");
	}
	public void displayPrice() {	
		//System.out.println("Price of "+ mobileName +" : "+ 10000);
	}
}
class Apple extends Mobile{
	Apple(String mobileName) {
		super(mobileName);
	}
	public void features() {
		System.out.println("6.3 inch display");
		System.out.println("FHD resolution");
		System.out.println("3500 mAH Battery");
	}
	public void displayPrice() {
		System.out.println("Price of "+mobileName+" : "+97000);
	}
}
class Oneplus extends Mobile{
	Oneplus(String mobileName) {
		super(mobileName);
	}
	public void features() {
		System.out.println("6.6 inch display");
		System.out.println("FHD resolution");
		System.out.println("4000 mAH Battery");
	}
	public void displayPrice() {
		System.out.println("Price of "+mobileName+" : "+42000);
	}
}

public class OCP {
	public static void main(String[] args) {
		System.out.println(args[1]);
		Apple iphone=new Apple("iPhone X");
		iphone.features();
		iphone.displayPrice();
		Oneplus oneplus=new Oneplus("OnePlus 7");
		oneplus.features();
		oneplus.displayPrice();
	}
}