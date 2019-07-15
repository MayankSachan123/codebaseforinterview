import java.time.Duration;
import java.time.LocalDateTime;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		int k=10; int[] A= {2, 1, 3}; int[] B= {7, 8, 9};
		System.out.println(permutingArray1(k,A,B));
		int k1=5; int [] A1= {1, 2, 2, 1}; int B1 [] = {3, 3, 3, 4};
		System.out.println(permutingArray1(k1,A1,B1));
		
		
		System.out.println(permutingArray2(k,A,B));
		
		System.out.println(permutingArray2(k1,A1,B1));
		}

	private static String permutingArray1(int k, int[] A, int[] B) {
		
		for(int i=0 ; i<A.length-1;i++) {
			for(int j=i;j<A.length;j++) {
				if(A[i]>A[j]) {
					int tmp =A[i];
					A[i]=A[j];
					A[j]=tmp;
				}
				if(B[i]<B[j]) {
					int tmp =B[i];
					B[i]=B[j];
					B[j]=tmp;
				}
			}
			if(A[i]+B[i]<k) {
				return "NO";
			}
		}
		return "YES";
		
		/*
		 * for(int i=0 ; i<B.length-1;i++) { for(int j=i;j<B.length;j++) { if(B[i]<B[j])
		 * { int tmp =B[i]; B[i]=B[j]; B[j]=tmp; } } }
		 */
		/*
		 * for(int a : A) { System.out.print(a); } for(int b : B) { System.out.print(b);
		 * }
		 */
		
		/*
		 * int count =0; for(int m =0;m<A.length;m++) { if(A[m]+B[m]>=k) { count++; }
		 * 
		 * } if(count==A.length) { System.out.println("YES"); }else {
		 * System.out.println("NO"); }
		 */
	}
	
private static String permutingArray2(int k, int[] A, int[] B) {
	LocalDateTime toDateTime = LocalDateTime.now();
	for(int i=0 ; i<A.length-1;i++) {
        for(int j=i;j<A.length;j++) {
            if(A[i]>A[j]) {
                int tmp =A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
    }
    
    for(int i=0 ; i<B.length-1;i++) {
        for(int j=i;j<B.length;j++) {
            if(B[i]<B[j]) {
                int tmp =B[i];
                B[i]=B[j];
                B[j]=tmp;
            }
        }
    }
   
    
    int count =0;
    for(int m =0;m<A.length;m++) {
        if(A[m]+B[m]>=k) {
            count++;
        }
        
    }
    if(count==A.length) {
    	LocalDateTime fromDateTime = LocalDateTime.now();
		System.out.println(Duration.between(toDateTime, fromDateTime).toMillis());
    return "YES";
    }else {
    	LocalDateTime fromDateTime = LocalDateTime.now();
		System.out.println(Duration.between(toDateTime, fromDateTime).toNanos());
        return "NO";    
    }
		}

}
