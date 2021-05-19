package program3;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import program3.CompleteBinaryTree.Node;

public class CompleteBinaryTreeTest {
	@Test
	public void testCompleteBinaryTree() {//this test case checks for complete binary tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.right = new Node(5);
		root.left.left = new Node(3);
		root.right.left = new Node(8);
		assertTrue("true", CompleteBinaryTree.isCompleteBT(root));

	}
	
	@Test
	public void testNotCompleteBinaryTree() {  // this test case checks for not complete binary tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.right = new Node(5);
		root.left.left = new Node(3);
		root.right.right = new Node(8);
		assertNotSame("false", CompleteBinaryTree.isCompleteBT(root));

	}
}
