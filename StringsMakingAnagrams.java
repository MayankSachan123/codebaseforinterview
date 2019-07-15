import java.util.Map;
import java.util.TreeMap;

public class StringsMakingAnagrams {

	public static void main(String[] args) {
		/*
		 * String a = "cde"; String b = "abc";
		 */
		
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		/*
		 * String a = "cde"; String b = "dcf";
		 */
		
		char [] ca= a.toCharArray();
		char [] cb = b.toCharArray();
		
	
		for(int i=0;i<ca.length;i++) {
			for(int j=0; j<ca.length;j++) {
				if(ca[i]<ca[j]) {
					char tmp = ca[i];
					ca[i]=ca[j];
					ca[j]=tmp;
				}
			}
		} 
		for(int i=0;i<cb.length;i++) {
			for(int j=0; j<cb.length;j++) {
				if(cb[i]<cb[j]) {
					char tmp = cb[i];
					cb[i]=cb[j];
					cb[j]=tmp;
				}
			}
		} 
		for(char c : ca) {
			System.out.print(c);
		}
		
		System.out.println("\n");
		
		for(char c : cb) {
			System.out.print(c);
		}
		System.out.println("\n");
		System.out.println(numberNeeded(a, b));
		
	}
	
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}

}
