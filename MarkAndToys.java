
public class MarkAndToys {

	public static void main(String[] args) {
		//int prices [] = {1, 12, 5, 111, 200, 1000, 10};
		//int k = 50;
		
		int prices [] = {1, 2, 3, 4};
		int k = 7;
		int spent=0;
		int count =0 ;
		for(int i=0;i<prices.length;i++){

	        for(int j=i+1;j<prices.length;j++){

	            if(prices[i]>prices[j]){

	                int temp=prices[i];
	                prices[i]=prices[j];
	                prices[j]=temp;
	            }                
	        }
	        if((spent+prices[i])<=k){

	            spent=spent+prices[i];
	            count++;
	        }else{
	            break;
	        }           
	    }                
	   
		System.out.println(count);

	}

}
