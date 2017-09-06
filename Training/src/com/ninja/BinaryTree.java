/**
 * 
 */
package com.ninja;

/**
 * @author visr0617
 *
 */
public class BinaryTree {

	 int data;
	 BinaryTree left;
	 BinaryTree right;

	public BinaryTree(int data, BinaryTree left, BinaryTree right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public void addNode(int data) {
		if (data < this.data) {
			if (this.left != null) {
				this.left.addNode(data);
			} else {
				this.left = new BinaryTree(data, null, null);
			}

		}else{
			
			if(this.right!=null)
			this.right.addNode(data);
			else
			this.right = new BinaryTree(data, null, null);
			
		}

	}

	
	public void traverse(){
		
		
		
	if(this.left!=null)
		this.left.traverse();
	System.out.print(" " + this.data);
	if(this.right!=null)
	this.right.	traverse();
		
	}
	
	
	@Override
	public String toString() {
		return "BinaryTree [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
