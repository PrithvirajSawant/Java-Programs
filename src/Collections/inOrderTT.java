package Collections;

public class inOrderTT {
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	
	static class BinaryTree
	{
		static int idx = -1;
		public static Node buildTree(int nodes[])
		{
			idx++;
			if(nodes[idx] == -1)
			{
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes); 
			newNode.right = buildTree(nodes);
			return newNode;
		}
	}
	
	public static void inOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		//Order
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//		BinaryTree tree = new BinaryTree();
		Node root = BinaryTree.buildTree(nodes);
		inOrder(root);
	}

}
