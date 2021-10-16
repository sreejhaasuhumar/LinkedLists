package LinkedList;

import java.util.LinkedList;

public class IsCycleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedListNode node = new SinglyLinkedListNode(1);
		node.next =new SinglyLinkedListNode(2);
		node.next.next=new SinglyLinkedListNode(3);
		boolean ans=isCycle(node);
		SinglyLinkedListNode ans1=detectCycle(node);
		System.out.println(ans);
}
	
	
	public static boolean isCycle(SinglyLinkedListNode head)
	{
		if(head==null)
			return false;
		SinglyLinkedListNode walker=head;
		SinglyLinkedListNode runner=head;
		while(runner !=null && runner.next != null)
		{
			walker = walker.next;
			runner = runner.next.next;
			
			if(walker == runner)
				return true;
		}
		
		return false;
	}
	
	 public static SinglyLinkedListNode detectCycle(SinglyLinkedListNode head) {
		 SinglyLinkedListNode slow = head;
		 SinglyLinkedListNode fast = head;
 
         while (fast!=null && fast.next!=null){
             fast = fast.next.next;
             slow = slow.next;
             
             if (fast == slow){
            	 SinglyLinkedListNode slow2 = head; 
                 while (slow2 != slow){
                     slow = slow.next;
                     slow2 = slow2.next;
                 }
                 return slow;
             }
         }
         return null;
     }
	

}
