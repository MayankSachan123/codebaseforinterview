
public class NewYearChaos {

	public static void main(String[] args) {
		int count = 0 ;
	    //int [] q = {2, 1, 5, 3, 4};
	    int [] q = {2, 5, 1, 3, 4};
        //always keep track of min three vlaues observed
        //Compare currently seeing value with this three values.
        int midOfThree = Integer.MAX_VALUE;
        int maxOfThree =  Integer.MAX_VALUE;
        int minOfThree =  Integer.MAX_VALUE ;
        
        //iterating from left to right
        for(int i=q.length-1 ; i >= 0 ; i--){
            //person has no way to move more than two positions -> wrong
            if((q[i]-i) > 3 ) {
                System.out.println("Too chaotic");
                return;
            }
            else{
                //means current value has passed at least 3 values -> wrong
                if(q[i] > maxOfThree){
                     System.out.println("Too chaotic");
                     return;
                }
                else if(q[i] > midOfThree){ //means -> current value has bribed 2 ppl
                    count=count+2;
                }
                else if(q[i] > minOfThree){ //means-> current value has bribed 1 person.
                    count=count+1;
                }
                
                //Now adjust minThree values comparing, taking the current vlaue to account
                if(q[i]<minOfThree){
                    maxOfThree=midOfThree;
                    midOfThree=minOfThree;
                    minOfThree = q[i];
                }
                else if(q[i]<midOfThree){
                    maxOfThree=midOfThree;
                    midOfThree = q[i];
                }
                else if(q[i]<maxOfThree){
                    maxOfThree = q[i];
                }
            }
        }
        System.out.println(count);

	}

}
