class LL{
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
    /////////////////////Conditions ask in interview///////////////////////
    //////////////To Count the no. of nodes in a linkedlist///////////////
    int countNodes() 
    {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }
    ///////////Recursive program for count number of nodes ////////////////////
    int countRecursive(Node node)
     {
        if (node == null) {
            return 0;
        } else {
            return 1 + countRecursive(node.next);
        }
    }
    ////////////Search element in a linked list///////////////////
    boolean SearchElement(int x)
    {
        Node n = head;
        while(n!=null)
        {
            if(n.data == x)
             return true; //element found 
             n= n.next;
        }
        return false; // element not found 
    }
    ///////////////////Reverse Linkedlist///////////////////
    void  reverseList() {
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
        display();
    }
    ///////////////////Print middle element of the linked list////////////////////
      void middleElement()
    {
        Node ptr1 = head; //  pointer
        Node ptr2 = head; // fast pointer

        while(ptr1.next !=null && ptr1.next.next !=null)
        {
            ptr1 = ptr1.next.next;
            ptr2=ptr2.next;
        }
       System.out.println("\nThe middle Element is :"+ptr2.data);

    }
    public static void main(String args[])
    {

        LL l1 = new LL();
        l1.head = new Node(10);
        Node l2 = new Node(20);
        Node l3 = new Node(30);
        Node l4 = new Node(40);
        Node l5 = new Node(50);
        Node l6 = new Node(60);
        l1.head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l6.next = l6;
        System.out.println("Starting List");
        l1.display();

        System.out.println("\nNo of Nodes in List " + l1.countNodes());
        System.out.println("\nNo of Nodes in List with recursivecall " + l1.countRecursive(l1.head));

        
        int x = 30;
        if (l1.SearchElement(x)) {
            System.out.println("\nElement found in the list");
        } else {
            System.out.println("\nElement not found in the list");
        }
      
        l1.reverseList();

        l1.middleElement();
    }
}
