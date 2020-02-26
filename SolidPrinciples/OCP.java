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
	public void features() {
		//System.out.println("6.0 inch display");
		//System.out.println("HD resolution");
		//System.out.println("3000 mAH Battery");
	}
	public void displayPrice(String Mobilename) {	
		//System.out.println("Price of "+ Mobilename +" : "+ 10000);
	}
}
class Apple extends Mobile{
	public void features() {
		System.out.println("6.3 inch display");
		System.out.println("FHD resolution");
		System.out.println("3500 mAH Battery");
	}
	public void displayPrice(String Mobile) {
		System.out.println("Price of "+Mobile+" : "+97000);
	}
}
class Oneplus extends Mobile{
	public void features() {
		System.out.println("6.6 inch display");
		System.out.println("FHD resolution");
		System.out.println("4000 mAH Battery");
	}
	public void displayPrice(String Mobile) {
		System.out.println("Price of "+Mobile+" : "+42000);
	}
}

public class OCP {
	public static void main(String[] args) {
		Apple iphone=new Apple();
		iphone.features();
		iphone.displayPrice("iPhone X");
		Oneplus oneplus=new Oneplus();
		oneplus.features();
		oneplus.displayPrice("OnePlus 7");
	}

}