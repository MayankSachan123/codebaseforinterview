
public class MatMult {

	public static void main(String[] args) {
		int[][] a = {{ 10, 30 },
					 { 20, 40 }};
	    int[][] b = {{ 5,1 },
	    			 { 7,1 }};
	    System.out.println(a.length+" "+b.length+" "+b[0].length);
	    int [][] r = new int[a.length][]; ;
	    for (int i = 0; i < r.length; i++)
	         r[i] = new int[b[0].length];
	    
	    for(int i=0 ; i<a.length;i++) {
	    	for(int j=0;j<b[i].length;j++) {
	    		for(int k=0 ;k<a[i].length;k++) {
	    			r[i][j]+=a[i][k]*b[k][j];
	    		}
	    	}
	    }
	    
	    for(int i=0;i<r.length;i++) {
	    	for(int j=0;j<r[0].length;j++) {
	    		System.out.print(r[i][j]);
	    		System.out.print("\t");
	    	}
	    	System.out.print("\n");
	    }
	      

	}

}
