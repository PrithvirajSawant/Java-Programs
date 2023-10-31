package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTT {
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

	static class BineryTree {
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

	public static void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node currNode = q.remove(); // it will remove the 1st element FIFO
			if (currNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null); // this we have here so we store null & when the condition is checked in line 55
									// we can go to the next line
				}
			} else {
				System.out.print(currNode.data + " "); // Follows BFS
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//		BineryTree tree = new BineryTree();
		Node root = BineryTree.buildTree(nodes);
		levelOrder(root);

	}

}
