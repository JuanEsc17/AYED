package tp2.ej3;

import java.util.LinkedList;
import java.util.List;

import tp2.ej1.BinaryTree;

public class ContadorArbol {
	
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public List<Integer> paresPre(){
		List<Integer> l = new LinkedList<Integer>();
		if(!arbol.isEmpty()) this.numsParesPre(l,arbol);
		return l;
	}
	
	public void numsParesPre(LinkedList<Integer> l, BinaryTree<Integer> arbol) {
		if(arbol.getData()%2==0) l.add(arbol.getData());
		if(arbol.hasLeftChild()) numsParesPre(l,arbol.getLeftChild());
		if(arbol.hasRightChild()) numsParesPre(l,arbol.getRightChild());
	}
	
	public List<Integer> paresIn(){
		List<Integer> l = new LinkedList<Integer>();
		if(!arbol.isEmpty()) this.numsParesIn(l,arbol);
		return l;
	}
	
	public void numsParesIn(LinkedList<Integer> l, BinaryTree<Integer> arbol) {
		if(arbol.hasLeftChild()) numsParesIn(l,arbol.getLeftChild());
		if(arbol.getData()%2==0) l.add(arbol.getData());
		if(arbol.hasRightChild()) numsParesIn(l,arbol.getRightChild());
	}
	
	public List<Integer> paresPost(){
		List<Integer> l = new LinkedList<Integer>();
		if(!arbol.isEmpty()) this.numsParesPost(l,arbol);
		return l;
	}
	
	public void numsParesPost(LinkedList<Integer> l, BinaryTree<Integer> arbol) {
		if(arbol.hasLeftChild()) numsParesPost(l,arbol.getLeftChild()); 
		if(arbol.hasRightChild()) numsParesPost(l,arbol.getRightChild());
		if(arbol.getData()%2==0) l.add(arbol.getData());
	}
	
	
	
	
}
