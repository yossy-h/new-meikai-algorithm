// 読み込んだ整数値の正／負／０を判定

import java.util.Scanner;

class Judge123B {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("それは１です。");
		else if (n == 2)
			System.out.println("それは２です。");
		else
			System.out.println("それは３です。");
	}
}
