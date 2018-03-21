public class solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;	//定义虚拟的头指针
	    int carry = 0;
	    while (p != null || q != null) {
	    	

            int x = (p!=null) ? p.val:0;
            int y = (q!=null) ? q.val:0;
	        int sum = carry + x + y;
	        carry = sum / 10;//取得进位
	        curr.next = new ListNode(sum % 10); //头指针的下一个节点的值为第一个节点的值
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
}