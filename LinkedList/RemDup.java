package linkedlist;

public class RemDup{
    public ListNode removeDuplicates(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val) current.next = current.next.next;
            else current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        RemDup remover = new RemDup();
        ListNode result = remover.removeDuplicates(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}