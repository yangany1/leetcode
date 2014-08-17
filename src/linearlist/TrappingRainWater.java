package linearlist;

public class TrappingRainWater {
	public int trap(int[] A) {

		int maxIndex = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > A[maxIndex]) {
				maxIndex = i;
			}
		}
		int water=0;
		int peak=0;//record the max height of left of the node
		for(int i=0;i<maxIndex;i++){
			if(A[i]>peak){
				peak=A[i];
			}else{
				water=water+peak-A[i];
			}
		}
		peak=0;
		for(int i=A.length-1;i>maxIndex;i--){
			if(A[i]>peak)
				peak=A[i];
			else
				water=water+peak-A[i];
		}
		return water;
	}
	
	public static void main(String[] args){
		int[] A={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.print(new TrappingRainWater().trap(A));
	}
}
