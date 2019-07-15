import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		String[] array= new String[s.length()-k+1];


		for(int i=0;i<=s.length()-k;i=i+1){
			array[i]=s.substring(i,i+k);
		}
		String[] sortarray= new String[s.length()-k+1];
for(int j=0;j<array.length;j++) {
	for(int m=0;m<array.length;m++) {
	System.out.println(array[j]);
}}


		return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
