package problemSet;

import dataStructure.ListNode;

public class OddEvenList {

	public ListNode oddEvenList(ListNode head) {
		if(head != null){
			ListNode oddNode = head;
			ListNode evenNode = head.next;
			ListNode indexNode = head.next;//记录evenNode的开始位置

			while(evenNode != null && evenNode.next != null){
				oddNode.next = evenNode.next;
				oddNode = oddNode.next;
				evenNode.next = oddNode.next;
				evenNode = evenNode.next;
			}
			oddNode.next = indexNode;
		}
		return head;
	}
}
