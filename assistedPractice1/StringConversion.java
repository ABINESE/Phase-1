package assistedPractice1;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String string="Hello";
       StringBuilder stringBuilder=new StringBuilder(string);
       stringBuilder.append(" World");
       System.out.println(stringBuilder);
       
       StringBuffer stringBuffer=new StringBuffer(string);
       stringBuffer.append(" WORLD");
       System.out.println(stringBuffer);
	}

}
