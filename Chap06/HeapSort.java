// ヒープソート

import java.util.Scanner;

class HeapSort {

	//--- 配列の要素a[idx1]とa[idx2]の値を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	//--- a[left]～a[right]をヒープ化 ---//
	static void downHeap(int[] a, int left, int right) {
		int temp = a[left];		// 根
		int child;					// 大きいほうの子
		int parent;					// 親

		for (parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;		// 左の子
			int cr = cl + 1;					// 右の子
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;	// 大きいほう
			if (temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	//--- ヒープソート ---//
	static void heapSort(int[] a, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--)	// a[i]～a[n-1]をヒープ化
			downHeap(a, i, n - 1);

		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i);				// 最大要素と未ソート部末尾要素を交換
			downHeap(a, 0, i - 1);	// a[0]～a[i-1]をヒープ化
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("ヒープソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		heapSort(x, nx);	// 配列xをヒープソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}
