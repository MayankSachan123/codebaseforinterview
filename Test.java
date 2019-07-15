
public class Test {

	public static void main(String[] args) {
		
		System.out.println(fun()); 
	}
	 static int fun() 
	   { 
	     int x= 10;  //Error: Static local variables are not allowed 
	     return x=x-1; 
	   } 
}
