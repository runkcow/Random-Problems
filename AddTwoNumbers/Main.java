package AddTwoNumbers;

public class Main 
{
    public static void main (String[] args)
    {
        // ListNode a3 = new ListNode(3);
        // ListNode a2 = new ListNode(4, a3);
        // ListNode a1 = new ListNode(2, a2);
        
        // ListNode b3 = new ListNode(4);
        // ListNode b2 = new ListNode(6, b3);
        // ListNode b1 = new ListNode(5, b2);

        ListNode a6 = new ListNode(9);
        ListNode a5 = new ListNode(9, a6);
        ListNode a4 = new ListNode(9, a5);
        ListNode a3 = new ListNode(9, a4);
        ListNode a2 = new ListNode(9, a3);
        ListNode a1 = new ListNode(9, a2);
        ListNode a0 = new ListNode(9, a1);

        ListNode b3 = new ListNode(9);
        ListNode b2 = new ListNode(9, b3);
        ListNode b1 = new ListNode(9, b2);
        ListNode b0 = new ListNode(9, b1);

        ListNode test = Solution.ATN(a1, b1);
        while (test != null)
        {
            System.out.println(test.val);
            test = test.next;
        }
    }    
}
