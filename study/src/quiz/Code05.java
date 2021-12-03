package quiz;

public class Code05 {

	public static void main(String args[]){
		
		int answer = 0;
		String s = "12onetwothree45";
		String nom1[] = {"0","1","2","3","4","5","6","7","8","9"};
		String nom2[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < 10; i++) {
			s = s.replace(nom2[i], nom1[i]);
		}
		return Integer.parseInt(s);
	}
	
}