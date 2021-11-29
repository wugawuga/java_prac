package study02;

public class Code01 {

	public static void main(String[] args) {
		// 조건식과 논리 연산자
		// 좌 > 우로 연산을 하며 참인지 거짓인지 판단
		// 괄호가 있으면 괄호에 있는 것을 먼저 연산
		
		int age = 40;
		int weight = 20;
		
		boolean isTrue = age == 30 && weight == 20;
		System.out.println(isTrue); // false
		
		boolean isTruee = true || (false && true);
		System.out.println(isTruee); // true
		
		// if문
		// if, else if, else
		
		if (참 or 거짓) {
			// 참이면 실행 후 조건문 탈출
		} else if (참 or 거짓) {
			// 참이면 실행 후 조건문 탈출
		} else {
			// 두 조건이 다 거짓이면 실행 후 탈출
		}
		// else if 의 개수는 제한이 없다
		
		// switch 문
		// 조건값에 따라 특정 case부터 실행하는 구문
		// break 만나면 탈출
		
		switch (조건값) {
			case 값1 :
			case 값2 :
			case 값3 :
				break;
			default :
		}
		// 조건값으로 올 수 있는 것들
		// char, byte, short, int, Character
		// Byte, Short, Integer, String, enum
		
		// if 문 예
		int num = 65;
		char alphabet;

		if (65 == num) {
		    alphabet = 'A';
		} else if (66 == num) {
		    alphabet = 'B';
		} else if (67 == num) {
		    alphabet = 'C';
		} else {
		    alphabet = '0';
		}

		System.out.println(alphabet); // A
		
		// switch 문 예
		int category = 1;
		switch (category) {
		    case 1:
		        System.out.println(1);
		    case 2:
		        System.out.println(2);
		            break;
		    case 3:
		        System.out.println(3); // 1, 2
		}
		// 삼항 연산자
        // if 문을 만들 수 있는 또 다른 방
        // 자료형 변수명 = (조건식) ? 참인 경우 : 거짓인 경우;
        int nums = 65;
        char alphabets = (65 == nums) ? 'A' : 'B';
		}

}
