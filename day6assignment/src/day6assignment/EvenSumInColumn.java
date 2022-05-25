package day6assignment;

public class EvenSumInColumn {

	public static void main(String[] args) {
		int[][] _2DArray= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int i=0;i<_2DArray.length;i++) {
			int sum=0;
			for(int j=0;j<_2DArray.length;j++) {
				if(_2DArray[i][j]%2==0) {
					sum=sum+_2DArray[i][j];
				}
			}
			System.out.println(sum);
		}
	}

}
