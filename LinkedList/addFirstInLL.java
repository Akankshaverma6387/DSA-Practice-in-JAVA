public class addFirstInLL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public int getData(){
            return data;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
         newNode.next=head;
         head=newNode;
    }
    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
       addFirstInLL ll=new addFirstInLL();
       ll.addFirst(1);
       ll.addFirst(13);
       ll.addFirst(8);
       ll.printList();
    }
}