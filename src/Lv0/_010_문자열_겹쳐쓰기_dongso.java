package Lv0;

public class _010_문자열_겹쳐쓰기_dongso {
	/*
		문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
		문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
		문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		subString() 함수 사용방법
		substring(1, 3) 을 입력하면 인덱스가 1부터 3이전까지 글자를 자르게 되는데 B부터 C까지 잘라서 "BC"가 리턴이 된다.
		==> beginIndex위치에서 시작하여 endIndex 전 위치까지의 값을 리턴한다.
		substring(5) 를 입력하면 인덱스 5부터 문자열 끝까지 잘라서 "3de"가 리턴된다.
		
		StringBuffer 클래스에서는 특정 위치의 문자열을 다른 문자열로 변경하는 replace 함수를 제공합니다.
		매개인자는 시작과 끝 위치와 대체 문자열이며 반환값은 StringBuffer 입니다.
		시작 인덱스부터 시작해서 끝 전 인덱스까지의 문자열을 치환합니다.
	*/
	    
	public static void main(String[] args) {
		// System.out.println(solution("He11oWor1d", "lloWorl", 2));
		// System.out.println(solution("Program29b8UYP", "merS123", 7));
	}
	
    public static String solution(String my_string, String overwrite_string, int s) {
    	StringBuffer sb = new StringBuffer();
    	sb.append(my_string);
        int overwrite_string_length = overwrite_string.length(); // 치환해야할 문자열 길이
        sb.replace(s, s + overwrite_string_length, overwrite_string); // 원본문자열에서 수정되어야할 문자열 치환
        String answer = sb.toString();
        return answer;
    }
}