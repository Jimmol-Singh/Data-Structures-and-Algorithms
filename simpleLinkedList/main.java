package simpleLinkedList;

public class main {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(1);
		Node n2= new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
	 	Node n5 = new Node(5);
	 	Node n6 = new Node(6);
		
		
		head.next = n1;
		n1.next = n2;
    	n2.next = n3;
		n3.next = n4;
	 	n4.next = n5;
	 	n5.next = n6;
		
		
	 	n6.prev = n5;
		n5.prev = n4;
		n4.prev = n3;
		n3.prev = n2;
		n2.prev = n1;
		n1.prev = head;
		
		
		
		System.out.println(count(head));
		System.out.println(countPrev(n1));
		System.out.println(n3.data);
		
		
		
		

	}
	
	
	public static int count(Node head){
		
		int count = 1;
		Node node = head;
		
		while(node.next != null){
			node = node.next;
			count +=1;
		}
		
		return count;
		
		
		
	}
	
	
	
	public static int countPrev(Node position){
		int count = 0;
		Node current = position;
		
		
		while(current.prev != null){
			current = current.prev;
			count +=1;
		}
		
		return count;
	}
	
	
	

}
