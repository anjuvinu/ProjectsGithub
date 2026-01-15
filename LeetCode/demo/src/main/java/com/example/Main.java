public class Main {
    public static void main(String[] args) {
        // Tree 1 Construction
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        // Tree 2 Construction (Different structure, same leaves)
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        // Run the solution
        LeafSimilarTrees sol = new LeafSimilarTrees();
        boolean result = sol.leafSimilar(root1, root2);
        
        System.out.println("Are the trees leaf-similar? " + result); 
        // Expected Output: true
    }
}