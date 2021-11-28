package study01;

public class Code05 {

	public static void main(String[] args) {
		
		// 배열 생성
		int [] boxArray = {10, 20};
		
		int [] box1Array = new int [] {10, 20};
		
		int [] box2Array = new int[2];
		box2Array[0] = 10;
		
		System.out.println(box2Array[0]);
		System.out.println(box2Array[1]);
		
		System.out.println(box2Array.length);
		
		String[] textArray = new String[4];
		
		textArray[0] = "안녕1";
		textArray[2] = "안녕1";
		textArray[3] = "안녕1";
		
		System.out.println(textArray[0]);
		System.out.println(textArray[1]);
		System.out.println(textArray[2]);
		System.out.println(textArray[3]);
		
		// 2차원 배열
		int [][] page = {
			{1,2,3,4},
			{5,6,7,8}
		};
		System.out.println(page[0][1]);
		
		// 첫 번째 주소 + (인덱스 * 자료형의 크기) => 접근할 주소
		
		// 2차원 배열
		// 첫 번째 주소 + (상위 차원 인덱스 * 자료형의 크기) + (하위 차원 인덱스 * 자료형의 크기) => 접근할 주소
	}

}
