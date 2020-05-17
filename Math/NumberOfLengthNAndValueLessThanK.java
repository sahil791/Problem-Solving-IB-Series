public class Solution {
   public static int solve(ArrayList<Integer> arr, int B, int c) {

		if (arr.size() == 0)
			return 0;

		boolean check = arr.get(0) == 0;

		int nd = nod(c);

		if (B > nd)
			return 0;

		if (B < nd) {
			int ans = 1;

			for (int i = B - 1; i >= 0; i--) {

				if (check && i == 0 && B > 1)
					ans *= arr.size() - 1;

				else
					ans *= arr.size();

			}

			return ans;

		}

		else {

			ArrayList<Integer> digit = dig(c);
			int[] lower = new int[11];

			for (int i = 0; i < arr.size(); i++) {
				lower[arr.get(i) + 1] = 1;
			}

			for (int i = 1; i < lower.length; i++) {
				lower[i] += lower[i - 1];
			}

			int[] dp = new int[B + 1];
			boolean flag = true;

			for (int i = 1; i <= B; i++) {
				dp[i] = dp[i - 1] * arr.size();
				int d2 = lower[digit.get(i - 1)];


				if (i == 1 && check && B != 1)
					d2 = d2 - 1;

				if (flag)
					dp[i] += d2;

				flag = flag && (lower[digit.get(i - 1) + 1] == lower[digit.get(i - 1)] + 1);

			}

			return dp[B];

		}

	}

	public static ArrayList<Integer> dig(int n) {

		ArrayList<Integer> ans = new ArrayList<>();

		while (n > 0) {
			ans.add(n % 10);
			n /= 10;
		}

		Collections.reverse(ans);
		return ans;

	}

	public static int nod(int n) {

		int ans = 0;

		while (n > 0) {
			n /= 10;
			ans++;
		}

		return ans;

	}
}