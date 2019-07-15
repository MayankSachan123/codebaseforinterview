import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortComparableChallenge {

	public static void main(String[] args) {
		 Set<Simpson> set = new TreeSet<>();
	        set.add(new Simpson("A1"));
	        set.add(new Simpson("A11"));
	        set.add(new Simpson("A2"));
	        set.add(new Simpson("A22"));
	        set.add(new Simpson("A3"));

	        List<Simpson> list = new ArrayList<>();
	        list.addAll(set);
	        Collections.reverse(list);
	        list.forEach(System.out::println);
	    }

	    static class Simpson implements Comparable<Simpson> {
	        String name;

	        public Simpson(String name) {
	            this.name = name;
	        }

	        public int compareTo(Simpson simpson) {
	            return simpson.name.compareTo(this.name);
	        }

	        public String toString() {
	            return this.name;
	        }
	}

}
