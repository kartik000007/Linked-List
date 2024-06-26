package Doubly;

public class DLL<Dll> {
    Node head;
    Node tail;

    public void insert(int value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;

        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public Dll removeduplicate(Dll ll) {
        Node temp = head;
        while (temp!=null && temp.next!=null){
            Node curr=temp;
            while (curr.next!=null){
                if(curr.next.val==temp.val){
                    curr.next=curr.next.next;

                }else{
                    curr=curr.next;
                }
            }
            temp=temp.next;
        }
        return ll;
    }

    public DLL removeDuplicateInUnsortedDll(DLL dll) {
        Node temp = head;

        while (temp!=null && temp.next!=null){
            Node curr=temp;
            while (curr.next!=null){
                if(curr.next.val==temp.val && curr.next.next!=null){
                    curr.next=curr.next.next;
                    curr.next.previous=curr;
                } else if (curr.next.val== temp.val && curr.next.next==null) {
                    curr.next=null;
                    tail=curr;
                } else{
                    curr=curr.next;
                }
            }
            temp=temp.next;
        }
        return dll;
    }

    public void printReverse() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.previous;
        }
        System.out.println();

    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.val == value && head == tail) {
            head = tail = null;
        } else if (head.val == value) {
            head = head.next;
            head.previous = null;
        } else {
            Node pre = head;
            Node curr = head;
            while (pre.next.val != value) {
                pre = pre.next;
            }
            if (pre.next != null) {
                pre.next = curr;

                System.out.println("value is not present");
                return;
            }
            if (pre.next == tail) {
                tail = pre;
                tail.next = null;
                tail.previous = pre.previous;
            } else {
//                Node cur = pre.next;
                pre.next = pre.next.next;
                curr.next.previous = pre;

                curr.next = null;
                curr.previous = null;

            }

        }
    }

    public void reverse(Dll ll) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            prev = current.previous;
            current.previous = current.next;
            current.next = prev;
            current = current.previous;
        }
        if (prev != null) {
            tail = head;
            head = prev.previous;
        }

    }

    protected boolean sumpair(int value) {
        Node first = head;
        Node last = tail;

        while (first.val <= last.val) {
            int sum = first.val + last.val;
            if (sum == value) {
                return true;
            } else if (sum > value) {
                last = last.previous;
            } else {
                first = first.next;
            }
        }

        return false;
    }

    protected void insertsort(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            if (tail.val <= value) {
                tail.next = node;
                node.previous = tail;
                tail = node;
            } else if (head.val >= value) {
                head.previous = node;
                node.next = head;
                node.previous = null;
                head = node;
            } else {
                Node temp = tail;
                while (temp.previous.val >= value) {
                    temp = temp.previous;
                }
                Node pretemp = head;
                while (pretemp.next.val < value) {
                    pretemp = pretemp.next;
                }
                pretemp.next = node;
                node.previous = pretemp;
                node.next = temp;
                temp.previous = node;
            }
        }
    }

    public void removeDuplicate(Dll ll) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            Node curr = temp;

            while (curr.next != null) {
                if (curr.next.val == temp.val) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
    }
}

class Node {
    int val;
    Node next, previous;

    public Node(int val) {
        this.val = val;
    }
}

