
public class BubbleSort {

	public static void main(String[] args) {
		
		String s[] = args[0].split(",");
		int[] intArray= new int[s.length];
		
		
		for(int i=0;i<s.length;i++) {
			intArray[i]=Integer.parseInt(s[i]);
		}
		
		int inversion=0;
		
		for (int i=0;i<intArray.length-1;i++) {
			for (int j=i+1;j<intArray.length;j++){
				if(intArray[i]<intArray[j]) {
					inversion++;
				}
			}
		}
		System.out.println("Inversion : "+inversion);
		int count=0;
		for (int i=0;i<intArray.length-1;i++) {
			for (int j=intArray.length-1;j>i;j--){
				if(intArray[j]<intArray[i]) {
					swap(intArray, i, j);
					count =count +1;
				}
			}
		}
		
		System.out.println("Array is sorted in "+count+" swaps.");
		System.out.println("First Element: "+intArray[0]);
		System.out.println("Last Element: "+intArray[intArray.length-1]);
		
		for(int k: intArray)
		System.out.print(k+"\t");
	}

	private static void swap(int[] intArray, int i, int j) {
		int temp=intArray[i];
		intArray[i]=intArray[j];
		intArray[j]=temp;
	}

}
