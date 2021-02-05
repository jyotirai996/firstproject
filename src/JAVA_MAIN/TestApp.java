package JAVA_MAIN;

public class TestApp {
	
	
	
	public static void main(String [] args)
	{
		String s1 ="jyoti";
		int c=s1.length();
		
		String s2="";
		for(int i=c-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			String s3= Character.toString(c1);
			
			 s2=s2+s3;
			//System.out.print(c1);
		}
		System.out.print(s2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   /* int i[] = { 0 };
public static void main(String args[]) {
        int i[] = { 1 };
        alter(i);
        System.out.println(i[0]);
    }
public static void alter(int i[]) {
        int j[] = { 2 };
        i = j;
    }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*public class demoamdocs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(4));
	}
	public static long factorial(int n) {
		if(n==1) return 1;
		return n*factorial(n-1);
	}*/
/*public class AllInOne {

	static int a;
	int b;

	{
		System.out.println("from non static block : " + this.b);
	}

	static {
		a = 50;
		System.out.println("from static block :" + a);
	}

	public void nonStaticMethod() {
		b = 50;
		System.out.println("from non static method : " +b);

	}

	public static void staticMethod() {
		AllInOne.a = 40;
		System.out.println("from static method : " + a);
	}

	public AllInOne() {
		this.b = 100;
		System.out.println("from constructor : " + b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllInOne obj = new AllInOne();		
		
		System.out.println("calling non static variable from main method : " +obj.b);		
		
		obj.nonStaticMethod();
		staticMethod();
		
		System.out.println("calling static variable from main method : " +AllInOne.a);
	}

}
*/


