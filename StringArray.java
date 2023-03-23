package cycle2;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		int k, s, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		s = sc.nextInt();
		String[] array = new String[s];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < s; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < s; i++) {
			for (int j = i + 1; j < s; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}

		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(array));

	}

}

