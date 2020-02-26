package practice.SolidPrinciples;

/*
interface Jobopenings{
	public void developer();
	public void QAEngineer();
	public void marketing();
}
class InterestedJobs implements Jobopenings{
	public void developer() {
		System.out.println("Dev openings");
	}
	public void QAEngineer() {
		System.out.println("QA openings");
	}
	public void marketing() {
		System.out.println("Marketing Openings"); 
	}
}
public class ISP {

	public static void main(String[] args) {
		InterestedJobs ij=new InterestedJobs();
	}

}
*/

interface Developeropenings
{
	public void developer();
}
interface QAEngineeropenings
{
	public void QAEngineer();
}
interface Marketingopenings
{
	public void marketing();
}
class InterestedJobs implements Developeropenings, Marketingopenings
{
	public void developer() {
		System.out.println("Developer openings available");
	}
	public void marketing() {
		System.out.println("Marketing openings available");
	}
}
class ISP{
	public static void main(String args[]) {
		InterestedJobs ij=new InterestedJobs();
		ij.developer();
		ij.marketing();
	}
}
	





