class Node {
    public int data;
    public Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Sum {
    public static Node addTwoNumbers(Node list1, Node list2) {
        // Reverse both input linked lists
        list1 = reverseLinkedList(list1);
        list2 = reverseLinkedList(list2);
        
        Node dummyHead = new Node(0);
        Node curr = dummyHead;
        int carry = 0;
        
        while (list1 != null || list2 != null || carry != 0) {
            int sum = carry;
            if (list1 != null) {
                sum += list1.data;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.data;
                list2 = list2.next;
            }
            
            carry = sum / 10;
            int digit = sum % 10;
            
            curr.next = new Node(digit);
            curr = curr.next;
        }
        
        return reverseLinkedList(dummyHead.next);
    }
    
    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
    
    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Node list1 = new Node(4);
        list1.next = new Node(2);
        list1.next.next = new Node(6);
        
        Node list2 = new Node(7);
        list2.next = new Node(9);
        list2.next.next = new Node(1);
        
        Node result = addTwoNumbers(list1, list2);
        printLinkedList(result); // Output: 1 -> 2 -> 1 -> 5 -> null
    }
}
