package com.basics;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// notesCount();
		// secondHighest();
		// secondHighest2();
		// Short();
		// armstrong();
		// test();
	}

	private static void test() {
		// TODO Auto-generated method stub

		String s1 = "ROHIT";
		String s2 = s1.toLowerCase();

		System.out.println(s2);

	}

	private static void armstrong() {
		// TODO Auto-generated method stub
		int num = 371;
		int t = num;
		int rem;
		int arm = 0;
		while (t != 0) {
			rem = t % 10;
			arm = arm + (rem * rem * rem);
			t = t / 10;
		}
		if (arm == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}

	private static void Short() {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40 };
		int b = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}

			}
			System.out.print(a[i] + "  ");

		}

	}

	private static void secondHighest2() {
		// TODO Auto-generated method stub
		int temp;
		int array[] = { 100, 20, 265, 163, 96, 57 };
		// size = array.length;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(" second largest number is:: " + array[(array.length) - 2]);
	}

	private static void secondHighest() {
		// TODO Auto-generated method stub
		int[] a = { 7, 89, 6, 22, 72, 89 };
		int b = 0;
		int c = 0;

		for (int i = 0; i < a.length; i++) {

			if (b < a[i]) {
				b = c;
				c = a[i];

			}

			if (c < a[i] && b > a[i]) {

				c = a[i];
			}
		}
		System.out.println(c);

	}

	private static void notesCount() {
		// TODO Auto-generated method stub
		int[] notes = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		int money = 4873;

		int count;

		for (int i = 0; i < notes.length; i++) {

			count = money / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + " = " + count);
				money = money % notes[i];
			}
		}
	}

}
