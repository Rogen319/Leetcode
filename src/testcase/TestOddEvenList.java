package testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import problemSet.OddEvenList;
import dataStructure.ListNode;

public class TestOddEvenList {

	private OddEvenList oddEvenList = new OddEvenList();
	@Test
	public void testOddEvenList() {
		//创建测试用单向链表
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		
		oddEvenList.oddEvenList(head);
		
		int[] expected = {1,3,5,2,4};
		int[] real = new int[5];
		int i = 0;
		
		ListNode index = head;
		while(index != null){
			real[i] = index.val;
			index = index.next;
			i += 1;
		}
		
		assertArrayEquals(expected, real);
	}

}
