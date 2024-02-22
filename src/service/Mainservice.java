package service;

import java.util.Arrays;
import java.util.Random;

public class Mainservice {
	
	private static final double GRAVITY = -9.81;
	
	public static void main(String[] args) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
				"Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron",
				"Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
		int nameSize = names.length;
		int timeSize = times.length;
		
		if (nameSize == timeSize) {
			for (int i = 0; i < nameSize; i++) {
				System.out.println("[" + names[i] + ", <" + times[i] + ">]");
			}
		}
		
		try {
		System.out.println(positionCalc(10, 0 , 100));
		} catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("Strada");
		
		try {
			System.out.println(factorialForLoop(10));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			double[] mas = generateArray(10, 0, 10);
			System.out.println(Arrays.toString(mas));
			System.out.println(getMean(mas));
			System.out.println(Arrays.toString(arraySort(mas)));
			
		} catch (Exception em) {
			System.out.println(em);
		}
		
		
    }
	public static double positionCalc(double initialVelocity, double
	initialPosition, double fallingTime) throws Exception {
		if (initialVelocity >= 0 && initialVelocity < 299792458 && initialPosition < 20000 && fallingTime >= 0 && fallingTime < 80000) {
			return 0.5 * GRAVITY * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
		} else {
			throw new Exception("Wrong input params");
		}
		
	}
	public static int factorialForLoop(int N) throws Exception {

		if (N < 0) throw new Exception("Wrong input params");
		else if (N == 0) return 1;
		else {
			int result = 1;
			for (int i = 1; i <= N; i++) {
				result = result * i;
			}
			return result;
		}
		
	}
	public static double[] generateArray(int N, double lower, double upper) throws Exception {
		if(N <= 0 || (upper < lower)) throw new Exception("Wrong input params");
		double[] result = new double[N];
		Random rand = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = rand.nextDouble(lower, upper);
		}
		return result;
	}
	
	public static double getMean(double[] array) throws Exception {
		if(array == null) throw new Exception("Wrong input param");
		
		double sum = 0;
		//tips, mainigais : masivaNosaukums
		for(double temp : array) {
			sum +=temp;
		}
		return sum/array.length;
	}
	public static double[] arraySort(double[] array) throws Exception {
		if (array == null) throw new Exception ("Wrong input params");
		
		Arrays.sort(array);
		
		return array;
	}
	public static double[][] generateMatrix(int N) throws Exception {
		if(N <= 0) throw new Exception("Wrong input params");
		
		double [][] result = new double[N][N];
		Random rand = new Random();
		
		for(int i = 0; i < result.length; i++) { //rows
			for (int j = 0; j < result[i].length; j++) { //columns
				result[i][j] = rand.nextDouble(100);
			}
		}
		return result;
	}
	/*
	 * double getMean(double[] array)
	 * double getMin(double[] array)
	 * double getMax(double[] array)
	 */
	
}
