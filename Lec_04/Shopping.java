package Lec_04;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int R = scn.nextInt();
		while(R>0) {
			R--;
			int maxAyu = scn.nextInt();
			int maxHar = scn.nextInt();
			int phone = 1;
			int currH = 0;
			int currA = 0;
			while (true) {
//				A
				currA = currA +phone;
				phone++;
				if(currA>maxAyu) {
					System.out.println("Harshit");  
					break;
				}
//				H
				currH = currH +phone;
				phone++;
				if(currH>maxHar) {
					System.out.println("Aayush");
					break;
				}
			}
		}
	}
}
