public class Solution {
   static int mod = 1_000_000_007;


	static public int solve(int a, ArrayList<Integer> arr) {


        long ans = factorial(a-arr.size());
		int b = 0;
		Collections.sort(arr);

		for (int i = 0; i < arr.size(); i++) {
			long comb = 1;

			if(i!=0) {
				comb = pow(2, arr.get(i) - b - 2);
			}

			ans = (((ans * pow(factorial(arr.get(i) - b - 1), mod - 2)) % mod) * comb) % mod;
			b = arr.get(i);
		}

		ans = (ans * pow(factorial(a - b), mod - 2)) % mod;

		return (int) ans;

	}
	
	public static long factorial(int n){
	    if(n<=1) return 1;
	    return ((n % mod)* (factorial(n-1)%mod))%mod;
	}
	
	 public static long pow(long x, int n) {

		if (n == 0)
			return 1;

		long p = pow(x, n / 2);

		p = (p * p) % mod;

		if (n % 2 == 1)
			p = (p * x) % mod;

		return p;

	}
}