package quiz;

public class Code03 {

	public String solution(String s, int n) {

		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char alpa = s.charAt(i);
			if (alpa >= 'a' && alpa <= 'z') {
				alpa = (char) ((alpa - 'a' + n) % 26 + 'a');
			} else if (alpa >= 'A' && alpa <= 'Z') {
				alpa = (char) ((alpa - 'A' + n) % 26 + 'A');
			}
			answer += alpa;
		}
		return answer;
	}

}
// 프로그래머스 시저암호 문제