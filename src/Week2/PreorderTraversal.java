package Week2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {

  /**
   * 迭代
   * @param root
   * @return
   */
  public List<Integer> preorderTraversal1(TreeNode root) {
    LinkedList<TreeNode> deque = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    if (root == null) {
      return list;
    }
    deque.push(root);


    while(!deque.isEmpty()) {
      TreeNode node = deque.pop();
      list.add(node.val);
      if (node.right != null) {
        deque.push(node.right);
      }
      if (node.left != null) {
        deque.push(node.left);
      }


    }
    return list;

  }

  /**
   * 递归
   * @param root
   * @return
   */
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    qianxu(root, list);
    return list;
  }

  public void qianxu(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    qianxu(root.left, list);
    qianxu(root.right, list);
  }

  class TreeNode {

    int val;
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
  }
}
