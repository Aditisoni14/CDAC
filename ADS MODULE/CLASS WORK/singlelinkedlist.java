class singlelinkedlist{
          
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
    // Insert Element // 
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data+ "--->");
			n=n.next;
		}
	}
    //////////////////////////////INSERTION OPERATION///////////////////////////////////////
    // Insertion at the begning //

    void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
     // Insertion in between or Insertion after a node //

     void insertafter(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
    }
    // Insertion in Last //
    void append(int new_data)
    {
        Node new_node = new Node (new_data);
        if(head == null)
        {
            head = new Node(new_data);    // first node become the last node //
            return;
        }
        Node last = head;
        while(last.next != null) 
        {
            last = last.next;
        }
        last.next = new_node;
        return;
    }
/////////////////////////////////////DELETION OPERATION ////////////////////////////////////////////
void deleteNode(int key)
{
	Node temp = head, prev = null;
	//Deletion at begining//
	if(temp != null && temp.data == key)
	{
		head = temp.next;
		return;
	}
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
void deleteNode1(int position)//Deletion on the particular position //
{
	if(head == null)
		return;
	
	Node temp = head;
	//DEletion at the begining
	if(position == 0)
	{
		head = temp.next;// head position change
		return;
	}
	
	for(int i = 0; temp != null && i<position-1; i++)
	{
		temp = temp.next;
	}
	if(temp == null || temp.next == null)
		return;
	Node next = temp.next.next;
	temp.next = next;
}

	public static void main(String args[])
	{
	   singlelinkedlist l1 = new singlelinkedlist();
		l1.head = new Node(10);
		Node l2 = new Node( 20);
		Node l3 = new Node(30);
		l1.head.next = l2;
		l2.next = l3;
        System.out.println("INSERTING NODES");
        l1.display();
		
        System.out.println();
		l1.insert(40);
		l1.insert(50);
        System.out.println("Insertion at the Begining ");
        l1.display();


        System.out.println();
        l1.insertafter(l1.head, 60);
        l1.insertafter(l1.head.next, 100);
        System.out.println("Insertion in Between");
		l1.display();

        System.out.println();
        l1.append(70);
        System.out.println("Insertion at end ");
		l1.display();

        System.out.println();
        l1.deleteNode(50);
       // l1.deleteNode(100); in between element //
       // l1.deleteNode(70); last element// 
        System.out.println("Deletion of element");
		l1.display();

        System.out.println();
        l1.deleteNode1(2);
        System.out.println("Deletion on the position 2"); //40 will delete
		l1.display();
	
}
}
