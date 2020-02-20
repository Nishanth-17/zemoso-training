package practice.oopsconcepts;

public interface Tablet {
	double size=9.2;
	void ram(int ramsize);
	void rom(int romsize);
	String ScreenRefreshRate="90Hz";
	default void processorVersion() {
		System.out.println("SnapDragon or Mediatek");
	}
}

