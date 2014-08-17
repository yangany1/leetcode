package linearlist;
/**
 * ʹ��һ��������¼��ǰ��¼���ֵĴ���
 * ������ִ���С�ڵ���2����ֵ����ǰ��λ�ã��������
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
