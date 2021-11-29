package study02;

public class Code02 {

	public static void main(String[] args) {
		
		// 반복문
		
		// for 반복문
		for (int num = 0; num < 4; num++) {
			System.out.println(num);
		}
		
		// 추가로 for 반복문은 초기화, 조건식, 반복 후 실행될 명령어 생략 가능
		int nums = 0;
		for (; nums < 4;) { // 세미콜론을 빼면 x
			System.out.println(nums);
			nums++;
		}
		
		// while 반복문
		System.out.println("while문 시작");
		int a = 0;
		while (a < 4) {
			a++;
			System.out.println(a);
		}
		
		// do while 반복문
		System.out.println("do while문 시작");
		int b = 0;
		do {
			b++;
			System.out.println(b);
		} while (b < 4);
		
		// foreach 반복문
		System.out.println("foreach문 시작");
		int[] numArray = {10, 20, 30, 40};
		for (int c : numArray) {
			System.out.println(c);
		}
		
		// for 연습
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		int[] berArray = {1, 2, 3, 4, 5};
		for (int j = 0; j < berArray.length; j++) {
			System.out.println(berArray[j]);
		}
		
		// foreach 연습
		String[] textArray = {"오늘 연습", null, "내일 연습"};
		for (String text : textArray) {
			System.out.println(text);
		}
		
		char[] txtArray = {'가', '나', '다', '라', '마', '바', '사', '아', '자'};
		for (char txt : txtArray) {
			System.out.print(txt);
		}
		
		// while 연습
		int count = 0;
		while (count < 10) {
			count++;
			if (3 < count && count < 7) {
				continue;
			}
			System.out.println(count);
		}
		
		// do while 연습
		do {
			System.out.println("먼저 실행");
		} while (false);
		
		int x = 0;
		do {
			System.out.println(x + "회차");
			x++;
		} while (x < 5);
	}

}
