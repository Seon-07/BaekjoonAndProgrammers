class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
		if (n != 1) {
			int b = (n % 2 == 0) ? n / 2 : (n - 1) / 2;
			if (n % 2 != 0) {
				arr[b][b] = n * n;
			} else {
				arr[b][b - 1] = n * n;
			}
			int startNum = 1;
			int start = 0;
			for (int k = 0; k < b; k++) {
				int row = start;
				int col = start;
				int end = (start + n - 1);
				if (n != 1) {
					for (int i = startNum; i < (n * 4 - 4) + startNum; i++) {
						if (row == start && col < end) {
							arr[row][col++] = i;

						} else if (row < end && col == end) {
							arr[row++][col] = i;

						} else if (row == end && col > start) {
							arr[row][col--] = i;

						} else if (row >= start && col == start) {
							arr[row--][col] = i;
						}
					}
				}
				n -= 2;
				start++;
				startNum = arr[start][start - 1] + 1;
			}
		} else {
			arr[0][0] = 1;
		}
        return arr;
    }
}