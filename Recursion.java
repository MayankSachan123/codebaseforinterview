
public final class Recursion {
	
	private static void printRecusrion(int n){
		if(n<1) {
			return;
		}else {
			System.out.println("Before : "+n);
			printRecusrion(n-1);
			System.out.println("After : "+n);
		}
	}

	public static void main(String[] args) {
		int n =10;
		printRecusrion(n);

	}

}
