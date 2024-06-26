public class Insert_delete {
    public static void main(String[] args) {
      LL l=new LL();
      l.insertlast(2);
      l.insertlast(4);
      l.insertlast(3);
//      l.insertlast(0);
//      l.insertlast(4);
//      l.insertlast(5);
//      l.insertlast(2);
//      l.insertlast(0);

      LL l2=new LL();
      l2.insertlast(5);
      l2.insertlast(6);
      l2.insertlast(4);

      l.display();
      l2.display();

      Node h1=new Node();

      while (l!=null && l2!=null){
        if(h1==null){
          h1.val=l.head.val+l2.head.val;
          l.head=l.head.next;
          l2.head=l2.head.next;
        }else {
          
        }
      }
      //      l.mergeNodes(l);



//      l.insertlast(5);
//      l.insertlast(20);

      //      l.insertfirst(20);
//      l.display();
//      l.removeduplicateFromSorted(l);
//      l.display();
//      l.removeDuplicate(l);
//      LL l1=new LL();
//      l1=l.removeDuplicateFromUnSorted(l);
//      l1.display();

//      l.display();

//      System.out.println(l.deletefirst());
//      System.out.println(l.delete(2));
//      l.display();
    }
}
