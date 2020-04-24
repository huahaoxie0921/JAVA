package solution;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	
//	public static void main(String[] args) {
//		int [] A = {1,2,3};
//		System.out.println(permutation(A, 4));
//	}

	public static int permutation(int[] A, int N) {

		if (A.length != N)
			return 0;

		Set<Integer> hs = new HashSet<>();
		for (int i : A) {
			if (hs.contains(i)) {
				return 0;
			} else {
				hs.add(i);
			}
		}
		return 1;
	}
}
