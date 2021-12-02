package quiz;

public class Code02 {
	
	public String solution(String phone_number) {
        String answer = ""; 
        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length()-4){ 
                answer += "*"; 
            } else{ 
                answer += phone_number.charAt(i); 
            } 
        } 
        return answer;
    }
	// 21-12-02 유캔두!! 알고리즘

}
