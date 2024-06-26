import java.util.HexFormat;

public class SLL {
    Node head;

    int size=0;
//    public void insert(int val) {
//        Node node = new Node(val);
//        if (head == null) {
//            head = node;
//            last = node;
//            size++;
//            return;
//        }
//        last.next=node;
//        last=node;
//        last.next=head;
//        size++;
////        head=node;
//    }

    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            head.next=head;

        }else {
            Node curr=head;

            while (curr.next!=head){
                curr=curr.next;
            }
            curr.next=node;
            node.next=head;
        }
        size++;
    }

    public void deletefirst(){
        Node curr=head;
        while (curr.next!=head){
            curr=curr.next;
        }
        head=head.next;
        curr.next=head;
    }

    public void deletelast(){
        Node curr= head;
        while (curr.next.next!=head){
            curr=curr.next;
        }
        curr.next=head;
    }
    public void delete(int value){
//        Node temp=head;
//        if(temp.value==value){
//            deletefirst();
//            return;
//        }
//
//        while (temp.next!=head && temp.next.value!=value){
//            temp=temp.next;
//        }
//        if(temp.next==head){
//            deletelast();
//        }else {
//            temp.next=temp.next.next;
//        }

        if (head == null) {
            System.out.println("empty");
            return;
        }

        if (head.value == value && head.next == head) {
            head = null;
        } else if (head.value == value) {
            Node pre = head;
            while (pre.next != head){
                pre = pre.next;
            }
            head = head.next;
            pre.next = head;

        } else {
            Node pre = head;
            while (pre.next != head && pre.next.value != value){
                pre = pre.next;
            }
            if (pre.next == head) {
                System.out.println("Element is Not present");
                return;
            } else {
                pre.next = pre.next.next;
            }
        }

    }
    public void print() {
        Node temp = head;

        do {
            System.out.print(temp.value + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("End");
    }

    public void swapfirstintolast() {
        Node pre=head;
        Node curr=head;
        while (pre.next.next!=head){
            pre=pre.next;
        }
        while (curr.next!=head){
            curr=curr.next;
        }

        Node temp=head;
        curr.next=head.next;
        pre.next=temp;
        head=curr;
        temp.next=head;

    }
    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
