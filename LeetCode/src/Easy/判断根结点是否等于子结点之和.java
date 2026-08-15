package Easy;


public class 判断根结点是否等于子结点之和 {

    static class TreeNode {
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

    public boolean checkTree(TreeNode root) {
        /*int leftVal = root.left.val;
        int rightVal = root.right.val;
        int rootVal = root.val;
        if(leftVal + rightVal == rootVal){
            return true;
        }else{

            return false;
        }*/
        return root.val == root.left.val + root.right.val;//最简写法
    }

    public static void main(String[] args) {
        // 测试用例1：[10,4,6] 预期true
        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(6);
        TreeNode root1 = new TreeNode(10, left1, right1);

        判断根结点是否等于子结点之和 sol = new 判断根结点是否等于子结点之和();
        boolean res1 = sol.checkTree(root1);
        System.out.println("测试1结果：" + res1);

        // 测试用例2：[5,3,1] 预期false
        TreeNode left2 = new TreeNode(3);
        TreeNode right2 = new TreeNode(5);
        TreeNode root2 = new TreeNode(5, left2, right2);
        boolean res2 = sol.checkTree(root2);
        System.out.println("测试2结果：" + res2);
    }
}
