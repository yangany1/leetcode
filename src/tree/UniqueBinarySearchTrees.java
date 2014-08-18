package tree;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int[] array=new int[n+1];
		array[0]=1;
		array[1]=1;
		for(int i=2;i<=n;i++){
			for(int j=1;j<=i;j++){
				array[i]+=array[j-1]*array[i-j];
			}
		}
		return array[n];
	}
	
	public static void main(String[] args){
		System.out.println(new UniqueBinarySearchTrees().numTrees(3));
	}
}
