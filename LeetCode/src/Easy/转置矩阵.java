package Easy;

public class 转置矩阵 {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;  //原行数
        int n = matrix[0].length; //原列数
        //转置后：变成n行m列
        int[][] res = new int[n][m];

        for (int i = 0;i<m;i++){
            for (int j = 0;j<n; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        转置矩阵 test = new 转置矩阵();
        int[][] mat = {{1,2,3},{4,5,6}};
        int[][] ans = test.transpose(mat);
        for(int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
