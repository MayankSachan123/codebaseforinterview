
public class SelectionSort {

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
		
		for(int pass =0 ;pass<intArray.length-1;pass++) {
			int min=pass;
			for(int i =pass+1;i<intArray.length-1;i++) {
				if(intArray[i]<intArray[min]) {
					min =i;
				}
				
			}
			if(min!=pass) {
				int tmp=intArray[pass];
				intArray[pass]=intArray[min];
				intArray[min]=tmp;
			}
		}
		
		for(int a:intArray)System.out.print(a+"\t");

	}

}
