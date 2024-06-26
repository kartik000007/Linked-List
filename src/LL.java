import java.util.Stack;

public class LL {
    public Node head;
    public Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }


    public LL removeDuplicateFromUnSorted(LL ll){
       Node temp=head;

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

    public void removeduplicateFromSorted(LL ll){
        Node temp=head;
        while (temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertfirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp=head;

        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        temp.next= new Node(val,temp.next);
        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public int delete(int index){
        Node pre=get(index-1);
        int val=pre.next.val;
        pre.next= pre.next.next;
        size--;
        return val;
    }

    public void deletevalue(int val){
        Node temp=head;
        while (temp.next.val!=val){
            temp=temp.next;
        }
        if(temp.next==null){
            temp=null;
            return;
        }
        temp.next=temp.next.next;
    }

    public int deletefirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deletelast(){
            Node secondLast=get(size-2);
            int val= tail.val;
            tail=secondLast;
            tail.next=null;
            size--;
            return val;
    }

    public Node get(int index){
        Node node=head;

        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public Node reverse(Node head) {
        Node pre=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }

    public void mergeNodes(LL ll) {
        Node temp=head.next;
        Node h1=new Node();
        int ans=0;
        while(temp.val!=0){
            ans+=temp.val;
            temp=temp.next;

        }
        System.out.println(ans);
//        return ll;
    }


//    public class Node {
//        int val;
//        Node next;
//
//        public Node(int val) {
//            this.val = val;
//        }
//
//        public Node(int val, Node next) {
//            this.val = val;
//            this.next = next;
//        }
//    }

}

 class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

     public Node() {

     }
 }



