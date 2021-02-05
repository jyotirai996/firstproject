package JAVA_CODE;

class INPUT
{ 
    protected void getData() 
    { 
        System.out.println("Inside GFG"); 
    } 
} 
class GeeksforGeeks extends INPUT 
{ 
    protected void getData() 
    { 
        System.out.println("Inside GeeksforGeeks"); 
        //System.out.println("Inside GeeksforGeeks"); 
    } 
      
    protected void getValue() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 
  
 class Test 
{ 
    public static void main(String[] args) 
    { 
    	INPUT obj = new GeeksforGeeks(); 
        obj.getData(); 
    } 
}















