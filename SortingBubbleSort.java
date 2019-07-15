
public class SortingBubbleSort {

	public static void main(String[] args) {
		int [] a = {3, 2, 1};
		int n = a.length;
		int count =0;
		for (int i = 0; i < n; i++) {	    
		    for (int j = 0; j < n - 1; j++) {      
		        if (a[j] > a[j + 1]) {
		            int tmp=a[j];
		            a[j]=a[j+1];
		            a[j+1]=tmp;
		            count ++;
		        }
		    }
		    
		}
		System.out.println("Array is sorted in "+count+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[n-1]);
		
		
	}

	

}
