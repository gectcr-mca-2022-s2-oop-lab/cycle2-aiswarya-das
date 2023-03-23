package cycle2;

import java.util.Scanner;

public class SearchElm {

	public static void main(String[] args) {

		int k, s, flag = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		s = sc.nextInt();
		int[] array = new int[10];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < s; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter element to search: ");
		k = sc.nextInt();
		for (int i = 0; i < s; i++) {
			c = c + 1;
			if (array[i] == k) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Element found at position " + c);

		} else {
			System.out.println("Element not found!");

		}
	}

}

