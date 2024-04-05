package CameraRentalApplication;

public class CameraInfo {
private String camerBrand;
private String cameraModel;
private int cameraId;
private static int cameraUniqueId=0;
private boolean isrented=false;
private double rentPerday;
public CameraInfo(String camerBrand, String cameraModel, double rentPerday) {
	super();
	this.camerBrand = camerBrand;
	this.cameraModel = cameraModel;
	this.cameraId = ++cameraUniqueId;
	this.rentPerday=rentPerday;
	this.isrented=false;
}
public String getCamerBrand() {
	return camerBrand;
}
public void setCamerBrand(String camerBrand) {
	this.camerBrand = camerBrand;
}
public String getCameraModel() {
	return cameraModel;
}
public void setCameraModel(String cameraModel) {
	this.cameraModel = cameraModel;
}
public int getCameraId() {
	return cameraId;
}
public void setCameraId(int cameraId) {
	this.cameraId = cameraId;
}
public boolean isIsrented() {
	return isrented;
}
public void setIsrented(boolean isrented) {
	this.isrented = isrented;
}
public double getRentPerday() {
	return rentPerday;
}
public void setRentPerday(int rentPerday) {
	this.rentPerday = rentPerday;
}

}
