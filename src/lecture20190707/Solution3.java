package lecture20190707;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        if (arr.length - 1 == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[arr.length - 1];
            int idx = 0;

            for (int num : arr) {
                if (num != min) {
                    answer[idx] = num;
                    idx++;
                }
            }
        }

        return answer;
    }
}




	
	


