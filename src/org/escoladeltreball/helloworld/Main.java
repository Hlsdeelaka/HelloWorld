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
//
//		int[] v = { 2, 3, 4, 5, 3, 2, 1 };
//		Main main = new Main();
//		System.out.println(main.findSmallest(v));
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

	@Override
	public int[] merge(int[] values, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPresent(int[] values, int n) {
		// TODO Auto-generated method stub
		return false;
	}


}
