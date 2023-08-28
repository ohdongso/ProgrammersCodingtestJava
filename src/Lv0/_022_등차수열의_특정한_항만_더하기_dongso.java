package Lv0;

public class _022_등차수열의_특정한_항만_더하기_dongso {
	/*
		두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
		첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
		이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
	*/
	public static void main(String[] args) {
		boolean[] included = {false, false, false, true, false, false, false};
		System.out.println(solution(7, 1, included));
	}
	public static int solution(int a, int d, boolean[] included) {
		 int answer = 0;
		 int includedLength = included.length;
		 
		 if((a >= 1 && a <= 100) && (d >= 1 && d <= 100) && (includedLength <= 100)) {
			 int sequence = a;

			 for(boolean flag : included) {
				 if(flag == true) answer += sequence;
				 sequence += d;
			 }
		 }
		 
	     return answer;
	}
}