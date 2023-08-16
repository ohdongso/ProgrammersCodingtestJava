package Lv0;

import java.util.Arrays;

public class _013_문자열_곱하기_FM {
	/*
		문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 
		문자열을 return 하는 solution 함수를 작성해 주세요.
	*/ 
	public static void main(String[] args) {
		solution("string", 3);
	}
	
	public static String solution(String my_string, int k) {
		StringBuilder sb = new StringBuilder();
        for (int i=0; i<k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
	}
}