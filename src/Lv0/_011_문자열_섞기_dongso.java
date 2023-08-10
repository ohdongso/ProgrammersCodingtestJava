package Lv0;

public class _011_문자열_섞기_dongso {
	/*
		길이가 같은 두 문자열 str1과 str2가 주어집니다.
		두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 
		만들어 return 하는 solution 함수를 완성해 주세요.
	*/
	    
	public static void main(String[] args) {
		solution("aaaaa", "bbbbb");
	}
	
	public static String solution(String str1, String str2) {
		String answer = "";
		int str1Length = str1.length();
		int str2Length = str2.length();		
		
		if(str1Length == str2Length && (str1Length >= 1 && str1Length <= 10) 
		&& (str2Length >= 1 && str2Length <= 10)) {
			for (int i = 0; i < str1Length; i++) {
				answer += str1.charAt(i);
				answer += str2.charAt(i);
			}
		}

		return answer;
	}
}