// 再帰に対する理解を深めるための真に再帰的なメソッド（末尾再帰を除去）

import java.util.Scanner;

class RecurX1 {

	//--- 末尾再帰を除去したrecur ---//
	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		recur(x);
	}
}
