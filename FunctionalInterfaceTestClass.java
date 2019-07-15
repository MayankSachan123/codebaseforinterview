import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceTestClass {

	public static void main(String[] args) {
		List<Edge> cities = new ArrayList<>();
		   cities.add(new Edge(new Node("LA"), new Node("NY"), 50));
		   cities.add(new Edge(new Node("Sydney"), new Node("Melbourne"), 30));
		   cities.add(new Edge(new Node("Rome"), new Node("Venice"), 20));
		   Predicate<Edge> edgePredicate = e -> e.getDist() >= 30; 
		   filter(edgePredicate, cities); 
		} 
		public static void filter(Predicate<Edge> predicate, List<Edge> items) { 
		   for(Edge item: items) { 
		      if(predicate.test(item)) { 
		         System.out.println(item.getStart() + " to " + item.getEnd() + " : " + item.getDist());
		 
		      } 
		   } 
	}

}
class Edge{
	
	Node Start;
	Node end;
	Integer dist;
	public Edge(Node start, Node end, Integer dist) {
		super();
		Start = start;
		this.end = end;
		this.dist = dist;
	}
	public Node getStart() {
		return Start;
	}
	public void setStart(Node start) {
		Start = start;
	}
	public Node getEnd() {
		return end;
	}
	public void setEnd(Node end) {
		this.end = end;
	}
	public Integer getDist() {
		return dist;
	}
	public void setDist(Integer dist) {
		this.dist = dist;
	}
	
	
}
class Node{
	String name;

	public Node(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + "]";
	}
	
}