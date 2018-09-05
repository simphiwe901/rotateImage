// Rotate Square matrix (nxn)
// 90 degrees clockwise

/**********************************************
 * Runtime Complexity             *
 *--------------------------------------------*
 Array          
 ------- 
 Access
 Best: O(1)		Worst: O(1)        
**********************************************/



public class rotateImage{

static int[][] rotateImageCW(int[][] valArray){
	int rows = valArray.length;
	int columns = valArray[0].length;

	int[][] solArray = new int[rows][columns];
	
		for(int row=0;row<rows;row++){
			for(int column=0;column<columns;column++){
				solArray[column][rows - row -1] = valArray[row][column];
					}
			}
			return solArray;
}
}

