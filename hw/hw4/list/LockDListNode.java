/*
LockDListNode.java
*/

package list;

public class LockDListNode extends DListNode {

	protected boolean isLocked;

	public LockDListNode(DListNode node) {
		super(node.item, node.prev, node.next);
		isLocked = false;
	}
}