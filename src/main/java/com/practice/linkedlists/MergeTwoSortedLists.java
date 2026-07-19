package com.practice.linkedlists;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {

		System.out.println("Test Merging 2 sorted lists:");
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		// display;
		ListNode l1head = l1;
		while (l1 != null) {
			System.out.print(l1.val);
			if (l1.next != null) {
				System.out.print("->");
			}
			l1 = l1.next;
		}

		System.out.println();
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode l2head = l2;
		while (l2 != null) {
			System.out.print(l2.val);
			if (l2.next != null) {
				System.out.print("->");
			}
			l2 = l2.next;
		}

		System.out.print("\nMerged List:");

		
		  ListNode result = mergeTwoLists(l1head, l2head); while (result != null) {
		  System.out.print(result.val); if (result.next != null) {
		  System.out.print("->"); } result = result.next; }
		 

		/*
		 * ListNode l3 = new ListNode(5); ListNode l4 = new ListNode(1, new ListNode(2,
		 * new ListNode(4)));
		 * 
		 * ListNode l3head = l3; ListNode l4head = l4; ListNode result1 =
		 * mergeTwoLists(l3head, l4head); System.out.print("\nMerged List2:"); while
		 * (result1 != null) { System.out.print(result1.val); if (result1.next != null)
		 * { System.out.print("->"); } result1 = result1.next; }
		 */

		ListNode l5 = new ListNode(-9, new ListNode(3));
		ListNode l6 = new ListNode(5, new ListNode(7));

		ListNode l5head = l5;
		ListNode l6head = l6;
		ListNode result2 = mergeTwoListsUsingRecussion(l5head, l6head);
		System.out.print("\nMerged List2:");
		while (result2 != null) {
			System.out.print(result2.val);
			if (result2.next != null) {
				System.out.print("->");
			}
			result2 = result2.next;
		}

		ListNode firstEmpty = mergeTwoListsUsingRecussion(new ListNode(), new ListNode(1));
		if (firstEmpty != null) {
			System.out.println("\nfirstemptyList:" + firstEmpty.val);
		}
		ListNode firstEmpty1 = mergeTwoListsUsingRecussion(null, new ListNode(1));
		if (firstEmpty1 != null) {
			System.out.println("\nfirstemptyList:" + firstEmpty1.val);
		}

	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode mlist = new ListNode();

		if (list1 == null && list2 == null)
			return new ListNode();
		if (list1 != null && list2 == null) {
			return list1;
		}
		if (list1 == null && list2 != null) {
			return list2;
		}

		ListNode resultHead = mlist;

		while (list1 != null && list2 != null) {

			if (list1.val == list2.val) {
				mlist.next = new ListNode(list1.val, new ListNode(list2.val));
				list1 = list1.next;
				list2 = list2.next;
				mlist = mlist.next.next;
			} else if (list1.val < list2.val) {
				mlist.next = new ListNode(list1.val);
				list1 = list1.next;
				mlist = mlist.next;
			} else {
				mlist.next = new ListNode(list2.val);
				list2 = list2.next;
				mlist = mlist.next;
			}

		}
		while (list1 != null && list2 == null) {
			mlist.next = list1;
			list1 = list1.next;
			mlist = mlist.next;
		}
		while (list2 != null && list1 == null) {
			mlist.next = list2;
			list2 = list2.next;
			mlist = mlist.next;
		}
		return resultHead.next;

	}
	
	//using recurssion
	public static ListNode mergeTwoListsUsingRecussion(ListNode list1, ListNode list2) {

		if (list1 == null && list2 == null) return new ListNode();
		if (list2 == null) return list1;
		if (list1 == null) return list2;
		if(list1.val<list2.val) {
			list1.next=mergeTwoListsUsingRecussion(list1.next,list2);
			return list1;
		}else {
			list2.next=mergeTwoListsUsingRecussion(list2.next,list1);
			return list2;
		}
		
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}