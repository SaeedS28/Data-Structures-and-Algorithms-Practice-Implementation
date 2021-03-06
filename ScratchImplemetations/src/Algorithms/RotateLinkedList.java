package Algorithms;

/**
 * RotateLinkedList
 */
public class RotateLinkedList {

    public static void main(String[] args) {
        RotateLinkedList.ListNode list = new RotateLinkedList().new ListNode(1);
        list.appendToTail(2);
        list.appendToTail(3);
        list.appendToTail(4);
        list.appendToTail(5);

        System.out.println(list.toString());
        
        RotateLinkedList ro = new RotateLinkedList();
        ro.rotateRight(list, 3);

    }

    public ListNode rotateRight(ListNode head, int k) {
        int size=0;
        ListNode current = head;

        while (current != null) {
            size++;
            current=current.next;
        }

        current=head;

        int now, next;

        for (int i = 0; i < k; i++) {
            now = current.val;
            while (true) {
                current = current.next;
                if(current==null){
                    break;
                }
                next = current.val;
                current.val=now;
                now = next;
            }
            current=head;
            next = current.val;
            current.val = now;
            now = next;
        }
        System.out.println(head.toString());
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        
        public void appendToTail(int d){
            ListNode newNode = new ListNode(d);
            ListNode curr =this;

            while (curr.next!=null) {
                curr=curr.next;
            }
            curr.next=newNode;
        }

        public String toString(){
            StringBuilder sb= new StringBuilder();
            ListNode header = this;
            sb.append(header.val);
            header=header.next;
            
            while (header!=null) {
                sb.append(" -> " + header.val);
                header=header.next;
            }
            return sb.toString();
        }
    }
}