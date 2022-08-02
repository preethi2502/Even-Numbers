package com.armstrong.org;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		int a = 0;
		int i = 0;
		int j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int n = sc.nextInt();

		a = n;

		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}

	}

}
