class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public void remove(int data){
        if(head==null){
            System.out.print("List is Empty");
            return;
        }
        if(head.data==data){
            head=head.next;
        }
        else
        {
            Node curr=head;
            Node prev=null;
            while(curr!=null&&curr.data!=data){
               prev=curr;
               curr=curr.next;
            }
            if(curr==null){
                System.out.print("element"+data+"not found");
            }
            prev.next=curr.next;
            
        }
    }
    public void removeindexx(int n){
        int index=0;
        if(head==null){
            System.out.print("list is empty");
        }
        if(n==0){
            head=head.next;
            return;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null&&index<n){
            prev=curr;
            curr=curr.next;  
            index++;
        }
        if(curr==null){
            System.out.print("out of bound");
            return;
        }
        prev.next=curr.next;
    }
}
class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(110);
        list.add(430);
        list.add(730);
        
        list.display();
        list.remove(30);
        System.out.println();
        list.display();
        list.removeindexx(3);
        System.out.println();
        list.display();
        
        
    }
}