
public class SpiralMartix {

    public static void spiralmatrix(int matrix[][]){
        int startRow =0;
        int startColumn =0;
        int endRow =matrix.length-1;
        int endColumn = matrix[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){

            //top
            for(int i=startColumn;i<=endColumn;i++){
                System.out.print(matrix[startRow][i]+" ");
            }

            //right
            for (int j = startRow+1; j <=endRow; j++) {
                System.out.print(matrix[j][endColumn]+" ");                
            }

            //bottom
            for(int k = endColumn-1;k>=startColumn;k--){
                if(startRow==endRow ){
                    break;
                }
                System.out.print(matrix[endRow][k]+" ");
            }


            // left
            for (int l = endRow-1; l >= startRow+1; l--) {
                if(startColumn==endColumn ){
                    break;
                }
                System.out.print(matrix[l][startColumn]+" ");                
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
    }



    public static void main(String[] args) {
        int matrix [][]={{1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12},
                        {13,14,15}};

        spiralmatrix(matrix);
    }

}
        
