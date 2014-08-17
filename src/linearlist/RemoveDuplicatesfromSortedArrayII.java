package linearlist;
/**
 * 使用一个变量记录当前记录出现的次数
 * 如果出现次数小于等于2，赋值到当前的位置，否则继续
 * @author luo
 *
 */
public class RemoveDuplicatesfromSortedArrayII {
	public int removeDuplicates(int[] A) {
		if(A.length==0)
			return 0;
		int current=0;
		int dupNum=1;
		for(int i=1;i<A.length;i++){
			if(A[current]==A[i]){
				dupNum++;
				if(dupNum<=2){
					A[++current]=A[i];
				}
			}else{
				A[++current]=A[i];
				dupNum=1;
			}
		}
		return ++current;
	}
	
	public static void main(String[] args){
		int a[]={1,1,1,2,2,3};
		int length=new RemoveDuplicatesfromSortedArrayII().removeDuplicates(a);
		for(int i=0;i<length;i++)
			System.out.print(a[i]+" ");
	}
}
