package week1.day2assessment;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=13;
boolean count=false;
for(int i=2;i<num%2;i++) {
	if(num%i==0) {
		count=true;
		break;
	}
}
if(count==false) {
	System.out.println("It is a Prime Number " +num);
}else
	System.out.println("It is not a Prime Number " +num);
	}

}
