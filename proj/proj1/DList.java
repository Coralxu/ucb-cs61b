/*
DList.java
*/

public class DList {

	private DListNode head;
	private DListNode tail;
	private int size;

	public DList() {
		head = tail = null;
		size = 0;
	}

	public DList(int[] item) {
		head = new DListNode(item);
		tail = head;
		size = 1;
	}

	public void insert(int[] item) {
		if (head == null) {
			head = new DListNode(item);
			tail = head;
		} else {
			DListNode node = new DListNode(item);
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		size++;
	}

	public int getSize() {
		return size;
	}

	public DListNode getHead() {
		return head;
	}
	public DListNode getTail() {
		return tail;
	}
}
