
package practice.oopsconcepts;

//DIP
interface ILogger{
	public void loginfo();
}
class Logger implements ILogger{
	@Override
	public void loginfo() {
		System.out.println("Logging to files...");
	}
}
class LogToFile{
	ILogger l;
	public LogToFile(ILogger l) {
		this.l=l;
	}
	public void logging() {
		l.loginfo();
	}
}
class oop{
	public static void main(String args[])
	{
		LogToFile logg=new LogToFile(new Logger());
		logg.logging();
	}
}


//Delegation Principle
/*
interface Printer{
	public void print();
	
}
class CanonPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("Message from canon printer");
	}
}
class HpPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("Message from hp printer");
	}
}

//This is a delegator class for Printer
class Controller implements Printer{
	Printer t;
	public Controller(Printer t)
	{
		this.t=t;
	}
	@Override
	public void print()
	{
		t.print();
	}
}
*/
/*
//DRY principle
class office {
	public void bybus() {
		int ret=commonfunctionalities();
		System.out.println("Take a bus and reach office with cost:"+ (int)(ret));
	}
	public void bymetro() {
		int ret=commonfunctionalities();
		int bk=20;
		System.out.println("Take a metro and reach office with cost:"+ (int)(ret+bk));
	}
	public int commonfunctionalities() {
		int t=10;
		int b=20;
		System.out.println("Initial cost:"+ (int)(t+b));
		return t+b;
	}
}
public class oop{
	public static void main(String args[]) throws IOException
	{
		office obj=new office();
		int ch=3;
		if(ch==1)
			obj.bybus();
		else
			obj.bymetro();
	}
}
*/
/*
//Abstraction
abstract class laptop{
	abstract long getid();
	public void getname() {
		System.out.println("LAPPY");
	}
}
class dell extends laptop{
	public void getname() {
		System.out.println("LENOVO");
	}
	@Override
	public long getid() {
		return 11;
	}
}
class op{
	private int ac=10;
	public void setac(int ac)
	{
		this.ac=ac;
		System.out.println(this.ac);
	}
}
class oop{
	public static void main(String args[])
	{
		op obj=new op();
		obj.setac(10);
		dell d=new dell();
		System.out.println(d.getid());
	}
}
*/


//RunTime Polymorphism
/*class bike{
	public void getmanufacturer() {
		System.out.println("BMW");
	}
	public void getengine() {
		System.out.println("Engine: RR");
	}
}
class ktm extends bike{
	public void getengine() {
		System.out.println("ENgine: 390");
	}
	public void getprice() {
		System.out.println("price: 3");
	}
}
class tvs extends bike{
	public void getengine() {
		System.out.println("Engine: 310");
	}
}
class oop{
	public static void main(String args[])
	{
		bike b=new tvs();
		bike b1=new ktm();
		b1.getengine();
		b.getengine();
	}
}*/


//Aggregation
/*class company{
	String name;
	String location;
	public int getemplist(employee e)
	{
		return e.empno;
	}
}
class employee{
	int empno;
	public employee(int empno)
	{
		this.empno=empno;
	}
	public int empnum()
	{
		return empno;
	}
}
public class oop{
	public static void main(String args[])
	{
		employee e=new employee(100);
		company c=new company();
		int ed=c.getemplist(e);
		System.out.println(ed);
	}
}*/

//access modifiers
/*class oops{
	final int n=10;
	protected static int a=20;
	private int b=100;
	protected int getval()
	{
		return b;
	}
	protected void sum()
	{
		a=80;
	}
	
}
public class oop extends oops{
	
	public static void main(String args[])
	{
		oop d=new oop();
		d.sum();
		a=40;	
		System.out.println();
		System.out.println(d.getval());
	}
}*/
