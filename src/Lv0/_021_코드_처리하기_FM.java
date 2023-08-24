package Lv0;

public class _021_코드_처리하기_FM {
	/*
	
	
	*/
	public static void main(String[] args) {
		System.out.println(solution(-4, 7, false));
	}
	public static int solution(int a, int b, boolean flag) {
		int answer = 0;
		
		if((a >= -1000 && a <= 1000) && (b >= -1000 && b <= 1000)) {
			answer = flag == true ? a + b : a - b;
		}
        
        return answer;
	}
}