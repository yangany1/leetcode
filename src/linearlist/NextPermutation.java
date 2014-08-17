package linearlist;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] num) {
		if(num.length<=1)
			return;
		int i;
		int firstIndex;
		for(i=num.length-2;i>=0;i--){
			if(num[i]<num[i+1]){
				break;
			}
		}
		if(i<0){
			reverse(num);
			return;
		}
		firstIndex=i;
		int firstflag=num[i];
		int secondIndex=0;
		for(i=num.length-1;i>=0;i--){
			if(num[i]>firstflag){
				secondIndex=i;
				break;
			}
		}
		swap(num,firstIndex,secondIndex);
		for(int k=0;k<(num.length-firstIndex-1)/2;k++){
			swap(num,firstIndex+1+k,num.length-1-k);
			
		}
	}
	public void swap(int[] a,int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public void reverse(int a[]) {
		for(int i=0;i<a.length/2;i++){
			swap(a,i,a.length-1-i);
		}
	}
	public static void main(String[] args){
		int a[]={1,3,2};
		new NextPermutation().nextPermutation(a);
		System.out.println(Arrays.toString(a));
	}
}
