package practice.oopsconcepts;

//CompileTime Polymorphism and RunTime Polymorphism
class Employee{
	private String phoneNumber1,phoneNumber2;
	private String office="Zemoso";
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber1=phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber1,String phoneNumber2) {
		this.phoneNumber1=phoneNumber1;
		this.phoneNumber2=phoneNumber2;
	}
	public void getPhoneNumber() {
		System.out.println("PhoneNumber 1:"+ phoneNumber1 + "\nPhoneNumber 2:"+ phoneNumber2);
	}
	public void getOffice() {
		System.out.println(office);
	}
	public void getWork() {
		System.out.println("Work assigned to an employee");
	}
}
class Manager extends Employee{
	@Override
	public void getWork() {
		System.out.println("Manages a project");
	}
}
class TeamLead extends Employee{
	@Override
	public void getWork() {
		System.out.println("Leads a team of employees");
	}
}
public class Employees {

	public static void main(String[] args) {
		Employee emp1=new Manager();
		emp1.getOffice();
		emp1.setPhoneNumber("9898989898");
		emp1.getWork();
		emp1.getPhoneNumber();
		Employee emp2=new TeamLead();
		emp2.setPhoneNumber("7878787878","3434343434");
		emp2.getWork();
		emp2.getPhoneNumber();
	}

}
