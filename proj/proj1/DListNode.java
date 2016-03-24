/*
DListNode.java
*/

public class DListNode {

	public int[] item;
	public DListNode prev;
	public DListNode next;

	public DListNode() {
		item = new int[4];
		prev = null;
		next = null;
	}

	public DListNode(int[] item) {
		this.item = item;
		this.prev = null;
		this.next = null;
	}

}