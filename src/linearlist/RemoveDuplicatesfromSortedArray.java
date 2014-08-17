package linearlist;

public class RemoveDuplicatesfromSortedArray {
	//用一個標誌位記錄當前的位置
	public int removeDuplicates(int[] A){
		if(A.length==0)
			return 0;
		int current=0;
		for(int i=1;i<A.length;i++){
			if(A[i]!=A[current]){
				A[++current]=A[i];
			}
		}
		return current+1;
	}
}
