package Tree_17;
import java.util.*;
public class SymmetricTree101
{
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSymmetric(TreeNode root)
    {
        //List<Integer> arr=new ArrayList<Integer>();
        int c=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        //static int arr[]=new int[2*c];
        while(!q.isEmpty())
        {
            int k=0;
            int levelSize=q.size();
            int arr[]=new int[(int)Math.pow(2,c)];
            for(int i=0;i<levelSize;i++,k++)
            {


                TreeNode current=q.poll();
                //arr.add(current.val);
                if(current.left!=null)
                    q.offer(current.left);
                else
                    q.offer(null);

                if(current.right!=null)
                    q.offer(current.right);
                else
                    q.offer(null);


                arr[k]=current.val;

                if(i==levelSize-1)
                {
                    int back=arr.length-1;
                    for(int j=0;j<arr.length/2;j++,back--)
                    {
                        if(arr[j]!=arr[back]) return false;
                    }

                }

            }

            c++;

        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        //root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        //root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
//        root.left.left.left = new TreeNode(8);
//        root.left.left.right = new TreeNode(9);
//        root.right.left.left = new TreeNode(10);
//        root.right.right.right = new TreeNode(11);

        System.out.println(isSymmetric(root));



    }

}
