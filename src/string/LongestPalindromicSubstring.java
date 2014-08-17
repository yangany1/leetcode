package string;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int length=s.length();
		boolean f[][]=new boolean[length][length];
		for(int i=0;i<length;i++)
			for(int j=0;j<length;j++)
				f[i][j]=false;
		for(int i=0;i<length;i++){
			f[i][i]=true;
		}
		int max_len=1;
		int start=0;
		for(int i=0;i<length;i++){
			for(int j=0;j<i;j++){
				if(j+1==i){
					f[j][i]=(s.charAt(i)==s.charAt(j))?true:false;
				}else{
					if(s.charAt(i)==s.charAt(j)&&f[j+1][i-1]){
						f[j][i]=true;
					}else{
						f[j][i]=false;
					}
				}
				if(f[j][i]&&max_len<i-j+1){
					max_len=i-j+1;
					start=j;
				}
			}
		}
		return s.substring(start,start+max_len);
	}
	
	public static void main(String[] args){
		System.out.print(new LongestPalindromicSubstring().longestPalindrome("123321455"));
	}
}
