package study01;

public class Code03 {

	public static void main(String[] args) {
		
		// 리터럴의 종류에는 정수, 실수, 문자, 문자열, 불리언
		// 변할 수 없는 값
		// 리터럴에 리터럴을 대입할 수 없음
		int num = 1;
		System.out.println(num);
		num = 2;
		System.out.println(num);
		
		// final 키워드를 붙인 변수는 변경 불가
		// 심볼릭 상수
		final int num2 = 10;
		System.out.println(num2);
		// num2 = 20 에러
	}
}
