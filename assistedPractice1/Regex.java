package assistedPractice1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
	public static void main(String[] args) {
        
        String emailRegex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);

      
        String inputEmail = "example@email.com";
        Matcher matcher = pattern.matcher(inputEmail);
        
        if (matcher.matches()) {
            System.out.println(inputEmail + " is a valid email address.");
            System.out.println("Username: " + matcher.group(1));
            System.out.println("Domain: " + matcher.group(2));
        } 
        else {
            System.out.println(inputEmail + " is not a valid email address.");
        }
    }
	
}
