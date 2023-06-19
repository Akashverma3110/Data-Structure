
public class Tester {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		
		try {
			bst.addNode(50);
			bst.addNode(30);
			bst.addNode(20);
			bst.addNode(90);
			bst.addNode(60);
			bst.addNode(80);
			bst.addNode(10);
			
			System.out.print("Inorder: ");
			bst.inOrder();
			System.out.println();
			System.out.print("PreOrder: ");
			bst.preOrder();
			System.out.println();
			System.out.print("Postorder: ");
			bst.postOrder();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
