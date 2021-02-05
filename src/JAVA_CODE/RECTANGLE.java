package JAVA_CODE;

import java.util.Scanner;

/*public class RECTANGLE {
	int width;
	int height;
	 void display(int width,int height) {
		
	System.out.println(width+" "+height) ;
	
	}
}
	
 class RECTANGLEAREA extends RECTANGLE{
	 double area;
	 void read_input() {
		int height=12;
		int width=9;
		 super.display(width, height);
			//super.QUALITY();	
			area =height*width;
	System.out.println(area);
		
		}
	void display() {
		
		this.read_input();
	
	}

}
 
 class main{
 public static void main(String[] args)
	
	{
		
	 RECTANGLEAREA a1= new RECTANGLEAREA();
	 //RECTANGLEAREA a1= new RECTANGLEAREA();
		
		a1.display();
		
	}
	}*/








class Calculator{

	public double power(int n, int p) {
		// TODO Auto-generated method stub
		double calc=0;
		if(n<0&&p<0)
		{
			System.out.println("n and p should be positive");
		}
		else {
		 calc=Math.pow(n,p);
		}
		return calc;
	}
	
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                double ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
















