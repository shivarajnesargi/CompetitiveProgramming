/**
*Author:Shivraj
*Date :Feb 18, 2018
*Time :7:14:22 PM
*Place:Brooklyn,Newyork
*
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode=new ListNode(0);
        int carry=0;
        ListNode p=l1;
        ListNode q=l2;
        ListNode curr=dummyNode;
        while(p!=null||q!=null)
        {
            int x=(p!=null)?p.val:0;
            int y=(q!=null)?q.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
        }
        if(carry>0)
        {
            curr.next=new ListNode(1);
        }
        
        return dummyNode.next;
    }
}