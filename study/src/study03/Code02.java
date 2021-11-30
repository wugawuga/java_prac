package study03;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "윤정욱";
		String day = sc.nextLine();
		String str = String.format("이 사이트는 %s이고 오늘은 %s이다", name, day);
		System.out.println(str);
	
		sc.close();
	}

}