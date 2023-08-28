package Lv0;

public class _021_코드_처리하기_dongso {
	/*
		문자열 code가 주어집니다.
		code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
		
		mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
		
		mode가 0일 때
		code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
		code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
		mode가 1일 때
		code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
		code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
		문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
		
		단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
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