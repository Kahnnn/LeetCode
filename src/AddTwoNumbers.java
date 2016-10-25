/**
 * Created by Kahnnn on 2016/10/19.
 */
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode point = head;
        int carry = 0;


        while (l1 != null && l2 != null){
            point.next = new ListNode((l1.val + l2.val + carry)%10);
            carry = (l1.val + l2.val + carry)/10;

            l1 = l1.next;
            l2 = l2.next;
            point = point.next;
        }

        while (l1 != null){
            point.next = new ListNode((l1.val + carry)%10);
            carry = (l1.val + carry)/10;
            l1 = l1.next;

            point = point.next;
        }

        while (l2 != null){
            point.next = new ListNode((l2.val + carry)%10);
            carry = (l2.val + carry)/10;
            l2 = l2.next;

            point = point.next;
        }

        if (carry != 0) {
            point.next = new ListNode(carry);
        }

        return head.next;

    }
}
