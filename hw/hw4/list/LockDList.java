/*
LockDList.java
*/

package list;

public class LockDList extends DList {

	public void lockNode(DListNode node) {
		LockDListNode lnode = (LockDListNode)node;
		lnode.isLocked = true;
	}

	/*
	@override 
	*/
	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
		DListNode node = super.newNode(item, prev, next);
		LockDListNode lnode = new LockDListNode(node);
		return (DListNode)lnode;
	}

	public void remove(DListNode node) {
		LockDListNode lnode = (LockDListNode)node;
		if (!lnode.isLocked) {
			super.remove(node);
		}
	}

	/*
	为了测试数据需要而添加的
	*/
	public LockDListNode front() {
		return (LockDListNode)(super.front());
	} 

	public LockDListNode back() {
		return (LockDListNode)(super.back());
	}
}