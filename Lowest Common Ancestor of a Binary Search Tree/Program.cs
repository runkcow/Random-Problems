
using System;

namespace LowestCommonAncestorOfABinaryTree
{
    class Program
    {

        static void Main (string[] args)
        {
            
        }

        // solution
        public TreeNode LowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q)
        {
            /* Solution with loops
            bool loop = true;
            while (loop)
            {
                if (p.val < root.val && q.val < root.val)
                {
                    root = root.left;
                }
                else if (p.val > root.val && q.val > root.val)
                {
                    root = root.right;
                }
                else
                {
                    loop = false;
                }
            }
            return root;
            */
            
            // Solution with recursion
            if (p.val < root.val && q.val < root.val)
            {
                return LowestCommonAncestor(root.left, p, q);
            }
            else if (p.val > root.val && q.val > root.val)
            {
                return LowestCommonAncestor(root.right, p, q);
            }
            else
            {
                return root;
            }
        }

        // tree node
        public class TreeNode
        {
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode (int x) 
            {
                val = x;
            }
        }
    }

}