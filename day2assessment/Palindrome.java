package week1.day2assessment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=34343;
int rev=0;
for(int i=0;i<5;i++) {
	rev=rev*10+num%10;
	num=num/10;
}
if(rev==num) {
	System.out.println("The Given Number is not Palindrome " +num);
}else
	System.out.println("The Given Number is a Palindrome " +num);
	}

}
