
public class CountingValleys {

	public static void main(String[] args) {
		int n =8;
		String s = "UDDDUDUUDDUU";
		char ch[] = s.toCharArray();
		int count =0;
		int vellyCount=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='U') {
				count=count+1;
				if(count==0) {
					vellyCount++;
				}
			}
			if(ch[i]=='D') {
				count=count-1;
			}
		}
		System.out.println(vellyCount);

	}

}
