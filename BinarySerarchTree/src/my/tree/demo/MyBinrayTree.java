package my.tree.demo;

public class MyBinrayTree {
	public static Node root;
	
	public MyBinrayTree(){
		root = null;
	}
	public boolean find(int id){
		Node current = root;
		while(current !=null){
			if(current.getData()==id){
				return true;
			}else if(current.getData()<id){
				current = current.getLeft();
			}else{
				current = current.getRight();
			}
		}
		return false;
	}
	public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.getData()!=id){
			parent = current;
			if(current.getData()<id){
				current = current.getLeft();
				isLeftChild = true;
			}else{
				current = current.getRight();
				isLeftChild = false;
			}
			if(current ==null){
				return false;
			}
		}
		
		//if Node has no child
		if(current.getLeft()==null && current.getRight()==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild == true){
				parent.setLeft(null);
			}else{
				parent.setRight(null);
			}
		}
		else if(current.getLeft()==null){
			if(current==root){
				root = current.getRight();
			}else if(isLeftChild){
				parent.setLeft(current.getRight());
			}else{
				parent.setRight(current.getRight());
			}
			
		}else if(current.getRight()==null){
			if(current==root){
				root = current.getLeft();
			}else if(isLeftChild){
				parent.setLeft(current.getLeft());
			}else{
				parent.setRight(current.getLeft());
			}
		}else if(current.getLeft()!=null && current.getRight()!=null){
			Node next = getNextNode(current);
			if(current==root){
				root = next;
			}else if(isLeftChild){
				parent.setLeft(next);
			}else{
				parent.setRight(next);
			}
			next.setLeft(current.getLeft());
		}
		return true;
	}
	
	public Node getNextNode(Node temp){
		Node next = null;
		Node parent =null;
		Node current = temp.getRight();
		while(current!=null){
			parent = next;
			next = current;
			current = current.getLeft();
		}
		if(next != temp.getRight()){
			parent.setLeft(next.getRight());
			next.setRight(temp.getRight());
		}
		return next;
	}

	public void insert(int id){
		Node newNode = new Node(id);
		if(root ==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.getData()){				
				current = current.getLeft();
				if(current==null){
					parent.setLeft(newNode);
					return;
				}
			}else{
				current = current.getRight();
				if(current==null){
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	//In-order Print left->root->right
	public void display(Node root){
		if(root!=null){
			display(root.getLeft());
			System.out.print(" "+root.getData());
			display(root.getRight());
		}
	}
	
	public static void main(String[] args){
		MyBinrayTree myObj = new MyBinrayTree();
		myObj.insert(3);
		myObj.insert(6);
		myObj.insert(11);
		myObj.insert(5);
		myObj.insert(10);
		myObj.insert(7);
		System.out.println("Tree = ");
		myObj.display(root);
		myObj.delete(5);
		System.out.println("Tree = ");
		myObj.display(root);
		
	}
}
