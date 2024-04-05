package CameraRentalApplication;

public class Authentication {
private String username;
private String password;
public Authentication(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public boolean login(String username, String password)
{
	if(username.equals("admin") && password.equals("admin123"))
		return true;
	return false;
}
}
