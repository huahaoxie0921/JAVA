package solution;

public class Rotate {
	
	public static int[] rotate(int[] nums, int N, int K) {
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[(i + K) % N] = nums[i];
		}
		return a;
	}
}
