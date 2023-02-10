package week1.day2assessment;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=-40;
int convert;
if(num<0) {
	System.out.println("This Given Number is " +num);
	convert=Math.abs(num);
	System.out.println("The Number " + num + " is Converted to " + convert);
}

	}

}
