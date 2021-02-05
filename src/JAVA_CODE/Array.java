package JAVA_CODE;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Array {

	public static void main(String[] args)  {
		
		/*int[] marks = {100,20,90,120,170,10};
		int max= marks[0];//max=100
		
		for(int rasmalai : marks) {
		
			if(rasmalai > max) {
				
				max= rasmalai; 
			}
		}
		
		System.out.println("Maximum:" +max);*/
		
		/*int fact;
		ArrayList joe =new ArrayList();
		for (int i=0;i<=5;i++)
		{
			joe.add(i);
		}
		
		
		System.out.println(joe);
		ListIterator l1=joe.listIterator();
		
		while(l1.hasNext())
		{
			int e=(Integer)l1.next();
			fact=1;
			if(e==0)
			{
				l1.set(1);
			}
			else if(e>2) {
				
				for(int j=1;j<=e;j++) {
					fact = fact*j;
					
				}
				l1.set(fact);
				
			}
		}
		System.out.println("end");
		int j=2/0;
		System.out.println(j);
		System.out.println(Collections.max(joe));
		
	}*/
		/*String s="rani";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer(s);
		sb.append("rai");
		sb1.append("rai");
		int i=sb.hashCode();
		int j =sb1.hashCode();
		System.out.println(i+" "+j);
		if (sb.hashCode()==sb1.hashCode())
		{
			System.out.println("same");
			
		}
		else
		{
			System.out.println("diff");
		}
		
		*/
		/*
		ArrayList al=new ArrayList();
		for (int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				al.add(i);
			}
			
		}
		System.out.println(al);*/
		
		
		
	/*	String s= "jyoti<separated>rai<separated>24";
		String[] se=s.split("\\<separated>");
		for(int i=0;i<=2;i++)
		{
		String s3= se[i];
		System.out.println(s3);
		}*/
		/*char sb1 = 0;
		char[] sb =s.toCharArray();
	for(int i=sb.length-1;i>=0;i--)
	{
		char sb2=sb[i];
	System.out.print(sb2);
	
	}
		*/
	LinkedList	ll= new LinkedList ();
	for (int i=0;i<=5;i++)
	{
		if(i<=5)
		{
		ll.add(i);
		}
		ll.add(i);
	}
	ll.add(6);
	System.out.println(ll);
	LinkedList	l2= new LinkedList ();
	Integer old=(Integer) ll.get(0);
	for (int j=0;j<ll.size();j++)
	{
		Integer neww=(Integer) ll.get(j);
		
		//System.out.println(neww);	
		if(old.equals(neww))
		{
			ll.remove(neww);
		
			//System.out.println(ll);	
			
		}
		
		
		
		//System.out.println(old);	
	}
	System.out.println(ll);	
	}
}
