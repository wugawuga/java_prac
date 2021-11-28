package study01;

public class Code04 {

	public static void main(String[] args) {
		
		// 암시적 형 변환 (Implicit Convercion)
		// 직접 형 변환 접두사(구문)을 사용하지 않아도 자동적으로 형 변환되는 것
		byte a = 32;
		
		// 1byte >> 2byte
		short b = a;
		
		// 2byte >> 4byte
		int c = b;
		
		// 4byte >> 8byte
		long d = c;
		
		// 명시적 형 변환 (Explicit Convercion)
		// 직접 형 변환 접두사(구문)을 사용하지 않아도 자동적으로 형 변환되는 것을 말함.
		// 데이터의 손실이 발생할 수 있다는 것을 인지
		// [자료형][변수명] = (자료형)[변수명 또는 리터럴];
		int e = (int) 100000000000L;
		long f = 1000;
		//int e = (int) b;
		
		// 정수의 명서적 형 변환
		long g = 100000;
		
		// 8byte 저장된 값을 4byte로 변환
		// 100000 은 4byte로표현이 가능하기 때문에 손실 x
		int h = (int) g;
		
		// 4byte로 저장된 값을 2byte로 변환
		// 2byte로 표현할 수 없기 때문에 데이터 손실 및 변질
		short i = (short) h;
		System.out.println(h);
		
		// 실수의 명시적 형 변환
		double j = 1.42;
		
		// 배정도 8byte로 저장된 부동소수점을 단정도 4byte로 변환
		float k = (float) j;
		System.out.println(k);
	}

}
