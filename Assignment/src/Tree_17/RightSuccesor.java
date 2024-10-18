package Tree_17;
//Given a tree and an integer k.....return its right succesor
import java.util.*;

public class RightSuccesor
{
      public static class TreeNode
      {
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

      static int levelOrder(TreeNode root,int k)
      {
          if(root== null) return 0;

          Queue<TreeNode> q=new LinkedList<>();
          q.offer(root);

          while(!q.isEmpty())
          {
              int levelSize=q.size();
              for(int i=0;i<levelSize;i++)
              {
                  TreeNode currentNode=q.poll();
                  if(currentNode.val==k)
                  {
                      return q.poll().val;
                  }
                  if(currentNode.left!=null)
                      q.offer(currentNode.left);
                  if(currentNode.right!=null)
                      q.offer(currentNode.right);
              }

          }
          return  -1;

      }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.right.left.left = new TreeNode(10);
        root.right.right.right = new TreeNode(11);

        // Call levelOrder method
        int result = levelOrder(root,7);

        System.out.println(result);
    }
}
