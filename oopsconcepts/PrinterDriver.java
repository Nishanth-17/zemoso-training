package practice.oopsconcepts;

public class PrinterDriver {
	public static void main(String[] args) {
		Controller con=new Controller(new CanonPrinter());
		con.print();
	}
}
