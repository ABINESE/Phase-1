package assistedPractice1;

class Modifier{
	public int public_var=12;
	private int private_val=15;
	protected int protected_val=18;
	
	public void public_met()
	{
		System.out.println("public method is excuted");
	}
	private void private_met()
	{
		System.out.println("private method is excuted");
	}
	protected void protected_met()
	{
		System.out.println("protected method is excuted");
	}
	void dispaly()
	{
		System.out.println(private_val);
		private_met();
		
	}
}
public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Modifier mod=new Modifier();
       System.out.println(mod.public_var);
       System.out.println(mod.protected_val);
      
       mod.protected_met();
       mod.public_met();
       System.out.println("--Private members is excuted--");
       mod.dispaly();
	}

}
