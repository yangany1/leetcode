package linearlist;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			hashMap.put(numbers[i], i + 1);
		}
		for (int i = 0; i < numbers.length; i++) {
			if (hashMap.containsKey(target - numbers[i])&&i!=hashMap.get(target - numbers[i])-1) {
				result[0] = i + 1;
				result[1] = hashMap.get(target - numbers[i]);
				return result;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] numbers = { 3,2,4};
		int target = 6;
		int[] r = new TwoSum().twoSum(numbers, target);
		System.out.print(r[0] + "," + r[1]);
	}
}
