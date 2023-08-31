package Lv0;

public class _023_주사위_게임_2_dongso {
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
		int answer = 0;
		
		// 3개가 모두 같을 경우.
		if(a == b && b == c) { 
			answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
		
		// 3개가 전부 다를 경우
		} else if (a != b && a != c && b != c && c != b) {
			answer = a + b + c;
		
		// 2개가 같고 하나가 다를 경우
		} else {
			answer = (a + b + c) * (a * a + b * b + c * c);
		}
		
		/*
		if((a == b && a != c) || (a == c && a != b) || (b == a && b != c) 
		|| (b == c && b != a) || (c == a && c != b) || (c == b && c != a)) {			
		}
		*/
		
        return answer;
	}
}