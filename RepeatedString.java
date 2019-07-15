
public class RepeatedString {

	public static void main(String[] args) {
		String s ="abcac";
		//String s ="aba";
		//String s="a";
		//long n =10;
		long n= 10;
		long count =0;
	    for(char c : s.toCharArray())
	        if(c == 'a')
	        count++;

	     long factor = (n/s.length());
	     long rem = (n%s.length());
	     count =  factor*count  ;
	    for(int i=0;i<rem;i++)
	        if(s.charAt(i)=='a')
	                count++;        
	    System.out.println(count);
	}

}
