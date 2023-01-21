class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;

        boolean result1 = -50000 <= num1 &&  num1 <= 50000;
        boolean result2 = -50000 <= num2 &&  num2 <= 50000;

        if(!result1 && !result2)
            return answer;

        answer = num1-num2;
        return answer;
    }
}