package linearlist;

public class Candy {
	public int candy(int[] ratings) {
		int value[]=new int[ratings.length];
		for(int i=0;i<ratings.length;i++){
			value[i]=1;
		}
		int crt=1;
		for(int i=1;i<ratings.length;i++){
			if(ratings[i]>ratings[i-1]){
				crt++;
				value[i]=Math.max(value[i], crt);
			}else{
				crt=1;
			}
		}
		crt=1;
		for(int i=ratings.length-2;i>=0;i--){
			if(ratings[i]>ratings[i+1]){
				crt++;
				value[i]=Math.max(value[i], crt);
			}else{
				crt=1;
			}
		}
		int sum=0;
		for(int i=0;i<value.length;i++)
			sum+=value[i];
		return sum;
	}
}
