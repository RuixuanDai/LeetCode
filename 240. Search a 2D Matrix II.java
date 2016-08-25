public class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
	{
		int row = matrix.length;
		int col = matrix[0].length;
		if(row==0 || col==0)
			return false;
		int i=0, j = col-1;
		while(i<row&&j>=0)
		{
			int temp = matrix[i][j];
			if(target == temp)
				return true;
			else if(target > temp)
				i ++;
			else 
				j --;
		}
		return false;
		
	}
}
