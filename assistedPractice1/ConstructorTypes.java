package assistedPractice1;

public class ConstructorTypes {
public ConstructorTypes()
{
	System.out.println("Default Constructor is executed");	
	}
public ConstructorTypes(String str)
{System.out.println("Parametr constructor is executed");	
	}
public ConstructorTypes( ConstructorTypes object)
{System.out.println("Copy constructor is executed");
	}

public static void main(String[] args)
{
	ConstructorTypes con=new ConstructorTypes();
	ConstructorTypes con1=new ConstructorTypes("para");
	ConstructorTypes con2=new ConstructorTypes(con1);


}
}
