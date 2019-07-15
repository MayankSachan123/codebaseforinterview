
public class ArrayManipulation {

	public static void main(String[] args) {
		int n =10,m=3;
		int[][] queries = {{1, 3, 3},{3, 6, 7},{2, 9, 1}};
		///int n =5,m=3;
		//int[][] queries = {{1, 2, 100},{2, 5, 100},{3, 4, 100}};
		long[] arr = new long[n];
		int lower;
		int upper;
		long sum;
		for(int i=0;i<n;i++) arr[i]=0;
		for(int i=0;i<queries.length;i++){
		    lower=queries[i][0];
		    upper=queries[i][1];
		    sum=queries[i][2];
		    arr[lower-1]=arr[lower-1]+sum;
		    if(upper<n) 
		    	arr[upper]=arr[upper]-sum; 
		}
		 for(long a : arr) {
			 System.out.print(a+" ");
		 }       
		long max=0;
		long temp=0;

		for(int i=0;i<n;i++){
		    temp = temp+arr[i];
		    if(temp> max) max=temp;
		}
		System.out.print(" MAX "+max);
	}

}
