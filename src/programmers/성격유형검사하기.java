package programmers;

public class 성격유형검사하기 {
	public String solution(String[] survey, int[] choices) {
        String result = "";
		int[] scores = new int[8];
		String[] cha = { "R", "T", "C", "F", "J", "M", "A", "N" };
		for (int k = 0; k < survey.length; k++) {
			int x = 0;
			String value = "";
			if (choices[k] - 4 > 0) {
				x = choices[k] - 4;
				value = survey[k].substring(1);
			} else {
				x = Math.abs(choices[k] - 4);
				value = survey[k].substring(0, 1);
			}
			for (int i = 0; i < cha.length; i++) {
				if (cha[i].equals(value)) {
					scores[i] += x;
				}
				scores[i]+=(cha[i].equals(value))?x:0;
			}
		}
		for (int i = 0; i < scores.length; i++) {
			result += (i%2==0)?((scores[i]>=scores[i+1])?cha[i]:cha[i+1]):"";
		}
        return result;
    }
}
