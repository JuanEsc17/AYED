package tp2.ej1;

public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;
	
	public BinaryTree() {
	}
	
	public BinaryTree(T data) {
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public BinaryTree<T> getLeftChild(){
		return leftChild;
	}
	
	public BinaryTree<T> getRightChild(){
		return rightChild;
	}
	
	public void addLeftChild(BinaryTree<T> hijo) {
		leftChild = hijo;
	}
	
	public void addRightChild(BinaryTree<T> hijo) {
		rightChild = hijo;
	}
	
	public void removeLeftChild() {
		leftChild = null;
	}
	
	public void removeRightChild() {
		rightChild = null;
	}
	
	public boolean isEmpty() {
		return (this.isLeaf() && (data == null));
	}
	
	public boolean isLeaf() {
		return !(this.hasRightChild())&&(this.hasLeftChild());
	}
	
	public boolean hasLeftChild() {
		return this.getLeftChild() != null;
	}
	
	public boolean hasRightChild() {
		return this.getRightChild() != null;
	}
}
