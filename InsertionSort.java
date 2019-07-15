
public class InsertionSort {

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
		
		for(int i=1;i<intArray.length;i++) {
			int a=intArray[i];
			int j=i;
			while(j>0 && intArray[j-1]>a) {
				intArray[j]=intArray[j-1];
				j=j-1;				
			}
			intArray[j]=a;
		}
		
		for(int a:intArray)System.out.print("Insertion sort : "+a+"\t");
	}

}
