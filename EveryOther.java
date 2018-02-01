import java.util.Scanner; 


class EveryOther {

	public static void main(String[] args) {
		
		//everyOther(3, 15);
		System.out.println(test(everyOther(3, 15, 2), new int[]{3, 5, 7, 9, 11, 13}));

	}

	// 3 5 7 9 11 13

	public static int[] everyOther(int start, int end) {

		return everyOther(start, end, 2);
	}

	public static int[] everyOther(int start, int end, int interval) {
			int l = (((end - start) + 1) / interval);
			int[] list = new int[l];
			int n = 0;
			int interval_count = interval;

		for (int i = start; i <= end; i += interval) {
			
			if (i != end) {
				list[n] = i;
				System.out.println(i);
			} 

			n++;
		}

		return list;
		//System.out.println(Arrays.toString(list));

	}

	public static boolean test(int[] given, int[] expected) {

		int total = 0;

		if (given.length != expected.length) return false;
			
		for (int i = 0; i < given.length; i++) {

			if (given[i] == expected[i]) {
				total++;

			}

		}

		if (total == given.length) {
			return true;
		}

		return false;
	}
}