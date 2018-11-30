import java.util.*;

public class Spiral54 {
    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new LinkedList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++){

            for(int j = i; j < col - i; j++){
                result.add(matrix[i][j]);
            }
            int curcol = col - i - 1;
            int currow = i + 1;
            if(curcol >= 0 && curcol < col){
                for(; currow < row - i; currow++){
                    result.add(matrix[currow][curcol]);
                }
            }
            currow = row - i - 1;
            if(currow < row){
                for(int j = col - i - 2; j >= i; j--){
                    result.add(matrix[currow][j]);
                }
            }

            curcol = i;
            currow--;
            if(currow >= 0 && currow < row){
                for(; currow > i; currow--){
                    result.add(matrix[currow][i]);
                }
            }

        }
        return result;
    }
    public static void main(String[] args){
//        int[][] array = {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
//        System.out.println(spiralOrder(array));
        char a = 'a';
        a ^= 256;
        System.out.println(a);
        a ^= 256;
        System.out.println(a);
        System.out.println(3 ^ 256);
    }
}
