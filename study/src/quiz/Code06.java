package quiz;

public class Code06 {
	
	public static void main(String args[]){
        
        int [] numbers = new int[] {1,2,3,4};
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 1; j < numbers.length; j++) {
        	int dap = numbers[i]+numbers[j];
        	System.out.println(dap);
        	}
        }
        
    }
}
