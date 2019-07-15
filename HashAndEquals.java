import java.util.HashSet;
import java.util.Set;

public class HashAndEquals {
	private static final String HEADER_SEPARATOR =
		      "======================================================================";

		   private static final int HEADER_SEPARATOR_LENGTH = HEADER_SEPARATOR.length();

		   private static final String NEW_LINE = System.getProperty("line.separator");

		   private final Person person1 = new Person("Flintstone", "Fred");
		   private final Person person2 = new Person("Rubble", "Barney");
		   private final Person person3 = new Person("Flintstone", "Fred");
		   private final Person person4 = new Person("Rubble", "Barney");

		   public void displayContents()
		   {
		      printHeader("THE CONTENTS OF THE OBJECTS");
		      System.out.println("Person 1: " + person1);
		      System.out.println("Person 2: " + person2);
		      System.out.println("Person 3: " + person3);
		      System.out.println("Person 4: " + person4);
		   }

		   public void compareEquality()
		   {
		      printHeader("EQUALITY COMPARISONS");
		      System.out.println("Person1.equals(Person2): " + person1.equals(person2));
		      System.out.println("Person1.equals(Person3): " + person1.equals(person3));
		      System.out.println("Person2.equals(Person4): " + person2.equals(person4));
		   }

		   public void compareHashCodes()
		   {
		      printHeader("COMPARE HASH CODES");
		      System.out.println("Person1.hashCode(): " + person1.hashCode());
		      System.out.println("Person2.hashCode(): " + person2.hashCode());
		      System.out.println("Person3.hashCode(): " + person3.hashCode());
		      System.out.println("Person4.hashCode(): " + person4.hashCode());
		   }

		   public Set<Person> addToHashSet()
		   {
		      printHeader("ADD ELEMENTS TO SET - ARE THEY ADDED OR THE SAME?");
		      final Set<Person> set = new HashSet<Person>();
		      System.out.println("Set.add(Person1): " + set.add(person1));
		      System.out.println("Set.add(Person2): " + set.add(person2));
		      System.out.println("Set.add(Person3): " + set.add(person3));
		      System.out.println("Set.add(Person4): " + set.add(person4));
		      return set;
		   }

		   public void removeFromHashSet(final Set<Person> sourceSet)
		   {
		      printHeader("REMOVE ELEMENTS FROM SET - CAN THEY BE FOUND TO BE REMOVED?");
		      System.out.println("Set.remove(Person1): " + sourceSet.remove(person1));
		      System.out.println("Set.remove(Person2): " + sourceSet.remove(person2));
		      System.out.println("Set.remove(Person3): " + sourceSet.remove(person3));
		      System.out.println("Set.remove(Person4): " + sourceSet.remove(person4));
		   }

		   public static void printHeader(final String headerText)
		   {
			   System.out.println(NEW_LINE);
			   System.out.println(HEADER_SEPARATOR);
			   System.out.println("= " + headerText);
			   System.out.println(HEADER_SEPARATOR);
		   }

		   public static void main(final String[] arguments)
		   {
		      final HashAndEquals instance = new HashAndEquals();
		      instance.displayContents();
		      instance.compareEquality();
		      instance.compareHashCodes();
		      final Set<Person> set = instance.addToHashSet();
		      System.out.println("Set Before Removals: " + set);
		      //instance.person1.setFirstName("Bam Bam");
		      instance.removeFromHashSet(set);
		      System.out.println("Set After Removals: " + set);
		   }
}
