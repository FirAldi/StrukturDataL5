package LatihanPrak5;

public class Main {
	public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);
        System.out.println("\nPre order : ");
        tree.preOrder(tree.root);
        System.out.println("\nIn order : ");
        tree.inOrder(tree.root);
        System.out.println("\nPost order : ");
        tree.postOrder(tree.root);
	}
}