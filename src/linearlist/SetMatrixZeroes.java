package linearlist;

public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		int row=matrix.length;
		int column=matrix[0].length;
		boolean columns[]=new boolean[column];
		boolean rows[]=new boolean[row];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(matrix[i][j]==0){
					columns[j]=true;
					rows[i]=true;
				}
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(rows[i]==true||columns[j]==true){
					matrix[i][j]=0;
				}
			}
		}
	}
}
