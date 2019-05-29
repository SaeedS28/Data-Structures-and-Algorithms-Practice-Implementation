package Algorithms;

/**
 * ReverseSumLinkedList
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

 */
public class ReverseSumLinkedList {

    public static void main(String[] args) {
        ReverseSumLinkedList ro1 = new ReverseSumLinkedList();
        ReverseSumLinkedList.ListNode linked1 = ro1.new ListNode(12); // instantiating an inner class object
        linked1.appendToTail(21);
        linked1.appendToTail(32);

        ReverseSumLinkedList.ListNode linked2 = ro1.new ListNode(15);
        linked2.appendToTail(1321);
        linked2.appendToTail(45);

        System.out.println(linked1.toString());
        System.out.println(linked2.toString());


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
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