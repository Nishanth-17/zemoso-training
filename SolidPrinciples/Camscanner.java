package practice.SolidPrinciples;
// SRP
class Camera{
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
}

class EditorImage{
	protected void cropImage() {
		System.out.println("Crop the Image");
	}
	protected void rotateImage(int angle) {
		System.out.println("Rotate the image by "+ angle +" degrees");
	}
	protected void applyBlackAndWhite() {
		System.out.println("Apply Black & White Filter over the image");
	}
	protected void applyLighten() {
		System.out.println("Apply lighten filter over the image");
	}
}
//OCP
class Image extends EditorImage{
	private String size;
	private String dimensions;
	public String getSize() {
		return size;
	}
	public String getDimensions() {
		return dimensions;
	}
	public Image zoomIn() {
		System.out.println("Image Zoom in");
		return new Image();
	}
	public void zoomOut() {
		System.out.println("Image Zoom out");
	}
	public void applyFilter() {
		System.out.println("Apply filters on the image");
		super.applyBlackAndWhite();
		super.applyLighten();
	}
}
//LSP
class PreviewImage extends Image{
	//Co-variant return type
	public PreviewImage zoomIn() {
		System.out.println("Using Covariant return type : Preview Image zoom in");
		return new PreviewImage();
	}
	public void makeChanges() {
		System.out.println("Make modifications to the image");
	}
}

//ISP
interface WordFormat{
	public void saveInWordFormat();
}
interface PDFFormat{
	public void saveInPdfFormat();
}
class ImageFormat implements PDFFormat{
	public void saveInPdfFormat() {
		System.out.println("Save and Share Image in PDF format");
	}
}
//DIP
interface Shareable{
	public void share();
}
class Gmail implements Shareable{
	public void share() {
		System.out.println("Share via GMail");
	}
}
class Whatsapp implements Shareable{
	public void share() {
		System.out.println("Share via Whatsapp");
	}
}
class ImageShare{
	Shareable ShareObj;
	ImageShare(Shareable ShareObj){
		this.ShareObj=ShareObj;
	}
	public void shareImage() {
		ShareObj.share();
	}
}

public class Camscanner {

	public static void main(String[] args) {
		Camera cam=new Camera();
		cam.clickPhoto();
		cam.saveImage();
		Image image=new Image();
		image.cropImage();
		image.rotateImage(180);
		image.applyFilter();
		PreviewImage pe=new PreviewImage();
		PreviewImage i=pe.zoomIn();
		i.applyLighten();
		ImageFormat imageFormat=new ImageFormat();
		imageFormat.saveInPdfFormat();
		ImageShare imageShare=new ImageShare(new Whatsapp());
		imageShare.shareImage();
	}
}
