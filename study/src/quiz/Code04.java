package quiz;

public class Code04 {

	public int solution(int[] a, int[] b) {

		int answer = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			c += a[i] * b[i];
			answer = c;
		}
		return answer;
	}
}
// 프로그래머스 내적 문제
