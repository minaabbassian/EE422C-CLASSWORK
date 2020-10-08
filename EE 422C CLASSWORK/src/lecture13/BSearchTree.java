package lecture13;

public class BSearchTree<E extends Comparable<E>> {
	BSTNode<E> overallRoot;
	private static final int SPACES_PER_LEVEL = 4;
	//int maxSize = 0;
	
	public BSearchTree() {
		this.overallRoot = null;
	}
	
	public void add(E value) {
		overallRoot = add(overallRoot, value);
	}
	
	private BSTNode<E> add(BSTNode<E> root, E value) {
		if (root == null) {
			root = new BSTNode<E>(value, null, null);
		}
		else if (root.data.compareTo(value) >= 0) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}
	
	public boolean find(E value) {
		return find(overallRoot, value);
	}
	
	private boolean find(BSTNode<E> root, E value) {
		if (root == null) {
			return false;
		}
		if (root.data.equals(value)) {
			return true;
		}
		if (value.compareTo(root.data) <= 0) {
			return find(root.left, value);
		}
		return find(root.right, value);
	}
	
	public BSTNode<E> findSmallest() {
		return findSmallest(overallRoot);
	}
	private BSTNode<E> findSmallest(BSTNode<E> root) {
		if (root == null) 
			return root;
		if (root.left == null) {
			return root;
		}
		return findSmallest(root.left);
	}
	
	public void clear() {
		overallRoot = null;
	}
	
	public void print() {
		print(overallRoot, 0	);
	}
	private void printSpaces(int level) {
		for (int i = 0; i < level*SPACES_PER_LEVEL; i++) {
			System.out.print(" ");
		}
	}
	private void print(BSTNode<E> root, int level) {
		if (root == null) return;
		if (root.isLeaf()) {
			printSpaces(level);
			System.out.println(root);
		} else {
			print(root.right, level + 1);
			printSpaces(level);
			System.out.println(root);
			print(root.left, level + 1);
		}
	}
	
	public void scan(){
		scan(overallRoot);
		
	}
	private void scan(BSTNode<E> root) {
		if (root == null ) return;
		scan(root.left);
		System.out.println(root.data);
		scan(root.right);
		
	}
	
	public void remove(E value) {
		// TODO for students
	}
	
	public BSTNode<E> findNode(E value) {
		return findNode(overallRoot, value);
	}
	
	public BSTNode<E> findNode(BSTNode<E> root, E value) {
		if (root == null) {
			return null;
		}
		if (root.data.equals(value)) {
			return root;
		}
		if (value.compareTo(root.data) <= 0) {
			return findNode(root.left, value);
		}
		return findNode(root.right, value);
	}
	
	public E successor(E value) {
		return null;
	}
	
	private BSTNode<E> successor(BSTNode<E> node) {
		
		// TODO: Write this method.
		// TODO for students: write an iterative method to find the next node in the
		// in-order traversal.  Can be used in an iterator.
		return null;
	}
	
	
	public void add1(E value) {
		overallRoot = add1(overallRoot, value);
	}

	private BSTNode<E> add1(BSTNode<E> root, E value) {
		if (root == null)
			root = new BSTNode<E>(value, null, null);
		else if (root.data.compareTo(value) < 0) 
			root.left = add1(root.left, value);
		else root.right = add1(root.right, value);
		return root;
	}
	
	// Does it work?  Why or why not?
	public void alternateAdd(E value) {
		alternateAdd(value, overallRoot);
	}
	private void alternateAdd (E value, BSTNode<E> root) {
		if (root == null) {
			root = new BSTNode<E>(value, null, null);
			return;
		}
		if (root.data.compareTo(value) < 1)
			alternateAdd(value, root.right);
		else
			alternateAdd(value, root.left);
	}
}
