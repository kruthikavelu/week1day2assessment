package week1.day2assessment;

public class FibonacciSeries {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int r= 8,firstNum=0,secNum=1,sum = 0;
			System.out.println("FirstNumber " +firstNum);
			for(int i=1;i<=r;i++) {
			sum=firstNum+secNum;
				secNum=firstNum;
				sum=secNum;
			}
			System.out.println("sum " +sum);
	}

}
