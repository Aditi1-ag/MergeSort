package mypack;

import java.util.Arrays;

public class Launcher {

	public static void main(String[] args) {
	    int[] array = { 6, 5, 12, 10, 9, 1 };
	    System.out.println("Unsorted Array");
	    System.out.println(Arrays.toString(array));

	    Merge obj = new Merge();

	    obj.mergeSort(array, 0, array.length - 1);

	    System.out.println("Sorted Array:");
	    System.out.println(Arrays.toString(array));

	}

}
