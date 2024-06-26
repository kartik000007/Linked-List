//import org.w3c.dom.Node;

import java.util.Stack;

public class questions {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertlast(10);
        ll.insertlast(20);
        ll.insertlast(30);
        ll.insertlast(40);
        ll.insertlast(50);
//        ll.display();
        SLL sll =new SLL();
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        sll.insert(40);
        sll.print();
        sll.swapfirstintolast();
        sll.print();
//        ll.deletevalue(20);
//        ll.display();
//
//        ll.head=ll.reverse(ll.head);
//        ll.display();


        //        ll.display();
//        printreverse(ll);
//        printnelement(ll,4);
//        getvalueofnelementfromlast(ll,3);
//        printmiddle(ll);

//        ll.insertlast(10);
//        ll.insertlast(20);
//        ll.insertlast(30);
//        ll.insertlast(40);
//        ll.insertlast(50);


//        Node temp = ll.head;
//        removeElement(temp);
//        ll.tail.next = ll.head.next;

//        Node temp = ll.head;
//        System.out.println(Cyclecount(temp));

//        System.out.println(Cycle(temp));

    }



    public static boolean Cycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void removeElement(Node p) {
        p.val = p.next.val; // store next value
        p.next = p.next.next; // store next to next value's address
    }
    public static int Cyclecount(Node head) {
        Node slow = head;
        Node fast = head;
        if (head.next == null) {
            System.out.println("Cycle Not Found ");
            return 0;
        }
        int count = 0;
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow.next != fast) {
            slow = slow.next;
            count++;
        }

        return count;
    }

    private static void printmiddle(LL ll) {
        Node slow = ll.head;
        Node fast = ll.head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }

    private static void printnelement(LL ll, int index) {
        Node temp = ll.head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    private static void getvalueofnelementfromlast(LL ll, int index) {
        int n = (ll.size - index) + 1;
        Node temp = ll.head;
        for (int i = 1; i < n; i++) {
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public static void printreverse(LL ll) {
        Node temp = ll.head;
        Stack<Integer> sk = new Stack<>();
        do {
            sk.add(temp.val);
            temp = temp.next;
        } while (temp != null);

        while (!sk.isEmpty()) {
            System.out.print(sk.pop() + " ");
        }
        System.out.println();


    }


}
