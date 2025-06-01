package linkedlist;

public class DeleteNode {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        DeleteNode deleter = new DeleteNode();
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        // Deleting node with value 5
        deleter.deleteNode(head.next);

        // Print the modified list
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
