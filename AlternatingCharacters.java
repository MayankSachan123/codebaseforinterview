
public class AlternatingCharacters {

	public static void main(String[] args) {
		String s = "AABAAB";
		char [] c = s.toCharArray();
		String ss= new String();
		for (int i=0;i<s.length();i++) {
			int count=0;
		for (int j=i;j<s.length();j++) {
			if(c[i]==c[j]) {
				count=count+1;
				
			}
		}
		}

	}

}
