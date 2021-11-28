package study01;

public class Code01 {

	public static void main(String[] args) {
		
		/* byte = -128 ~ 127 - 1byte */
		byte num1 = 125;
		
		/* short = -32,768 ~ 32,767 - 2byte */
		short num2 = 30000;
		
		/* int = -2,147,483,648 ~ 2,147,483,647 - 4byte */
		int num3 = 200000000;
		
		/* long = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 
		 * int의 범위를 넘을때는 뒤에 접미사 L 필요 - 접미사 붙일 시, 8byte */
		long num4 = 200000000000000L;
		
		/* true or false 값을 저장하는 변수 - JVM denpdent 컴퓨팅 시는 1byte */
		boolean bool = true;
		
		/* char 하나의 문자를 저장하는 자료형 - 2byte
		 * 자바는 하나의 문자와 문자열의 처리가 다름
		 * 하나의 문자는 '' 안에서 표현 문자열 표현은 "" 이렇게 표 
		 * 0 ~ 65,535 (유니코드문자)*/
		char character = 'A';
		
		/* float 과 double 소수점이 있는 실수 저장하는 자료형 
		 * float - 접미사 붙일 시, 4byte
		 * double - 8byte */
		float num5 = 20.0F;
		
		double num6 = 202312.231231231223;
		
		/* 문자열 처리를 위하여 자바가 미리 만들어 놓은 클래스
		 * (참조자료형 이지만 기본자료형 처럼 사용 가능)
		 * new로 객체 생성 안해도 됨 int, char처럼 사용 가*/
		String str1 = new String("wugawuga");
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(bool);
		System.out.println(character);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(str1);
	}

}
