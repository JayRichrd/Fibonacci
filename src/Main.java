
public class Main {

	public static void main(String[] args) {

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
		return 0;
	}

}
