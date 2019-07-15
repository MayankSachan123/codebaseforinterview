import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodExampleOfComparator {

	public static void main(String[] args) {
		List<Simpson> characters = new ArrayList<>();
		Simpson homer = new Simpson("Homer");
        Simpson moe = new Simpson("Moe");
        characters.add(homer);
        characters.add(moe);
        Collections.sort(characters, (Comparator.<Simpson>comparingInt(a->a.name.length()).thenComparingInt(b->b.name.length())));
        characters.stream().forEach(System.out::print);
	}

}
