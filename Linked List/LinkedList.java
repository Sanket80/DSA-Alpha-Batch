import java.util.*;

public class LinkedList {
    
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty!");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("LL is Empty!");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }

        Node temp = head;
        for(int i=0 ; i<size-2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public static int itrSearch(int key){
        if(head == null){
            return -1;
        }
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int recSearch(Node head , int key){
        if(head == null){
            return -1;
        }
        Node temp = head;
        if(temp.data == key){
            return 0;
        }
        int idx = recSearch(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void removeNthfromEnd(int n){
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next;
        }

        int i=1;
        int idx = (size-n);
        Node prev = head;
        while (i < idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome(){
        if(head == null || head.next==null){
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        while (right!=null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return;
        }

        Node prev = head;
        slow = head;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void ZigZagLL(){
        if(head == null || head.next == null){
            return;
        }

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow;

        // Reverse 2nd Half of LL
        Node prev = null;
        Node curr = midNode.next;
        midNode.next = null;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
         
        Node leftH = head;
        Node rightH = prev;
        Node nextL, nextR;

        while(leftH!=null && rightH!=null){
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            leftH = nextL;
            rightH = nextR;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("LL is Empty!");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addMiddle(5, 2);

        // // ll.removeFirst();
        // // ll.removeLast();
        // ll.print();
        // // System.out.println(itrSearch(3));
        // // System.out.println(recSearch(head,3));
        // // ll.reverse();
        // // ll.print();
        // removeNthfromEnd(3);
        // ll.print();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        // System.out.println(isPalindrome());

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        ZigZagLL();
        ll.print();
    }
}
