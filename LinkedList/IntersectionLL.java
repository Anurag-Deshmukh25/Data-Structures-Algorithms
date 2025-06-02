package linkedlist;

public class IntersectionLL {
    public ListNode intersectionNode(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null) return null;

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while(temp1 != temp2){
            temp1 = temp1 == null ? head2 : temp1.next;
            temp2 = temp2 == null ? head1 : temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        
        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = head1.next; // Intersection at node with value 2

        IntersectionLL intersnLL = new IntersectionLL();
        ListNode intersection = intersnLL.intersectionNode(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
