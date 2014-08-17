package string;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {

		if(s==null||s.length()<=1){
			return true;
		}
		int start=0;
		int end=s.length()-1;
		while(start<end){
			char s1=s.charAt(start);
			if(!Character.isAlphabetic(s1)&&!Character.isDigit(s1)){
				start++;
				continue;
			}
			char s2=s.charAt(end);
			if(!Character.isAlphabetic(s2)&&!Character.isDigit(s2)){
				end--;
				continue;
			}
			if(Character.isAlphabetic(s1)&&Character.isAlphabetic(s2)){
				if((s1+"").equalsIgnoreCase(s2+"")){
					start++;
					end--;
					continue;
				}
				else{
					return false;
				}
			}
			else{
				if(s1==s2){
					start++;
					end--;
					continue;
				}
				else{
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void main(String[] args){
		String s="r...";
		System.out.print(new ValidPalindrome().isPalindrome(s));
	}
}
