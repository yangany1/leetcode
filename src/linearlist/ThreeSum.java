package linearlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		Arrays.sort(num);
		int b,c;
		for(int i=0;i<num.length;i++){
			b=i+1;
			c=num.length-1;
			int leftValue=0-num[i];
			//duplicate deal
			if(i > 0 && num[i] == num[i-1])continue;
			while(b<c){
				if(c<= num.length - 2 && num[c] == num[c+1]){
					c--;
					continue;
				}
				if(b>i+1 && num[b] == num[b-1]){
					b++;
					continue;
				}
				if(num[b]+num[c]<leftValue){
					b++;
				}else if(num[b]+num[c]>leftValue){
					c--;
				}else{
					List<Integer> newlist=new ArrayList<>();
					newlist.add(num[i]);
					newlist.add(num[b]);
					newlist.add(num[c]);
					list.add(newlist);
					b++;
					c--;
				}
			}
		}
		return list;
	}
	public static void main(String[] args){
		int[] a = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> list=new ThreeSum().threeSum(a);
//		for(Iterator iter=list.iterator();iter.hasNext();){
//			
//		}
		System.out.print(list.toString());
	}
	
}
