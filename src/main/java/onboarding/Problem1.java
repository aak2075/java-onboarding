package onboarding;

import java.util.List;

class Problem1 {
    /*
    * 다음의 기능을 하는 메서드를 구현.
    * 1. 각 자리 숫자를 더하는 메서드 sumValue
    * 2. 각 자리 숫자를 곱하는 메서드 mulValue
    * 3. 왼쪽 페이지와 오른쪽 페이지의 각 자리 숫자를 더하고 곱하고 비교하여 가장 큰수를 리턴하는 메서드 getMaxValue
    * 4. 점수를 비교하여 승자를 정하는 메서드 compare
    * */
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    // 각 자리 숫자를 더하는 메서드
    int sumValue(int value) {
        int res = (value % 10) + (value % 100 / 10) + (value / 100);
        return res;
    }


}