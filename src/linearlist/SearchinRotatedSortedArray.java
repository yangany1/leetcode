package linearlist;
/**
 * 分兩種情況讨论即可
 * @author luo
 *
 */
public class SearchinRotatedSortedArray {
	public int search(int[] A, int target) {
		int start=0;
		int end=A.length-1;
		while(start<=end){
			int middle=(start+end)/2;
			if(A[middle]==target)
				return middle;
			if(A[start]<=A[middle]){
				if(target<A[middle]&&target>=A[start]){
					end=middle-1;
				}else{
					start=middle+1;
				}
					
			}else{
				if(target>A[middle]&&target<=A[end]){
					start=middle+1;
				}else{
					end=middle-1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int A[]={4, 5, 6, 7, 0, 1, 2};
		System.out.print(new SearchinRotatedSortedArray().search(A, 0));
	}
}
