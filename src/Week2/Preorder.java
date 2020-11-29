package Week2;

import java.util.*;

public class Preorder {

  /**
   * 迭代
   * @param root
   * @return
   */
  public List<Integer> preorder2(Node root) {
    List<Integer> res = new ArrayList<>();
    Deque<Node> stack = new LinkedList<>();
    if (root != null) {
      stack.push(root);
    }
    while (!stack.isEmpty()){
      Node poll = stack.pop();
      res.add(poll.val);
      for (int i=poll.children.size() - 1; i >=0; i--) {
        stack.push(poll.children.get(i));
      }
    }
    return res;
  }

  /**
   * 递归
   * @param root
   * @return
   */
  public List<Integer> preorder1(Node root) {
    List<Integer> res = new ArrayList();
    qianxu(root, res);
    return res;
  }

  public void qianxu(Node root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    for (int i = 0; i < root.children.size(); i++) {
      qianxu(root.children.get(i), res);
    }
  }

  class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }

}
