
public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void addNode(int data) throws Exception
	{
		Node newNode=new Node();
		newNode.setData(data);
		newNode.setLeft(null);
		newNode.setRight(null);
		
		if(root==null) {
			root = newNode;
		}else {
			Node trav=root;
			while(true)
			{
				if(newNode.getData()<trav.getData())
				{
					if(trav.getLeft()==null)
					{
						trav.setLeft(newNode);
						break;
					}else {
						trav=trav.getLeft();
					}
				}else if(newNode.getData()>trav.getData()) {
					if(trav.getRight()==null)
					{
						trav.setRight(newNode);
						break;
					}else {
						trav=trav.getRight();
					}
				}else {
					throw new Exception("Duplicate value not allowed");
				}
					
			}
		}
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node trav) {
		if(trav!=null) {
			inOrder(trav.getLeft());
			System.out.print(trav.getData()+" ");
			inOrder(trav.getRight());
		}
	}
	
    public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(Node trav) {
		if(trav!=null) {
			System.out.print(trav.getData()+" ");
			inOrder(trav.getLeft());
			inOrder(trav.getRight());
		}
	}
	
    public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(Node trav) {
		if(trav!=null) {
			inOrder(trav.getLeft());
			inOrder(trav.getRight());
			System.out.print(trav.getData()+" ");
		}
	}

}
