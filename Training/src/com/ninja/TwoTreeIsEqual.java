/**
 * 
 */
package com.ninja;

/**
 * @author visr0617
 *
 */
public class TwoTreeIsEqual {

	public static void main(String[] args) {

		int[] A = { 4, 5, 89, 6, 3, 2, 1, 5, 7, 8, 4 };

		int[] B = { 4, 5, 89, 6, 3, 2, 1, 5, 7, 8, 4 };

		BinaryTree bt1 = new BinaryTree(A[0], null, null);
		BinaryTree bt2 = new BinaryTree(B[0], null, null);

		for (int i = 1; i < A.length; i++) {

			bt1.addNode(A[i]);

		}

		for (int i = 1; i < B.length; i++) {
			bt2.addNode(B[i]);
		}

		System.out.println(isEqualNode(bt1, bt2));
	}

	public static boolean isEqualNode(BinaryTree t1, BinaryTree t2) {

		if (t1 == null && t2 == null){
	//	System.out.println("returning 1");
			return true;
		}
		if (t1 == null || t2 == null){
		//	System.out.println("returning 2");
			return false;
		}
		if (t1.data != t2.data){
	//		System.out.println("t1.data " + t1.data + " t2.data  " + t2.data);
		//	System.out.println("returning 3");	
			return false;
		}
		return isEqualNode(t1.left, t2.left) && isEqualNode(t1.right, t2.right);
	}
}
