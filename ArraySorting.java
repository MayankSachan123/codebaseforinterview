import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] intArray= new int[] {1,3,5,9,4,6};
		Arrays.sort(intArray);
		Arrays.stream(intArray).forEach(System.out::print);
		
		Simpson[] simpsonArray=new Simpson[] {new Simpson("Mark"),new Simpson("Ahmad"),new Simpson("Jack")};
		Arrays.sort(simpsonArray);
		Arrays.stream(simpsonArray).map(a->a.name).forEach(System.out::print);
	}

}
