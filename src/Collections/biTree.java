package Collections;

public class biTree {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = BineryTree.buildTree(nodes);
		System.out.println(root.data+" is the root nodes");

	}

}
