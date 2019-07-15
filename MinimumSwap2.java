
public class MinimumSwap2 {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 1, 5};
	        int first = 0, last = arr.length - 1;
	        int swaps = 0;
	        while (first < last) {
	            while (arr[first] == first + 1 && first < last)
	                first++;
	            if (first < last) {
	                int temp = arr[arr[first] - 1];
	                arr[arr[first] - 1] = arr[first];
	                arr[first] = temp;
	                swaps++;
	            }
	        }
	        System.out.println(swaps);
	        
	   

	}

}
