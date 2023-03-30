package cycle2;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		String st, s1, s2;
		Scanner s = new Scanner(System.in);
		System.out.println("major string methods:  ");
		System.out.println("---charAt--- ");
		String str = "Aiswarya";
		char res = str.charAt(0);
		System.out.println("character at position 1:  of " + str + " is " + res);
		System.out.println("---compareTo--- ");

		String str1 = "jess";
		String str2 = "jess";
		if (str1.compareTo(str2) == 0) {
			System.out.println(str1 + " and " + str2 + " are equal strings");

		} else if (str1.compareTo(str2) > 1) {
			System.out.println("string1 > string2");

		} else {
			System.out.println("string1 < string2");

		}
		System.out.println("---Length--- ");
		System.out.println("length of " + str + " = " + str.length());
		System.out.println("---Concat--- ");
		System.out.println("Enter character to concat: ");

		st = s.next();
		System.out.println("concatinated result: " + str.concat(st));
		System.out.println("---Uppercase--- ");
		System.out.println(str + " after = " + str.toUpperCase());

		System.out.println("---Lowercase--- ");
		System.out.println(str + " after = " + str.toLowerCase());

		System.out.println("---Replace--- ");
		System.out.println("old string : " + str);
		System.out.println("Enter character to replace: ");
		s1 = s.next();
		System.out.println("Enter new character: ");
		s2 = s.next();
		System.out.println("Replaced string: " + str.replace(s1, s2));

	}

}

