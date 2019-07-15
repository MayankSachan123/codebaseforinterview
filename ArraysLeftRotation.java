
public class ArraysLeftRotation {

	public static void main(String[] args) {
		int d=4;
		int[] a= {1, 2, 3, 4, 5};
		
		int [] m = new int[d];
		int [] n = new int [a.length-d];
		int [] k = new int [a.length];
		for(int i=0;i<a.length;i++) {
         if(i<d) {
        	 m[i]=a[i];
         }else {
        	 n[i-d]=a[i];
         }
          
		}
		
		for(int l=0;l<n.length;l++) {
			k[l]=n[l];
		}
		for(int j=0;j<m.length;j++) {
			k[n.length+j]=m[j];
		}

		for(int q : k) {
			System.out.println(q);
		}
	}

}
