package linearlist;
/**
 * 原题转化为两个排序好的数组找第k小的元素
 * @author luo
 *
 */
public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int A[], int B[]) {
		int total=A.length+B.length;
		if(total%2!=0)
			return find_kth(A, A.length, B, B.length, total/2+1);
		else{
			int[] A1=A.clone();
			int[] B1=B.clone();
			int a=find_kth(A, A.length, B, B.length, total/2);
			int b=find_kth(A1, A1.length, B1, B1.length, total/2+1);
			return (a+b)/2.0;
		}
	}
	
	
	public int find_kth(int A[],int m,int B[],int n,int k){
		if(m>n)
			return find_kth(B,n,A,m,k);
		if(m==0)
			return B[k-1];
		if(k==1)
			return Math.min(A[0], B[0]);
		
		int middleA=Math.min(k/2, m);
		int middleB=k-middleA;
		if(A[middleA-1]<B[middleB-1]){
			for(int i=0;i<m-middleA;i++){
				A[i]=A[i+middleA];
			}
			return find_kth(A, m-middleA, B, n, k-middleA);
		}else if(A[middleA-1]>B[middleB-1]){
			for(int i=0;i<n-middleB;i++){
				B[i]=B[i+middleB];
			}
			return find_kth(A, m, B, n-middleB, k-middleB);
		}else
			return A[middleA-1];
	}
	
	public static void main(String[] args){
		int[] a={2};
		int[] b={1,3,4};
		System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(a, b));
		
		
				
				
		
		
	}
}
