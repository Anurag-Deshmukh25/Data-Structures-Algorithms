package linkedlist;

public class LinkedCycle2 {
    public ListNode detectCycle(ListNode head){
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
            return slow;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        LinkedCycle2 cycleDetector = new LinkedCycle2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Creates a cycle

        ListNode cycleStart = cycleDetector.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle detected at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
