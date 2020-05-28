/*program to print all the leaf nodes of the binary tree
 input : a
        / \
       b   f
      / \ / \
     c  e g  h
    /         \
   d           k
*/
package com.tgt.igniteplus;
public class BinTree {
    public static void main(String[] args) throws Exception {
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode g = new TreeNode("g");
        TreeNode k = new TreeNode("k");
        TreeNode c = new TreeNode("c", d, null);
        TreeNode h = new TreeNode("h", k, null);
        TreeNode b = new TreeNode("b", c, e);
        TreeNode f = new TreeNode("f", g, h);
        TreeNode root = new TreeNode("a", b, f);
        System.out.println("All the leaf nodes of binary tree are "); printLeaves(root);
    }
    private static class TreeNode {
        String value;
        TreeNode left;
        TreeNode right;
        TreeNode(String value) { this.value = value; }
        TreeNode(String data, TreeNode left, TreeNode right) {
            this.value = data;
            this.left = left;
            this.right = right;}
        boolean isLeaf() { return left == null ? right == null : false; }
    }
    public static void printLeaves(TreeNode node) {
        if (node == null) { return; }
        if (node.isLeaf()) { System.out.printf("%s ", node.value); }
        printLeaves(node.left);
        printLeaves(node.right);
    }
}
/*OUTPUT:
All the leaf nodes of binary tree are
d e g k
 */