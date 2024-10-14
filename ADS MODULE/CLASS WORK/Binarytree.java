class Binarytree{
    Node root;  //starting point of tree

    static class Node{
        int data;
        Node right;
        Node left;
        

        Node(int d)
        {
            data = d;
            right = null;
            left = null;
        
        }
    }
    Binarytree()
    {
     root = null;
    }

    Binarytree(int d)
    {
        root = new Node(d);
    }
    void printInorder(Node node)
    {
        if(node==null)
        return;
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
    }
    void Inorder()
    {
        printInorder(root);
    }
    void printPreorder(Node node)
    {
        if(node==null)
        return;
        System.out.print(node.data+" ");
        printInorder(node.left);
        printInorder(node.right);
    }
    void Preorder()
    {
        printPreorder(root);
    }
    void printPostorder(Node node)
    {
        if(node==null)
        return;
        printInorder(node.left);
        printInorder(node.right);
        System.out.print(node.data+" ");
    }
    void Postorder()
    {
        printPostorder(root);
    }

    public static void main(String[] args)
    {
        Binarytree t1 = new Binarytree();
        t1.root= new Node(11);
        t1.root.left = new Node(22);
        t1.root.right = new Node(33);
        t1.root.left.left = new Node(44);
        t1.root.left.right = new Node(55);
        t1.root.right.left = new Node(66);
        t1.root.right.right = new Node(77);


        System.out.println("PreOrder:");
		t1.Preorder();
		System.out.println();
		
		System.out.println("InOrder:");
		t1.Inorder();
		System.out.println();
		
		System.out.println("PostOrder:");
		t1.Postorder();
		System.out.println();
    }
}