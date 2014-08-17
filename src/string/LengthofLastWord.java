package string;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		int l=0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				if(l>0)
					break;
			}else{
				l++;
			}
		}
		return l;
	}
	
	public static void main(String[] args){
		System.out.println(new LengthofLastWord().lengthOfLastWord("a  "));
	}
}
