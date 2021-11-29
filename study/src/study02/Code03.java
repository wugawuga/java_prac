package study02;

public class Code03 {

	public static void main(String[] args) {
		
		// scope
		// 변수에 접근하기 위한 유효범위
		// 중괄호 내부를 하나의 범위로 볼 수 있다
		
		// 예시
		
		int box = 1;
		if (true) {
			int chickenBox = 5;
			System.out.println(chickenBox);
		}
		chickenBox = 10;
		System.out.println(chickenBox);
		// 조건문, 반복문 외부 범위에서 내부 범위 접근 x
		
		int box1 = 1;
		if (true) {
			int chickenBoxs = 20;
			if (true) {
				int number = 0;
				int result = box1 + number + chickenBoxs;
			}
			number = 1;
		}
		chickenBoxs = 10;
		
		int x = 0; // 상위
		while (x < 20) {
			int x = 1; // 하위
			System.out.println(x);
			x++;
			// x는 while 내에서 상위의 변수 x에 접근이 가능
			// while 내에서 변수 재정의 할 수 없다
		}
	}

}
