package linearlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 方法一：
 * 使用一个map来记录是否出现
 * 对每个元素，往两边搜索是否出现
 * 提交上去会超时
 * 
 * 方法二：
 * 
 * @author luo
 *
 */
public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] num) {
		Map<Integer,Boolean> hashMap=new HashMap<Integer,Boolean>();
		int maxLength=0;
		for(int i=0;i<num.length;i++){
			if(!hashMap.containsKey(num[i])){
				hashMap.put(num[i], true);
			}
			int currentLength=1;
			int j=num[i]-1;
			while(hashMap.containsKey(j)){
				currentLength++;
				j--;
			}
			j=num[i]+1;
			while(hashMap.containsKey(j)){
				currentLength++;
				j++;
			}
			maxLength=Math.max(currentLength, maxLength);
		}
		return maxLength;
	}
	public int longestConsecutive2(int[] num) {
		Set<Integer> hashSet=new HashSet<Integer>();
		int maxLength=0;
		for(int i=0;i<num.length;i++){
			hashSet.add(num[i]);
		}
		for(int i=0;i<num.length;i++){
			if(!hashSet.contains(num[i]))
				continue;
			int currentLength=1;
			int j=num[i]-1;
			while(hashSet.contains(j)){
				hashSet.remove(j);
				currentLength++;
				j--;
			}
			j=num[i]+1;
			while(hashSet.contains(j)){
				hashSet.remove(j);
				currentLength++;
				j++;
			}
			maxLength=Math.max(currentLength, maxLength);
			hashSet.remove(num[i]);
		}
		return maxLength;
	}

	
	public static void main(String[] args){
		int a[]={100, 4, 200, 1, 3, 2};
		System.out.print(new LongestConsecutiveSequence().longestConsecutive2(a));
	}
}
