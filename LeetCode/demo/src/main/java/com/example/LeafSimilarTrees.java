import java.util.ArrayList;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2){
        ArrayList<Integer> leaves1 = new ArrayList<>();
        ArrayList<Integer> leaves2 = new ArrayList<>();
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void collectLeaves(TreeNode node, ArrayList<Integer> leaves){
        if(node ==null){
            return;
        }
        if(node.left == null && node.right == null){
            leaves.add(node.val);
        }
        collectLeaves(node.left, leaves);
        collectLeaves(node.right, leaves);
    }

}

