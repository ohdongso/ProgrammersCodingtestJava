package Lv0;

public class _021_코드_처리하기_dongso {
	/*
		code를 하나씩 읽어야 한다.
		mode 시작은 0이다.
		code가 빈문자열이면 "EMPTY"를 리턴한다.
		
		mode ==> 0
		
		
		mode ==> 1
		
		
	
	*/
	public static void main(String[] args) {
		System.out.println(solution("abc1abc1abc"));
	}
	public static String solution(String code) {
		String answer = "";
		int codeLength = code.length();
		
		if(1 <= codeLength && 100000 >= codeLength) {
			int mode = 0;
			char[] codeArray = code.toCharArray();
			
			for(int i = 0; i < codeLength; i++) {
				if(mode == 0) {
					if(codeArray[i] != '1' && i % 2 == 0) {
						answer += codeArray[i];
					} else if(codeArray[i] == '1') {
						mode = 1;
					}				
				} else {
					if(codeArray[i] != '1' && i % 2 == 1) {
						answer += codeArray[i];
					} else if(codeArray[i] == '1') {
						mode = 0;
					}
				}
			} // for문 끝.
			
			if(answer == "") answer = "EMPTY";
			
		} // if문 끝.
        return answer;
	}
}