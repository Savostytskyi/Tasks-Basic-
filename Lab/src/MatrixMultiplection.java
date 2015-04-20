public class MatrixMultiplection {
    public static void MatrixMul() {
        int[][] A = 
            {{3,4,2},
             {3,9,0},
             {2,4,7},
             {4,4,5}};
        
        int[][] B = 
            {{1,1,3,5},
             {3,4,7,8},
             {5,6,1,6}};

        if(!checkMatrix(A, B))
        {
        	throw new IllegalArgumentException();
        }
   
     
        
        int m = A.length;
        int n = B[0].length;
        int o = B.length;
        
        
        
        int[][] res = new int[m][n];
        
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += A[i][k] * B[k][j]; 
                }
            }
        }
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    private static boolean checkMatrix(int[][] a, int[][] b){
        boolean res = true;

        if(!checking(a) || !checking(b) || a[0].length != b.length){
            res = false;
        }
        return res;
    }

    private static boolean checking(int[][] arr){
        int row = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != row)
            {
                return false;
            }
        }
        return true;
    }

   
}
