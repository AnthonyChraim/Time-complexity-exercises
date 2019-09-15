/*
Suppose each row of an n x n array A consists of 1's
and 0's such that, in any row of A, all the 1's come
before any of the 0's in that row. Assuming A is
already in memory, describe a method running in
O(n) time (not O(n2) time) for finding the row of A
that contains the most 1's.
 */


public class TUT1_containsMost1 {

	public static void main(String[] args) {
		int [][] arr1_0 = {{0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1,1,1,1,0}, {1,1,0,0,0}};	
		most1(arr1_0);
	}

	public static void most1(int [][] arr1_0) {
		int row = 0, column = 0;
		int max1 = 0, maxrow = 0;
		while(row < arr1_0.length) {
			if(arr1_0[row][column] == 1) {
				max1++;
				column++;
				maxrow = row;
			}
			else
				row++;
		}
		System.out.println("Row: " + maxrow +"\nNumber of 1s: " + max1);
		
		
	}
	
}
