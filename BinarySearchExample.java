public class BinarySearchExample {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[1]);
		String s[] = args[0].split(",");
		int[] intArray= new int[s.length];
		
		
		for(int i=0;i<s.length;i++) {
			intArray[i]=Integer.parseInt(s[i]);
		}
		//"5,10,15,8,3,11,12,2,3,4,1,6,7,9,13,14" 5
		int iniIndx=0;
		int lastIndx=intArray.length-1;
		int middleIndx;
		while(iniIndx<=lastIndx) {
			middleIndx=iniIndx+(lastIndx-iniIndx)/2;
			if(a>intArray[middleIndx]) {
				iniIndx=middleIndx+1;
			}else if (a<intArray[middleIndx]) {
				lastIndx=middleIndx-1;
			}else {
				System.out.println("Value found at last index : "+lastIndx+" Middle : "+middleIndx);
				return;			}
			
		}
		
		System.out.println("Value not found");
	}

}
