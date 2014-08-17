package linearlist;

public class PermutationSequence {
	public String getPermutation(int n, int k) {
		int[] result = new int[n];
		k--;
		int mod = 0;
		int div = 0;
		boolean[] exist = new boolean[n + 1];
		for (int i = 1; i <= n; i++)
			exist[i] = false;

		for (int i = 0; i < n - 1; i++) {
			div = k / fab(n - i - 1);
			mod = k % fab(n - i - 1);
			int a = div + 1;
			for (int t = 1; t <= a; t++)
				if (exist[t])
					a++;
			result[i] = a;
			exist[a] = true;
			k = mod;
		}
		for (int i = 1; i <= n; i++) {
			if (!exist[i])
				result[n - 1] = i;
		}
		String s = "";
		for (int i = 0; i < n; i++)
			s += result[i];
		return s;

	}

	public int fab(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result *= i;
		return result;
	}

	public static void main(String[] args) {
		PermutationSequence s = new PermutationSequence();
		String s2 = s.getPermutation(5, 16);
		System.out.println(s2);
	}
}
