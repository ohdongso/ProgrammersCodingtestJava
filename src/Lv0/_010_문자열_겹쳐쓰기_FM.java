package Lv0;

public class _010_문자열_겹쳐쓰기_FM {
	/*
		문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
		문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
		문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    */
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
	}
	    public static String solution(String my_string, String overwrite_string, int s) {
	        String before = my_string.substring(0, s); // index0부터 2글자를 잘라낸다.
	        System.out.println("before : " + before);
	        String after = my_string.substring(s + overwrite_string.length()); // index 2+7 = 9부터 끝까지 짤라낸다.
	        System.out.println("after : " + after);
	        return before + overwrite_string + after; // 치환해야할 문자열을 제외한 (앞, 뒤)를 잘라내고 마지막에 친환해야할 문자열을 합쳐서 출력한다.
	    }
	    /*
		    String answer = my_string.substring(0, s) + overwrite_string;
	
	        if(my_string.length() > answer.length()) {
	            answer += my_string.substring(answer.length());
	        }
	        return answer;
	    */
}
