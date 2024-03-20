class Solution {
    public String solution(int[] food) {
        String answer = "";
		 String answer1 = "";
		 String answer2 = "";
		 int[] food2 = new int[food.length];
	        for (int i = 1; i < food.length; i++) {
	            if(food[i] % 2 != 0){
	                food[i] = food[i]-1;
	            }
	        }
	        for (int i = 1; i < food.length; i++) {
	            food2[i] = food[i]/2; 
	        }
	        
	        for(int i = 1; i< food.length; i++) {
	            if (food2[i]>=1){
	                for(int j = 1; j <= food2[i]; j++){
	                    answer1 += String.valueOf(i);
	                }
	            }
	        }
	        for(int i = answer1.length()-1; i >= 0; i--) {
	        	answer2 = answer2 + answer1.substring(i, i+1);
	        	
	        }
	        
	        
	        answer = answer1 + 0 + answer2;
	        return answer;
    }
}