package practice.SolidPrinciples;

/*
class Quora{
	public void uploadToQuora() {
		System.out.println("Uploaded to Quora");
	}
}
class Medium{
	public void uploadToMedium() {
		System.out.println("Uploaded to Medium");
	}
}
class Article{
	Quora q;
	Medium m;
	void uploadArticle(q){
		q.uploadToQuora();
	}
	void uploadArticle(m) {
		m.uploadToMedium();
	}
}
public class DIP {

	public static void main(String[] args) {
		Article ar=new Article();
		Quora quoraweb=new Quora();
		ar.uploadArticle(quoraweb);
	}

}

*/
interface Upload{
	void upload();
}

class Quora implements Upload{
	public void upload() {
		System.out.println("Uploaded to Quora");
	}
}
class Medium implements Upload{
	public void upload() {
		System.out.println("Uploaded to Medium");
	}
}
class Article{
	//Upload up;
	//public Article(Upload up) {
		//this.up=up;
	//}
	void uploadArticle(Upload up) {
		up.upload();
	}
}

public class DIP {

	public static void main(String[] args) {
		Article article1=new Article();
		article1.uploadArticle(new Quora());
		article1.uploadArticle(new Medium());
	}

}
