
public class LinearSearchExample {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[1]);
		String [] c =args[0].split(",");
		for (int a=0;a<c.length;a++) {
			System.out.println(i+" is "+((i==Integer.parseInt((c[a])))?" Foud ":" Not Found"));
		}
	}

}
