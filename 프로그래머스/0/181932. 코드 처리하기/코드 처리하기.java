class Solution {
    public String solution(String code) {
       String[] codeArr = new String[code.length()];
		int mode = 0;
		String ret = "";
		for(int i = 0; i < code.length(); i++) {
			codeArr[i] = code.substring(i,i+1);
		}
		for(int k = 0; k < codeArr.length; k++) {
			if(codeArr[k].equals("1")) {
				if(mode == 1) {
					mode = 0;
				}else {
					mode = 1;
				}
			}else {
				if(mode == 1) {
					if(k % 2 != 0) {
						ret += codeArr[k];
					}
				}else {
					if(k % 2 == 0) {
						ret += codeArr[k];
					}
				}
			}
		}
        if(ret.length() == 0){
            ret = "EMPTY";
        }
        return ret;
    }
}