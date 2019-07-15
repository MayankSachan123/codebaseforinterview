
public class ArrayExamples {

	public static void main(String[] args) {
char[] ca= {'j','v'};
System.out.println( ca);
char [] ca1= new char[4];
ca1[0]='m';
System.out.println( ca1);
char [] ca2 = new char[] {'x','y'};
System.out.println(ca2);
output(new char[] {'a',8});
	}
static void output(char[] a) {
	System.out.println(a);
	System.out.println(a.length);
}
}
