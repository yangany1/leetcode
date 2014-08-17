package linearlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(num);
		int b, c;
		for (int i = 0; i <= num.length - 4; i++) {
			if (i!=0 && num[i] == num[i - 1])
				continue;
			for (int j = i + 1; j <= num.length - 3; j++) {
				if (j!=i+1 && num[j] == num[j - 1])
					continue;
				b = j + 1;
				c = num.length - 1;
				int leftValue = target - num[i] - num[j];
				// duplicate deal
				while (b < c) {
					if (c <= num.length - 2 && num[c] == num[c + 1]) {
						c--;
						continue;
					}
					if (b > j + 1 && num[b] == num[b - 1]) {
						b++;
						continue;
					}
					if (num[b] + num[c] < leftValue) {
						b++;
					} else if (num[b] + num[c] > leftValue) {
						c--;
					} else {
						List<Integer> newlist = new ArrayList<>();
						newlist.add(num[i]);
						newlist.add(num[j]);
						newlist.add(num[b]);
						newlist.add(num[c]);
						list.add(newlist);
						b++;
						c--;
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] a = {0,0,0,0};
		List<List<Integer>> list = new FourSum().fourSum(a, 0);
		// for(Iterator iter=list.iterator();iter.hasNext();){
		//
		// }
		System.out.print(list.toString());
	}

}
