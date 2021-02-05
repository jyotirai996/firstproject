package JAVA_MAIN;

public class Childclass implements Ex_Interface{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void minus() {
		
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
public void multiply() {
		
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}

}
class jyotiii
{
	public static void main(String[] args)
	{
		Childclass c=new Childclass();
		c.add();
		c.multiply();
	}
}
