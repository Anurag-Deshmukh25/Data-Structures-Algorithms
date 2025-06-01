package linkedlist;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle cycleChecker = new LinkedListCycle();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Creating a cycle

        boolean hasCycle = cycleChecker.hasCycle(head);
        System.out.println("Has Cycle: " + hasCycle); // Output: true
    }
}
