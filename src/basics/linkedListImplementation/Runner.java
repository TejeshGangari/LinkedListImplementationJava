package linkedListImplementation;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(12);
		list.insert(18);
		
		list.insertAt(4, 19);		
		list.show();

	}

}
