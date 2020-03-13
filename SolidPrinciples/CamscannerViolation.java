package practice.SolidPrinciples;

class CameraImage{
	private String timeStamp;
	private String storageLocation;
	public String getTimeStamp() {
		return timeStamp;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public void clickPhoto() {
		System.out.println("Capture a photo");
	}
	public void shootVideo() {
		System.out.println("Shoot a video");
	}
	public void saveImage() {
		System.out.println("Save the image");
	}
	public void showImage() {
		System.out.println("Display the image");
	}
	//EditorImage class should be here(SRP violation)
	public void cropImage() {
		System.out.println("Crop the Image");
	}
	public void rotateImage(int angle) {
		System.out.println("Rotate the image by "+ angle +" degrees");
	}
	public void applyBlackAndWhite() {
		System.out.println("Apply Black & White Filter over the image");
	}
	public void applyLighten() {
		System.out.println("Apply lighten filter over the image");
	}
	//image is being modified here(OCP violation)
	public void applyFilter() {
		System.out.println("Apply filters on the image");
		applyBlackAndWhite();
		applyLighten();
	}
	public void zoomIn() {
		System.out.println("Image Zoom in");
	}
	public void zoomOut() {
		System.out.println("Image Zoom out");
	}
}

//LSP violation
class Previewimage extends CameraImage{
	//In preview we cannot take a photo or shoot a video
	public void makeChanges() {
		System.out.println("Make modifications to the image");
	}
}
//ISP violation
interface Format{
	public void wordFormat();
	public void pdfFormat();
	//
}
class ShareImageFormat implements Format{
	public void wordFormat() {
		System.out.println("Share Image in Word format");
	}
	public void pdfFormat() {
		System.out.println("Share Image in PDF format");
	}
}
//DIP violation
//Low level classes
class gmal{
	public void shareViaGmail() {
		System.out.println("Share via GMail");
	}
}
class whatsap{
	public void shareViaWhatsapp() {
		System.out.println("Share via Whatsapp");
	}
}
//High level class
class ShareImage{
	gmal g;
	public void shareImage(gmal g) {
		g.shareViaGmail();
	}
}

public class CamscannerViolation {

	public static void main(String[] args) {
		CameraImage c=new CameraImage();
		c.clickPhoto();
		c.saveImage();
		c.cropImage();
		c.applyFilter();
		Previewimage p=new Previewimage();
		//p.clickPhoto(); It cannot do it, so it violates the Liskov substitution principle
		ShareImageFormat s=new ShareImageFormat();
		s.pdfFormat();
		ShareImage si=new ShareImage();
		gmal g=new gmal();
		si.shareImage(g);

	}

}
