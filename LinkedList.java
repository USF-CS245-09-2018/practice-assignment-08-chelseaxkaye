public class LinkedList implements List {

	private Node head;

	private int size;

	public LinkedList() {

		head = null;

		size = 0;

	}

	public void add(Object obj) throws Exception {

		Node node = new Node();

		node.data = obj;

		node.next = head;

		head = node;

		size++;
	}

	public void add(int pos, Object obj) throws Exception {

		if (pos > size) 

			throw new Exception();

		Node node = new Node();

		node.data = obj;

		if (pos == 0) {

			node.next = head;

			head = node;

		}

		else {

			Node prev = getNode(pos - 1);

			node.next = prev.next;

			prev.next = node;

		}
		
		size++;
	}

	public Object get(int pos) throws Exception {

		if (pos > size) 

			throw new Exception();

		return getNode(pos).data;

	}

	public Object remove(int pos) throws Exception {

		if (pos > size) 
			throw new Exception();
		
		Node node = getNode(pos);

		Node prev = getNode(pos - 1);

		prev.next = node.next;

		size--;

		return node.data;

	}

	public int size() {

		return size;

	}

	public Node getNode(int pos) {

		Node node = head;

		for (int i = 0; i < pos; i++)
			
			node = node.next;

		return node;

	}
}