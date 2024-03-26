package assistedPractice1;

public class MethodsCalling {
 public static void StaticMethod()
 {
 System.out.println("Static Method is Executed");	
 }
  
 public void InstanceMethod() {
	 System.out.println("InstanceMethod is executed");	
 }
 
 public int ReturnInstanceMethod()
 {
	 return 50;
 }
 
 public void ParameterMethod(String str) {
	 System.out.println("parameter is"+str);	
 }
 
public static void main(String[] args)
 {
	 MethodsCalling method=new MethodsCalling();
	 MethodsCalling.StaticMethod();
	 method.InstanceMethod();
	 int m= method.ReturnInstanceMethod();
	 method.ParameterMethod("Parameter");
	 System.out.println(m);	
 }
}
