class Reverselist2{
    Node head;

    static class Node{
        int data;
        Node next;
        Node temp;
       

        Node(int d)
        {
            data =d;
            next = null;
           
        }
    }

    void display()
    {
        Node n = head;
        while(n !=null)
        {
            System.out.print(n.data+ "----->");
            n=n.next;
        }
    }
    void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void  reverseList() 
    {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("\nReversed List:");
       
    }

    public static void main(String args[])
    {

        Reverselist2 l1 = new Reverselist2();
        l1.head = new Node(3);
        Node l2 = new Node(7);
        Node l3 = new Node(5);
        
        l1.head.next = l2;
        l2.next = l3;
       
        System.out.println("Starting List");
        l1.display();

        l1.reverseList();
        l1.display();
    }
}