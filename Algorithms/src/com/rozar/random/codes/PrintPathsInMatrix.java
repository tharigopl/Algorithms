package com.rozar.random.codes;

public class PrintPathsInMatrix {

	public static Integer[][] input = {{2,3,4},{5,6,7}};
	public static int noOfRows = input.length;
	public static int noOfCols = input[0].length;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(noOfRows);
		System.out.println(noOfCols);
		printAllPaths(0,0);
		
	}
	
	public static void printAllPaths(int currentRow, int currentCol){
		
		if(currentRow > noOfRows - 1 || currentCol > noOfCols - 1){
			
		}
		// you are at the destination
		else if(currentRow == noOfRows - 1 && currentCol == noOfCols - 1){
			//System.out.print(input[currentRow][currentCol] + " ");
			System.out.println();
		}
		else{			
			// Move down
			/*if(currentRow == noOfRows - 1){
				// at the last row so can move only right
				System.out.print(input[currentRow][currentCol] + " ");
				printAllPaths(currentRow, currentCol + 1);
			}else{
				System.out.print(input[currentRow][currentCol] + " ");
				printAllPaths(currentRow + 1, currentCol);
			}
						
			// Move right
			if(currentCol == noOfCols - 1){
				// at the last row so can move only right
				System.out.print(input[currentRow][currentCol] + " ");
				printAllPaths(currentRow + 1, currentCol);
			}else{
				printAllPaths(currentRow, currentCol + 1);
				System.out.print(input[currentRow][currentCol] + " ");
			}*/
		}		
	}

}
