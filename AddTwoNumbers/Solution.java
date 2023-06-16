package AddTwoNumbers;

public class Solution 
{
    public static ListNode ATN (ListNode l1, ListNode l2)
    {
        int val = l1.val + l2.val;
        boolean carryOn = false;
        if (val > 9)
        {
            val %= 10;
            carryOn = true;
        }
        ListNode prev = new ListNode(val);
        ListNode result = prev;
        ListNode c1 = l1.next;
        ListNode c2 = l2.next;
        while ((c1 != null) || (c2 != null) || (carryOn))
        {
            val = (c1 != null ? c1.val : 0) + (c2 != null ? c2.val : 0) + (carryOn ? 1 : 0);
            carryOn = false;
            if (val > 9)
            {
                val %= 10;
                carryOn = true;
            }
            prev.next = new ListNode(val);
            prev = prev.next;
            if (c1 != null)
            {
                c1 = c1.next;
            }
            if (c2 != null)
            {
                c2 = c2.next;
            }
        }
        return result;
    }
}
