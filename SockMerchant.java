
public class SockMerchant {

	public static void main(String[] args) {
		int n =9;
		int [] ar = {10, 20, 20, 10, 10, 30, 50 ,10 ,20};
		//int [] ar = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		
		for(int i =0 ;i<ar.length-1;i++) {
			for(int j =i ;j<ar.length;j++) {
			 if(ar[i]>ar[j]) {
				 int tmp=ar[i];
				 ar[i]=ar[j];
				 ar[j]=tmp;
			 }	
			}
		}
	
	for(int m:ar) {
		System.out.println(m);
	}
		int count=0;
		int pair=0;
		for(int i =0 ;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]) {
				count=count+1;
			}else {
				pair=pair+((count+1)/2);
				count=0;
			}
		}
		pair=pair+((count+1)/2);
		System.out.println(pair);
		
	}

}
