package assistedPractice1;

public class OuterClass {
	 private static String staticOuterMessage = "Static Outer Message";
	 private String nonStaticOuterMessage = "Non-Static Outer Message";
	 
	 class InnerClass{
		 void displayMessages() {
	           
	            System.out.println(staticOuterMessage);
	            System.out.println(nonStaticOuterMessage);
	        }
	 }
	 
	 static class StaticNestedClass {
	        void displayMessage() {
	            
	            System.out.println(staticOuterMessage);
	        }
	    }
	 
	 void demonstrateInnerClasses() {

	        InnerClass innerClass = new InnerClass();
	        innerClass.displayMessages();
	        
	       	StaticNestedClass staticNestedClass = new StaticNestedClass();
	        staticNestedClass.displayMessage();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  OuterClass outer = new OuterClass();
	        outer.demonstrateInnerClasses();
	}

}
