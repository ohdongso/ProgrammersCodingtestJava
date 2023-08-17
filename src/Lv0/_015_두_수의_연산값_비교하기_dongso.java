package Lv0;

public class _015_두_수의_연산값_비교하기_dongso {
	/*
		연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
		
		12 ⊕ 3 = 123
		3 ⊕ 12 = 312
		양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
		
		단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
	*/
	public static void main(String[] args) {
		System.out.println(solution(2, 91));
	}
	
	public static int solution(int a, int b) {
		int answer = 0;
		if((a >= 1 && a < 10000) && (b >= 1 && b < 10000)) {
        	String connectNumber1 = a + "" + b;
        	String connectNumber2 = (2 * a * b) + "";
        	
        	int connectNumber3 = Integer.parseInt(connectNumber1);
        	int connectNumber4 = Integer.parseInt(connectNumber2);
        	
        	if (connectNumber3 >= connectNumber4) {
        		answer = connectNumber3;
        	} else {
        		answer = connectNumber4;
        	}
        }
		
        return answer;
	}
}