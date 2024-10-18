package Tree_17;

import java.util.*;

public class BFS
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

    static List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result=new ArrayList<>();
        if(root== null) return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int levelSize=q.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<levelSize;i++)
            {
                TreeNode currentNode=q.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null)
                    q.offer(currentNode.left);
                if(currentNode.right!=null)
                    q.offer(currentNode.right);
            }
            result.add(currentLevel);
        }
        return  result;

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
        List<List<Integer>> result = levelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }

    }
}

