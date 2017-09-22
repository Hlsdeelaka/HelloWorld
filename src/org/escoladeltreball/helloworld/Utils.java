/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author jmendez
 *
 */
public interface Utils {
	
	/*
	 * This method returns an integer matrix with row 0 holding even numbers and row 1 holding odd numbers
	 * NOTE: Don't waste space!!!
	 */	
	public abstract int[][] split(int[] values);

	/*
	 * This method returns an integer array with n in its place
	 * NOTE: values is an ordered array
	 */
	public abstract int[] merge(int[] values, int n);
	
	/*
	 * This method returns true if n is present in values
	 */
	public abstract boolean isPresent(int[] values, int n);

	/*
	 * This method returns the frequency in % of n in values
	 */
	public abstract double frequencyPercentage(int[] values, int n);

	/*
	 * This method returns the frequency of n in values
	 */
	public abstract int frequency(int[] values, int n);

	/*
	 * This method returns the smallest value in an integer array
	 */
	public abstract int findSmallest(int[] values);

	/*
	 * This method returns the sum of values
	 */
	public abstract int sum(int[] values);

}
