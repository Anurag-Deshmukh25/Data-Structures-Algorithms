package linkedlist;

public class RemoveLLElement {
    public ListNode removeElement(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null){
            if(current.next.val == val) current.next = current.next.next;
            else current = current.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        RemoveLLElement remover = new RemoveLLElement();
        ListNode result = remover.removeElement(head, 6);

        // Print the modified linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
