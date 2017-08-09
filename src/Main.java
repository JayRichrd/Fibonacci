import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("请输入需要计算的菲波那切数列项n:");
		n = scanner.nextInt();

		StringBuilder sb = new StringBuilder("f(");
		sb.append(n);
		sb.append(")=");

		System.out.println("递归计算" + sb.toString() + fibonacci1(n));
		System.out.println("循环计算" + sb.toString() + fibonacci2(n));

		// 释放资源
		sb = null;
		scanner.close();
	}

	/**
	 * 用递归方式计算斐波拉切数列
	 * 
	 * @param n
	 * @return 斐波拉切数列的第n项的值
	 */
	private static long fibonacci1(int n) {
		// 鲁棒性检查
		if (n < 0)
			throw new RuntimeException("Invalid Input!");
		if (n <= 1)
			return n;
		// 递归实现
		return fibonacci1(n - 1) + fibonacci1(n - 2);
	}

	/**
	 * 用循环方式计算斐波拉切数列
	 * 
	 * @param n
	 * @return 斐波拉切数列的第n项的值
	 */
	private static long fibonacci2(int n) {
		// 鲁棒性检查
		if (n < 0)
			throw new RuntimeException("Invalid Input!");
		if (n <= 1)
			return n;
		// f(n-1)
		long fibNMinusOne = 1;
		// f(n-2)
		long fibNMinuTwo = 0;
		// f(n)
		long fibN = 0;
		for (int i = 2; i <= n; i++) {
			// f(n) = f(n-1) + f(n-2)
			fibN = fibNMinusOne + fibNMinuTwo;
			// 从头往后加
			// 注意此处往前赋值是有顺序的，下面这两句不能交换顺序
			fibNMinuTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}
		return fibN;
	}

}
