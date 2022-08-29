package com.company;

public class TreeNode {
  /*  int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) {
                return 0;
            }
            int sum = 0;
            if (root.val >= low && root.val <= high) {
                sum += root.val;
            }
            // проходимся по правой ветке
            if (root.val < high) {
                sum += rangeSumBST(root.right, low, high);
            }
            // проходим по левым веткам
            if (root.val > low) {
                sum += rangeSumBST(root.left, low, high);

            }
            return sum;
        }*/
    }


