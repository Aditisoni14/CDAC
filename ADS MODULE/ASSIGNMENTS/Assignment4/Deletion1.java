class Deletion1{
    Node head;

    static class Node{
        int data;
        Node next;
       
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

    void deleteNode(int key)
{
	Node temp = head, prev = null;
	//Deletion in between & last node//
	while(temp != null && temp.data != key)
	{
		prev = temp;
		temp = temp.next;
	}
	//Non-existing element//
	if(temp == null)
		return;
	prev.next = temp.next;
}
    public static void main(String args[])
    {

        Deletion1 l1 = new Deletion1();
        l1.head = new Node(3);
        Node l2 = new Node(7);
        Node l3 = new Node(5);
        
        l1.head.next = l2;
        l2.next = l3;
       
        System.out.println("Starting List");
        l1.display();

        l1.deleteNode(7);
         System.out.println("\n\nDeletion of element");
         l1.display();
    }
}
       