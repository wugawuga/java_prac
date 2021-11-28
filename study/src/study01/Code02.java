package study01;

public class Code02 {

	public static void main(String[] args) {
		
		int num;
        // 값이 존재하지 않는 변수에는
        // 접근할 수 없다

        // System.out.println(num);
        // 컴파일 오류 발생
        
        
        // 정수 32와 실수 32.0 은 다른 수이다.
        int num1 = 32;
        float num2 = 32.0f;
        double num3 = 32.0;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
        float num4 = 32.12345678f;
        double num5 = 32.12345678;
        System.out.println(num4);
        System.out.println(num5);
        // 차이나는 이유는 서로 사용하는 메모리 공간 차이
        // 더 많은 bit을 사용할수록 더 근사한 값을 저장 가능
        // float 정밀도는 약 6~7 자릿수
        // double 정밀도는 약 15~16 자릿수
	}

}
