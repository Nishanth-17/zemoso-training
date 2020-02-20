package practice.oopsconcepts;


//Hierarchial Inheritance
class Watch{
	private int hour;
	private int minutes;
	private int seconds;
	public void setHour(int hour) {
		this.hour=hour;
	}
	public void setMinutes(int minutes) {
		this.minutes=minutes;
	}
	public void setSeconds(int seconds) {
		this.seconds=seconds;
	}
	public void displayTime() {
		System.out.println("Time:  "+hour+" : "+minutes+" : "+seconds);
	}
}
class ChainWatch extends Watch{
	public void displayWatchType() {
		System.out.println("Chain");
	}
}
class StrapWatch extends Watch{
	public void displayWatchType() {
		System.out.println("Strap");
	}
}

public class Watches {

	public static void main(String[] args) {
		ChainWatch watch1=new ChainWatch();
		StrapWatch watch2=new StrapWatch();
		watch1.setHour(6);
		watch1.setMinutes(30);
		watch1.setSeconds(25);
		watch1.displayWatchType();
		watch1.displayTime();
		watch2.setHour(2);
		watch2.setMinutes(45);
		watch2.setSeconds(55);
		watch2.displayWatchType();
		watch2.displayTime();
		
	}

}
