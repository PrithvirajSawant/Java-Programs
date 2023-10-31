package Collections;

public class postOrderTT {
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
	
	static class BineryTree
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
	
	public static void postOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		//Order
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//		BineryTree tree = new BineryTree();
		Node root = BineryTree.buildTree(nodes);
		postOrder(root);

	}

}
