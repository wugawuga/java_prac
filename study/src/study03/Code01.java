package study03;

public class Code01 {

	public static void main(String[] args) {
		
		// 문자열을 반환하는 메서드
		// String.format(~)
		
		String name = "우가";
		String output = String.format("내 닉네임은 %s다.", name);
		System.out.println(output);
		
		float temperature = 23.5f;
		String output1 = String.format("오늘의 온도는 %f도이다", temperature);
		System.out.println(output1);
		
		char grade = 'A';
		String output2 = String.format("내 학점은 %c이다", grade);
		System.out.println(output2);
		
		int age = 25;
		String output3 = String.format("내 나이는 %d이다", age);
		System.out.println(output3);
		
		String name1 = "정욱";
		int age1 = 25;
		String output4 = String.format("이름은 %s이고 나이는 %d이다", name1, age1);
		System.out.println(output4);
		
		// %a : 부동소수점 타입 : 16진법 문자열
		// %b : 모든 타입 : boolean 값은 true, false
		// 참조 자료형이면 null이면 false, not null이면 true
		// %c : 문자 타입 : 유니코드 문자
		// %d : 정수 타입 : 10진법 문자열
		// %e : 부동소수점 타입 : 과학적 표기법(e)를 이용한 10진법 문자
		// %f : 부동소수점 타입 : 10진법 문자열
		// %g : 부동소수점 타입 : 수의 표현 범위가 넓어지면 (e)를 이용한 10진법 문자
		// %h : 모든 타입 : hashCode 값으로 부터 16진법 문자
		// %o : 정수 타입 : 8진법 문자
		// %s : 모든 타입 : 문자열 
		// %t : Date/Time
		// %x : 정수 타입 : 16진법 문자
		
		System.out.printf("%a", 10.2);
		System.out.printf("%c\n", 65);
		System.out.printf("%c", 'A');
		System.out.printf("%d", 100000000);
		System.out.printf("%x\n", 100);
		
		String text = "오늘";
		float temperature1 = 23.3F;
		System.out.printf("%s의 온도는 %.1f도 입니다.", text, temperature1);
	}

}
