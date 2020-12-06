package Week3;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeNode {


  public TreeNode buildTree(int[] preorder, int[] inorder) {
    int prdLength = preorder.length;
    int inLength = inorder.length;
    Map<Integer, Integer> inMap = new HashMap();

    for (int i = 0; i < inLength; i++) {
      inMap.put(inorder[i], i);
    }
    return build(inMap, preorder, inorder, 0 , prdLength - 1, 0, inLength - 1);

  }

  /**
   * 前序遍历 preorder = [3,9,20,15,7]
   中序遍历 inorder = [9,3,15,20,7]
   * @param inMap
   * @return
   */
  public TreeNode build(Map<Integer, Integer> inMap, int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
    if (preLeft > preRight || inLeft > inRight) {
      return null;
    }

    int preRoot = preLeft;
    Integer rootIndex = inMap.get(preorder[preRoot]);
    TreeNode treeNode = new TreeNode(preorder[preRoot]);
    int leftSize = rootIndex - inLeft;
    treeNode.left = build(inMap, preorder, inorder, preLeft + 1, preLeft + leftSize, inLeft, rootIndex - 1);
    treeNode.right = build(inMap, preorder, inorder, preLeft + leftSize + 1, preRight, rootIndex + 1, inRight);
    return treeNode;

  }

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
