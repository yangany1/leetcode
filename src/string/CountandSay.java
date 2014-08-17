package string;

public class CountandSay {
	public String countAndSay(int n) {
		String s="1";
		for(int i=1;i<n;i++){
			s=getCountBefore(s);
		}
		return s;
	}
	
	public String getCountBefore(String s){
		String result="";
		for(int i=0;i<s.length();i++){
			int j=i+1;
			while(j<s.length()&&s.charAt(i)==s.charAt(j)){
				j++;
			}
			result=result+(j-i)+s.charAt(i);
			i=j-1;
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.print(new CountandSay().getCountBefore("111221"));
	}
}
