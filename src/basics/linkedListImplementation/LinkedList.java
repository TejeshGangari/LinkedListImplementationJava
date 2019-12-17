package linkedListImplementation;

public class LinkedList {

	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
		
	}
	
	public void insertAt(int index,int data) {
		if(index<=size()-1) {
			int location = 0;
			Node node = new Node();
			node.data = data;
			if(head == null) {
				head = node;
			}
			else {
				Node n = head;
				Node temp;
				while(n.next!=null) {
					location++;
					if(location == index) {
						temp = n.next;
						n.next = node;
						node.next = temp;
						break;
					}
					n = n.next;
				}
			}
		}else {
			System.out.println("Index out of range");
		}
	}
	
	public void delete(int data) {
		Node n = head;
		Node temp;
		while(n.next!=null) {
			temp = n;
			if(n.data == data) {
				
			}
			n = n.next;
		}
	}
	
	public int size() {
		int size=0;
		Node n=head;
		while(n.next!=null) {
			size++;
			n = n.next;
		}
		
		return size+1;
	}
	
	public void show() {
		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
