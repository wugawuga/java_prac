package study03;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = sca.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(dan+" x "+i+" = "+(dan*i));
		}
		sca.close();
	}

}
