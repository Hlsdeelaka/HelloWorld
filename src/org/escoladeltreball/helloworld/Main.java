/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author jmendez
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] v = { 2, 3, 4, 5, 3, 2, 1 };
		Main main = new Main();
		System.out.print(main.findSmallest(v));
	}

	/*
	 * (non-Javadoc) This methods returns the smallest value from values
	 * 
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		int temp = values[0];
		for (int value : values) {
			if (value < temp) {
				temp = value;
			}
		}
		return temp;
	}

	@Override
	public int sum(int[] values) {
		int temp = 0;
		for (int value : values) {
			temp += value;
		}
		return temp;
	}

	@Override
	public int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}

	
	public double frequencyPercentage(int[] values, int n) {
		return ((double) frequency(values, n)) / values.length * 100;
	}

	/*
	 * This method returns an integer array with n in its place
	 * NOTE: values is an ordered array
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] merged = new int[values.length + 1];
		int i = 0;
		while(i < values.length && values[i] <= n) {
			merged[i] = values[i];
			i++;
		}
		merged[i] = n;
		for(; i < values.length; i++) {
			merged[i + 1] = values[i]; 
		}
		return merged;
	}

	@Override
	public boolean isPresent(int[] values, int n) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and row 1 holding odd numbers
	 * NOTE: Don't waste space!!!
	 */	
	@Override
	public int[][] split(int[] values) {
		int[][] matrix = new int[2][]; 
		int evenNumbersCounter = 0, oddNumbersCounter = 0;
		int evenNumbersIndex = 0, oddNumbersIndex = 0;
		for(int value: values) {
			if (value % 2 == 0) {
				evenNumbersCounter++;
			}
			else {
				oddNumbersCounter++;
			}
		}
		matrix[0] = new int[evenNumbersCounter];
		matrix[1] = new int[oddNumbersCounter];
		for(int value: values) {
			if (value % 2 == 0) {
				matrix[0][evenNumbersIndex++] = value;
			}
			else {
				matrix[1][oddNumbersIndex++] = value;
			}
		}
		return matrix;
	}


}
