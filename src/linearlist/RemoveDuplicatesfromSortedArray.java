package linearlist;

public class RemoveDuplicatesfromSortedArray {
	//��һ�����Iλӛ䛮�ǰ��λ��
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
