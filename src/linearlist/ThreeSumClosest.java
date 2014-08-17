package linearlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
		int b, c;
		int closer = num[0]+num[1]+num[2];
		for (int i = 0; i < num.length; i++) {
			b = i + 1;
			c = num.length - 1;
			// duplicate deal
			while (b < c) {
				int currentSum = num[i] + num[b] + num[c];
				if (Math.abs(currentSum - target) < Math.abs(closer - target)) {
					closer = currentSum;
				}
				if (num[b] + num[c] +num[i]<= target) {
					b++;

				} else if (num[b] + num[c]+num[i] > target) {
					c--;
				}
				
			}
		}
		return closer;
	}
	
	public static void main(String[] args){
		int[] a = {1,1,-1,-1,3};
		System.out.print(new ThreeSumClosest().threeSumClosest(a, -1));
	}
}
