package string;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length<1)
			return "";
		String firstString=strs[0];
		for(int i=1;i<=firstString.length();i++){
			String prefix=firstString.substring(0, i);
			for(int j=1;j<strs.length;j++){
				if(strs[j].indexOf(prefix)!=0){
					return firstString.substring(0,i-1);
				}
			}
		}
		return firstString;
	}
	
	public static void main(String[] args){
		String[] strs={"123","2234"};
		String s=new LongestCommonPrefix().longestCommonPrefix(strs);
		System.out.print(s);
	}
}
