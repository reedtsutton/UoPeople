

// ANSWERS
		/*
		A_1000  = 3 milliseconds
		B_1000 =  4 milliseconds
		A_10000 = 53 milliseconds
		B_10000 = 57 milliseconds
		A_100000 = 4547 milliseconds 
		B_100000 = 4576 milliseconds 
		*/

import java.util.Arrays;

public class BenchmarkingSortingAlgorithms {

	

	public static void main(String[] args) {
		
		/*    
		Built-in sorting methods can be found in the class named Arrays in the package java.util. The one that you will use in this lab is Arrays.sort(A), which sorts the entire array A into increasing order. 
		*/

		/* set start time */
		long startTime = System.currentTimeMillis();

		/*
		Create two arrays of type int[]. Both arrays should be the same size, and the size should be given by a constant in the program so that you can change it easily. 
		*/

		int constant = 1000000;
		int[] A = new int[constant];
		int[] B = new int[constant];

		/*
		Fill the arrays with random integers. The arrays should have identical contents, with the same random numbers in both arrays. To generate random integers with a wide range of sizes, you could use (int)(Integer.MAX_VALUE * Math.random()). 
		*/

		for ( int i = 0; i < constant; i++ ) {
		int random = (int)(Integer.MAX_VALUE * Math.random());
		A[i] = random;
		B[i] = random;
		}

		/*
		Sort the first array using either Selection Sort or Insertion Sort. You should add the sorting method to your program; you can copy it from Section 7.4, if you want. (It is a good idea to check that you got the sorting method correct by using it to sort a short array and printing out the result.) 
		*/

		selectionSort(A);

		/* Time how long it takes to sort the array, and print out the time. */

		long runTimeA = System.currentTimeMillis() - startTime;
		long runTimeAS = runTimeA/1000;
		System.out.println("The runtime for array A using selectionSort is" + runTimeAS);

		/*
		Now, sort the second (identical) array using Arrays.sort(). Again, time how long it takes, and print out the time.
		*/

		Arrays.sort(B);

		// get runtime of code segment in seconds
		long runTimeB = System.currentTimeMillis() - startTime;
		long runTimeBS = runTimeB/1000;
		System.out.println("The runtime for array B using Arrays.sort is" + runTimeBS);

		

	}
	
	
	public static void selectionSort(int[] A) {
		// Sort A into increasing order, using selection sort
		for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
		// Find the largest item among A[0], A[1], ...,
		// A[lastPlace], and move it into position lastPlace
		// by swapping it with the number that is currently
		// in position lastPlace.
		int maxLoc = 0; // Location of largest item seen so far.
		for (int j = 1; j <= lastPlace; j++) {
		if (A[j] > A[maxLoc]) {
		// Since A[j] is bigger than the maximum we’ve seen
		// so far, j is the new location of the maximum value
		// we’ve seen so far.
		maxLoc = j;
		}
		}
		int temp = A[maxLoc]; // Swap largest item with A[lastPlace].
		A[maxLoc] = A[lastPlace];
		A[lastPlace] = temp;
		} // end of for loop
		}
	
}
