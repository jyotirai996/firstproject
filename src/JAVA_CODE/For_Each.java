package JAVA_CODE;

import java.util.ArrayList;

class sum	 
{ 
	
	/*public static void sumofarray(int[] numbers) 
	{ 
		int sum=0;
		
		// for each loop 
		for (int num : numbers) 
		{ 
			 sum +=num;
		} 
System.out.print("sum of array1:"+sum);
	} */
	public static void main(String[] arg) 
	{ 
		/*int[] marks = { 125, 132, 95, 116, 110 }; 
		sumofarray(marks);*/
		
		ArrayList<String> aasish = new ArrayList<String>();
		
		aasish.add("Geeks");
		//aasish.add("for");
		aasish.add("Geeks");
		aasish.add(1,"for");
		System.out.println(aasish);
		for(String jyoti : aasish)
		{
			System.out.print(jyoti + " ");
		}
		
		
	}
	
}
 