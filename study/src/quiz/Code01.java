package quiz;


public class Code01 {

	// 없는 숫자 더하기
	
	public int solution(int[] numbers) {

		int result = 45;
		for(int n : numbers) {
			result -= n;
		}
		return result;
    }

}
