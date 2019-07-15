
public final class SSLDemo {
	private static class Node{
		String name;
		Node next;
	} 

	public static void main(String[] args) {
		//Create top node
		Node top = null;
		top= new Node();
		top.name="A";
		top.next=null;
		
		printLinkList("Case 1", top);
		
		
		Node tmp;
		tmp = new Node();
		tmp.name="B";
		tmp.next=top;
		top=tmp;
		printLinkList("Case 2", top);
		
		
		 
		  tmp = new Node();
	      tmp.name = "C";
	      tmp.next = null;
	     
	      Node temp2;
	      temp2 = top;
	      while (temp2.next != null)
	         temp2 = temp2.next;
	      temp2.next = tmp;	
		  
		  printLinkList("Case 3",top);
		 
		  tmp = new Node();
		  tmp.name = "D";
		  
		  temp2 =top;
		  while(temp2.name.equals("A")==false) {
			  temp2=temp2.next;
			  
		  }
		  tmp.next = temp2.next;
		  temp2.next=tmp;
		  
		  printLinkList("Case 4",top);
		  
		  top=top.next;
		  
		  printLinkList("Case 5",top);
		  
		  tmp= new Node();
		  tmp.name="B";
		  tmp.next=top;
		  top=tmp;
		  printLinkList("Case 6",top);
		  
		  tmp=top;
		  while(tmp.name.equals("A")==false) {
			  tmp=tmp.next;
		  }
		  tmp.next=tmp.next.next;
		  printLinkList("Case 7",top);
		  
	}
private static void printLinkList(String msg,Node topNode) {
	System.out.print(msg + " ");
	while (topNode !=null){
		System.out.print(topNode.name + " ");
		topNode = topNode.next;
	}
	System.out.println();
}
}
