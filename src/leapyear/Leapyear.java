package leapyear;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		int n;
		System.out.println("enter any year");
		Scanner a =new Scanner(System.in);
		n=a.nextInt();
		if(n%4==0 || n%100!=0) {
			System.out.println("the given year "+n+" is leap year");
		}
		else {
			System.out.println("the given year "+n+" is not leap year");
		
		}
	}

}
