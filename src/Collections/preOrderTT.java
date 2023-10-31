package Collections;

//Pre-order Tree traversal
// Traverse order root -> Left Sub Tree -> Right Sub Tree
public class preOrderTT {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

	}

	// Pre-Order Traversal
	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = BinaryTree.buildTree(nodes);
		preOrder(root);
	}

}
