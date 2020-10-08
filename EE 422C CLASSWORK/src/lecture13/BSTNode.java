package lecture13;

public class BSTNode<T extends Comparable<T>> {
	T data;
	BSTNode<T> left;
	BSTNode<T> right;
	BSTNode<T> parent;

	
	public BSTNode() {}
	
	public BSTNode(T data, BSTNode<T> left, BSTNode<T> right) {
		parent = null;
		this.left = left;
		this.right = right;
		this.data = data;
	}
	
	public boolean isLeaf() {
		return left == null && right == null;
	}
	
	@Override 
	public String toString () {
		return data.toString();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BSTNode<T> getLeft() {
		return left;
	}

	public void setLeft(BSTNode<T> left) {
		this.left = left;
	}

	public BSTNode<T> getRight() {
		return right;
	}

	public void setRight(BSTNode<T> right) {
		this.right = right;
	}

	public BSTNode<T> getParent() {
		return parent;
	}

	public void setParent(BSTNode<T> parent) {
		this.parent = parent;
	}
	
	public boolean hasLeftChild() {
		return !(left == null);
	}
}
