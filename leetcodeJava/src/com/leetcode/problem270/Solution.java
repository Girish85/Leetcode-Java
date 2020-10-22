package com.leetcode.problem270;

public class Solution {

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(3);
		TreeNode treeNodep1 = new TreeNode(2, treeNode1, treeNode2);
		TreeNode treeNodep2 = new TreeNode(5);
		TreeNode rooTreeNode = new TreeNode(4, treeNodep1, treeNodep2);
		double target = 3.75;
		System.out.println("Value : "+closestValue(rooTreeNode, target));
	}

    public static int closestValue(TreeNode root, double target) {
    	double diff = root.val - target;
    	diff = (diff>0)?diff:-diff;
    	if (root.val>target) {
			return getValue(root.left, diff, root.val, target);
		} else if (root.val<target) {
			return getValue(root.right, diff, root.val, target);
		}
		return root.val;       
    }
    
    public static int getValue(TreeNode tNode,double currentdiff, int current, double target) {
    	if (tNode==null) {
			return current;
		}
    	double diff = tNode.val-target;
    	diff = (diff>0)?diff:-diff;
		if (diff<currentdiff) {
			current = tNode.val;
			currentdiff = diff;
		}
		if (tNode.val>target) {
			return getValue(tNode.left, currentdiff, current, target);
		}
		else {
			return getValue(tNode.right, currentdiff, current, target);
		}
	}
}
