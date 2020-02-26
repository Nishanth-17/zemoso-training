package practice.SolidPrinciples;

/*
 * class Purchase{
 * 	private String Name;
	private int ItemId;
	private double price;
	private String Name;
	private String Address;
	private String ContactNo;
	private long CardNumber;
	private String CardName;
	private String ExpiryInfo;
	private int cvv;
	public String getName() {
		return Name;
	}
	public int getItemId() {
		return ItemId;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
	}
	public void setCardName(String cardName) {
		CardName = cardName;
	}
	public void setExpiryInfo(String expiryInfo) {
		ExpiryInfo = expiryInfo;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public void purchaseItem(){
		reviewItemDetails();
		shippingDetails();
		pay();
		placeOrder();
	}
	public void reviewItemDetails() {
		System.out.println("Review Order Details");
	}
	public void shippingDetails(){
		System.out.println("Enter Shipping details");
	}
	public void pay() {
		System.out.println("Proceed for Payment");
	}
	public void placeOrder() {
		System.out.println("Order Placed successfully");
	}
}

public class SRP {

	public static void main(String[] args) {
		Purchase p=new Purchase();
		p.purchaseItem();

	}

}
*/

//SINGLE RESPONSIBILITY PRINCIPLE
class Purchase{
	public void purchaseItem(Itemdetails id,Shippinginformation si,Paymentprocessing pg) {
		id.reviewItemDetails();
		si.shippingDetails();
		pg.pay();
		placeOrder();
	}
	public void placeOrder() {
		System.out.println("Order Placed successfully");
	}
}

class Itemdetails{
	private String Name;
	private int ItemId;
	private double price;
	public String getName() {
		return Name;
	}
	public int getItemId() {
		return ItemId;
	}
	public double getPrice() {
		return price;
	}
	public void reviewItemDetails() {
		System.out.println("Review Order Details");
	}
}


class Shippinginformation{
	private String Name;
	private String Address;
	private String ContactNo;
	public void setName(String name) {
		Name = name;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public void shippingDetails(){
		System.out.println("Enter Shipping details");
	}
}


class Paymentprocessing{
	private long CardNumber;
	private String CardName;
	private String ExpiryInfo;
	private int cvv;
	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
	}
	public void setCardName(String cardName) {
		CardName = cardName;
	}
	public void setExpiryInfo(String expiryInfo) {
		ExpiryInfo = expiryInfo;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public void pay() {
		System.out.println("Proceed for Payment");
	}
}

public class SRP {

	public static void main(String[] args) {
		Itemdetails id=new Itemdetails();
		Shippinginformation si=new Shippinginformation();
		Paymentprocessing pg=new Paymentprocessing();
		Purchase p=new Purchase();
		p.purchaseItem(id,si,pg);

	}

}