package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public List<String> anagrams(String[] strs) {
		Map<String, List<String>> hashMap = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; ++i) {
			String s = strs[i];
			String orderS = getAscOder(s);
			if (hashMap.containsKey(orderS)) {
				hashMap.get(orderS).add(s);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(s);
				hashMap.put(orderS, list);
			}
		}
		List<String> resultList=new ArrayList<>();
		for(String s:hashMap.keySet()){
			if(hashMap.get(s).size()>1){
				resultList.addAll(hashMap.get(s));
			}
		}
		return resultList;
	}

	public String getAscOder(String s) {
		char[] achar = s.toCharArray();
		Arrays.sort(achar);
		return new String(achar);
	}
}
