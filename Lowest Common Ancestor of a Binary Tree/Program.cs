
using System;

namespace LowestCommonAncestorOfABinaryTree
{
    class Program
    {
        public static void Main (string [] args)
        {
            TreeNode bababooey = new TreeNode(5);
            Console.WriteLine(bababooey.val);
            bababooey.val = 6;
            Console.WriteLine(bababooey.val);
        }

        /*
        public TreeNode LowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q)
        {
            
        }

        public TreeNode[] TreeNodeSort (TreeNode root, TreeNode p, TreeNode q)
        {
            root(5);
        }
        */

        public class TreeNode
        {
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode(int x)
            {
                val = x;
            }
        }
    }
}