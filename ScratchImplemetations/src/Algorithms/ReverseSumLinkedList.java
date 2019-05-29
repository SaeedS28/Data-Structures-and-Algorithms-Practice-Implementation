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

        //System.out.println(linked1.toString());
        //System.out.println(linked2.toString());

        ro1.addTwoNumbers(linked1, linked2);
        System.out.println("no infinite recursion");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //ReverseSumLinkedList temp = new ReverseSumLinkedList();
        ListNode linked1= new ListNode(l1.val);
        ListNode linked2= new ListNode(l2.val);
        ListNode currentNode=l1.next;

        ListNode now;

        //these loops reverse both lists
        while (currentNode!=null) {
            now=new ListNode(currentNode.val);
            now.next=linked1;
            linked1=now;
            currentNode=currentNode.next;
        }

        currentNode=l2.next;
        while (currentNode!=null) {
            now=new ListNode(currentNode.val);
            now.next=linked2;
            linked2=now;
            currentNode=currentNode.next;
        }

        currentNode = linked1;

        // grab the numbers within the linked lists
        String first="";
        String second="";

        while (currentNode!=null) {
            first=first+currentNode.val;
            currentNode=currentNode.next;
        }

        currentNode = linked2;

        while (currentNode!=null) {
            second=second+currentNode.val;
            currentNode=currentNode.next;
        }
        
        Integer sum = Integer.parseInt(first) + Integer.parseInt(second);
        String answer = new String(sum.toString());
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