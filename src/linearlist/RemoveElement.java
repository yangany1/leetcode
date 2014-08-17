package linearlist;

public class RemoveElement {
	 public int removeElement(int[] A, int elem){
		 int current=0;
		 for(int i=0;i<A.length;i++){
			 if(A[i]!=elem){
				 A[current++]=A[i];
			 }else{
				 continue;
			 }
		 }
		 return current;
	 }
}
