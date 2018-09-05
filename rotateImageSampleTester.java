//Sample ImageRotation rotateImageTester
// Rotates 90 degrees clockwise
// Displays resulting Sqaure matrix

import java.util.*;
import java.io.*;


public class rotateImageSampleTester{
	public static void main(String[] args){
	int[][] valArray = {{1,2,3},
						{4,5,6},
						{7,8,9}};
	int rows = valArray.length;
	int columns = valArray[0].length;

	int[][] solArray = new int[rows][columns];
	try{
		for(int row=0;row<rows;row++){
			for(int column=0;column<columns;column++){
				solArray[column][rows - row -1] = valArray[row][column];
					}
			}

		//displays solution
		//In square matrix
		for (int i = 0; i < solArray.length; i++) {
    		for (int j = 0; j < solArray[i].length; j++) {
        		System.out.print(solArray[i][j] + " ");
    			}
    		System.out.println();
			}
		}

		//Throws possible Exception(s)
		catch(Exception e){
			System.out.print("Error detected: ");
			e.printStackTrace();
		}







}
}
