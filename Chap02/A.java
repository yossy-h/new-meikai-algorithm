class A {
	private int   f1;				// 非公開フィールド
	protected int f2;				// 限定公開フィールド
	public int    f3;				// 公開フィールド

	static final int S1 = 0;	// 静的定数フィールド

	public A() {								// コンストラクタ
		f1 = f2 = f3 = 0;
	}

	public A(int f1, int f2, int f3) {	// コンストラクタ
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}

	public void setF1(int f) {				// メソッド（f1のセッタ）
		f1 = f;
	}

	public int getF1() {						// メソッド（f1のゲッタ）
		return f1;
	}
}
