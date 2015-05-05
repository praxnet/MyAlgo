package com.matrix;

public class SpiralPrintofMatrix {

	public void spiralOrder(int[][] matrix)
	{
		if(matrix.length == 0)
			return;
		// Initialize our four indexes
		int top = 0;
		int down = matrix.length - 1; //rows
		int left = 0;
		int right = matrix[0].length - 1; //coloums

		//while(top < down || left < right)  //will not work : will leave center element of n*n matrix
		while(true)
		{
			// Print top row
			for(int j = left; j <= right; j++) 
				System.out.print(matrix[top][j] + " ");

			top++;

			if(top > down || left > right) 
				break;

			//Print the rightmost column
			for(int i = top; i <= down; i++) 
				System.out.print(matrix[i][right] + " ");

			right--;

			if(top > down || left > right) 
				break;

			//Print the bottom row
			for(int j = right; j >= left; j--) 
				System.out.print(matrix[down][j] + " ");

			down--;

			if(top > down || left > right) 
				break;

			//Print the leftmost column
			for(int i = down; i >= top; i--) 
				System.out.print(matrix[i][left] + " ");

			left++;

			if(top > down || left > right) 
				break;
		}

	}

	public static void main(String[] args)
	{
		int matrix[][] = new int[5][5];

		int rows = matrix.length;
		int cols = matrix[0].length;

		System.out.println("Rows-> "+rows+" Cols-> "+cols);

		int k = 1;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j] = k;
				k++;
			}
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}

		System.out.println();

		SpiralPrintofMatrix sp = new SpiralPrintofMatrix();
		sp.spiralOrder(matrix);
	}
}