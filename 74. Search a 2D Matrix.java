public class Solution {
   public static boolean searchMatrix(int[][] matrix, int target)
	{
		int row = matrix.length-1;
		int col = matrix[0].length-1;
		int top = 0, left = 0;
		int midRow = (row+top)/2;
//		boolean less = false;
//		boolean greater = false;
		//search the row, ensure the target is exactly between the two row.
		while(top<=row)
		{
			if(matrix[midRow][0]<target)
			{
				if ((midRow + 1) < matrix.length
						&& matrix[midRow + 1][0] > target)
					break;
				top = midRow + 1;
				midRow = (row+top)/2;

			}else if (matrix[midRow][0]>target)
			{
				if ((midRow - 1) >= 0 && matrix[midRow - 1][0] < target)
					{midRow--;break;}
				row = midRow - 1;
				midRow = (row+top)/2;
			}
			else return true;
		}
		//search the col
		int midCol = (left+col)/2;
		while(left<=col)
		{
			if(matrix[midRow][midCol]<target)
			{
				left = midCol+1;
				midCol = (left+col)/2;
			}else if(matrix[midRow][midCol]>target)
			{
				col = midCol-1;
				midCol = (left+col)/2;
			}
			else return true;
		}
		return false;
		
	}
}
