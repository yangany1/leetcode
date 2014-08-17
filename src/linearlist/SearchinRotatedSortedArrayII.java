package linearlist;

//多分一种情况
//A[start]==A[middle]
public class SearchinRotatedSortedArrayII {
	public boolean search(int[] A, int target) {
		int start = 0;
		int end = A.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (A[middle] == target)
				return true;
			if (A[start] < A[middle]) {
				if (target < A[middle] && target >= A[start]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}else if(A[start]==A[middle]){
				start++;
			}
			else {
				if (target > A[middle] && target <= A[end]) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
		}
		return false;
	}
}
