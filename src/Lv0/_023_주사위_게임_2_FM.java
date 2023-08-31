package Lv0;

public class _023_주사위_게임_2_FM {
	/*
		1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 
		세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
		세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
		세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
		세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
		세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
	*/
	public static void main(String[] args) {
		System.out.println(solution(4, 4, 4));
	}
	public static int solution(int a, int b, int c) {
		 int answer = 1;

	        int count = 1;
	        if(a == b || a == c || b == c) {
	            count++;
	        }

	        if(a == b && b == c) {
	            count++;
	        }

	        for(int i = 1; i <= count; i++) {
	            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
	        }

	        return answer;
	    }

	    private static int pow(int a, int b) {
	        if(b == 0) return 1;
	        return a * pow(a, b-1);
	}
}